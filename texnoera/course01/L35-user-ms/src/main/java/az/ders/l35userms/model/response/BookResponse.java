package az.ders.l35userms.model.response;

import az.ders.l35userms.model.enums.BookCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(staticName = "of")
public class BookResponse {
  private Long id;
  private String name;
  private BookCategory category;
}
