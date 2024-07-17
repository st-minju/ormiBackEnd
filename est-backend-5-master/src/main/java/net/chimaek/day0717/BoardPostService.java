package net.chimaek.day0717;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class BoardPostService {
	List<BoardPost> boardPosts = new ArrayList<>();
	private Long nextPostId = 1L;
	private Long nextCommentId = 1L;

	public BoardPostDTO createBoardPost(BoardPostDTO boardPostDTO) {
		BoardPost boardPost = converToBoardPostEntity(boardPostDTO);
	}

	private static BoardPost converToBoardPostEntity(BoardPostDTO boardPostDTO) {
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

	private static BoardPostDTO convertToBoardPostDTO(BoardPost boardPost) {
		BoardPostDTO boardPostDTO = new BoardPostDTO();
		boardPostDTO.setId(boardPost.getId());
		boardPostDTO.setTitle(boardPost.getTitle());
		boardPostDTO.setContent(boardPost.getContent());
		boardPostDTO.setAuthor(boardPost.getAuthor());
		boardPostDTO.setCreatedAt(boardPost.getCreatedAt());
		boardPostDTO.setUpdatedAt(boardPost.getUpdatedAt());

		if(boardPost.getComments() != null) {
			boardPost.setComments(
				boardPost.getComments()
					.stream()
					.map(this::convertToCommentDTO)
					.collect(Collectors.toList()));
		}
		return boardPostDTO;
	}
}
