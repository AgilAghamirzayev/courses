package az.ders.l39ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PagedRequest {
  private int page = 0;
  private int size = 10;
  private String sortBy = "id";
  private String sortDirection = "ASC";
}
