package az.ders.l35userms.model.request;

import az.ders.l35userms.model.enums.BookCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(staticName = "of")
public class BookRequest {
  private String name;
  private BookCategory category;
}
