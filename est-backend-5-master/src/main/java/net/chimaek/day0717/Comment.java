package net.chimaek.day0717;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Comment {
  private Long id;
  private String content;
  private String author;
  private LocalDateTime createdAt;
  private BoardPost boardPost;
}
