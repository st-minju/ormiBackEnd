package net.chimaek.day0717;

import java.time.LocalDateTime;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CommentDTO {
	private Long id;
	private String content;
	private String author;
	private LocalDateTime createdAt;
}
