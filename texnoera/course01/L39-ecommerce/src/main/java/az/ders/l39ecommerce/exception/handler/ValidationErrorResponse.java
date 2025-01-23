package az.ders.l39ecommerce.exception.handler;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ValidationErrorResponse {

  private String field;
  private String message;

}
