package net.chimaek.day0717;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BoardPostService {
	List<BoardPost> boardPosts = new ArrayList<>();
	private Long nextPostId = 1L;
	private Long nextCommentId = 1L;

	public BoardPostDTO createBoardPost(BoardPostDTO boardPostDTO) {
		BoardPost boardPost = convertToBoardPostEntity(boardPostDTO);
		boardPost.setId(nextPostId++);
		boardPost.setCreatedAt(LocalDateTime.now());
		boardPosts.add(boardPost);
		return convertToBoardPostDTO(boardPost);
	}

	public List<BoardPostDTO> getAllBoardPosts() {
		return boardPosts.stream()
			.map(this::convertToBoardPostDTO)
			.collect(Collectors.toList());
	}

	public BoardPostDTO getBoardPostDtoById(Long id) {
		log.info("룰루랄라 아이디 찾는 중~~~~");
		return boardPosts.stream()
			.filter(post -> post.getId().equals(id))
			.map(this::convertToBoardPostDTO)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당하는 아이디의 글을 찾을 수 없습니다."));

	}

	public void deleteBoardPost(Long id) {
		BoardPost boardPost = findBoardPostById(id);
		boardPosts.remove(boardPost);
		log.info("룰루 삭제 성공~~~");
	}

	private BoardPost findBoardPostById(Long id) {
		return boardPosts.stream()
			.filter(post -> post.getId().equals(id))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("해당하는 아이디의 글을 찾을 수 없습니다."));
	}

	public BoardPostDTO updateBoardPost(Long id, BoardPostDTO updateboardPostDTO) {
		BoardPost boardPost = findBoardPostById(id);
		boardPost.setTitle(updateboardPostDTO.getTitle());
		boardPost.setContent(updateboardPostDTO.getContent());
		boardPost.setUpdatedAt(LocalDateTime.now());
		return convertToBoardPostDTO(boardPost);
	}

	private static BoardPost convertToBoardPostEntity(BoardPostDTO boardPostDTO) {
		BoardPost boardPost = new BoardPost();

		boardPost.setTitle(boardPostDTO.getTitle());
		boardPost.setContent(boardPostDTO.getContent());
		boardPost.setAuthor(boardPostDTO.getAuthor());

		if(boardPostDTO.getComments() != null) {
			boardPostDTO.getComments().forEach(commentDTO -> {
				Comment comment = convertToCommentEntity(commentDTO);
				comment.setBoardPost(boardPost);
				boardPost.addComment(comment);
			});
		}
		return boardPost;
	}

	private static Comment convertToCommentEntity(CommentDTO commentDTO) {
		Comment comment = new Comment();
		comment.setId(commentDTO.getId());
		comment.setContent(commentDTO.getContent());
		comment.setAuthor(commentDTO.getAuthor());
		return comment;
	}

	private BoardPostDTO convertToBoardPostDTO(BoardPost boardPost) {
		BoardPostDTO boardPostDTO = new BoardPostDTO();
		boardPostDTO.setId(boardPost.getId());
		boardPostDTO.setTitle(boardPost.getTitle());
		boardPostDTO.setContent(boardPost.getContent());
		boardPostDTO.setAuthor(boardPost.getAuthor());
		boardPostDTO.setCreatedAt(boardPost.getCreatedAt());
		boardPostDTO.setUpdatedAt(boardPost.getUpdatedAt());

		if(boardPost.getComments() != null) {
			boardPostDTO.setComments(
				boardPost.getComments()
					.stream()
					.map(BoardPostService::convertToCommentDTO)
					.collect(Collectors.toList()));
		}
		return boardPostDTO;
	}

	private static CommentDTO convertToCommentDTO(Comment comment) {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setId(comment.getId());
		commentDTO.setContent(comment.getContent());
		commentDTO.setAuthor(comment.getAuthor());
		commentDTO.setCreatedAt(comment.getCreatedAt());
		return commentDTO;
	}

	public CommentDTO createComment(Long postId, CommentDTO createCommentDTO) {
		BoardPost boardPost = findBoardPostById(postId);
		Comment comment = convertToCommentEntity(createCommentDTO);
		comment.setId(nextCommentId++);
		comment.setCreatedAt(LocalDateTime.now());
		boardPost.addComment(comment);
		return convertToCommentDTO(comment);
	}

	public void deleteComment(Long postId, Long commentId) {
		BoardPost boardPost = findBoardPostById(postId);
		Comment comment = findCommentById(commentId, boardPost);
		boardPost.removeComment(comment);
	}

	private static Comment findCommentById(Long commentId, BoardPost boardPost) {
		return boardPost.getComments().stream()
			.filter(comment -> comment.getId().equals(commentId))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("댓글을 찾을 수 없습니다."));
	}
}
