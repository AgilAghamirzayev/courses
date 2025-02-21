package az.ders.l48feign.client.request;

import java.math.BigDecimal;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RateRequest {

  private String date;
  private String base;
  @ToString.Exclude
  private Map<String, BigDecimal> rates;

}
