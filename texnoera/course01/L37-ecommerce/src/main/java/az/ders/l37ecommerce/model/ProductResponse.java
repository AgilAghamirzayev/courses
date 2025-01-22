package az.ders.l37ecommerce.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductResponse {

  private Long id;
  private String name;
  private String description;
  private BigDecimal price;
  private Boolean active;
  private String imageUrl;

}
