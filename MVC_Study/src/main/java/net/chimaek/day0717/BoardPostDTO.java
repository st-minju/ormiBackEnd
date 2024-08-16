package net.chimaek.day0717;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BoardPostDTO {
  private Long id;
  private String title;
  private String content;
  private String author;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private List<CommentDTO> comments;
}
