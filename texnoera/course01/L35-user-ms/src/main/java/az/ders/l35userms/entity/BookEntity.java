package az.ders.l35userms.entity;

import az.ders.l35userms.model.enums.BookCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(staticName = "of")
public class BookEntity {
  private Long id;
  private String name;
  private String author;
  private BookCategory category;
}
