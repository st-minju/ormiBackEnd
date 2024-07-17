package net.chimaek.day0717;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberController {

	private List<Member> members = new ArrayList<Member>();
	private long nextId = 1L;

	@GetMapping
	public List<Member> getAllMembers() {
		return members;
	}

	@PostMapping
	public Member createMember(@RequestBody Member member) {
		member.setId(nextId++);
		members.add(member);
		return member;
	}

	@GetMapping("/{id}")
	public Member getMemberById(@PathVariable long id) {
		// return findMemberById(id);
		return members.stream()
			.filter(member -> member.getId() == id)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("뭐시여 이건. 에러여?"));
	}

	@PutMapping("/{id}")
	public Member updateMember(@PathVariable("id") long id, @RequestBody Member updateMember) {
		// Member member = findMemberById(id);
		Member member = getMemberById(id);
		member.setName(updateMember.getName());
		member.setEmail(updateMember.getEmail());

		return member;
	}

	@DeleteMapping("/{id}")
	public void deleteMember(@PathVariable("id") long id) {
		members.removeIf(member -> member.getId() == id);
	}


	private Member findMemberById(long id) {
		return members.stream()
			.filter(m -> m.getId() == id)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당 아이디의 멤버를 찾지 못했습니다."));
	}

}
