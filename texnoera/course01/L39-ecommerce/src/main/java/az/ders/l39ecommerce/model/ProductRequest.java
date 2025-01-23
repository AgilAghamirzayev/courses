package az.ders.l39ecommerce.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductRequest {

  private String name;
  private String description;
  private BigDecimal price;
  private Boolean active;
  private String imageUrl;

}
