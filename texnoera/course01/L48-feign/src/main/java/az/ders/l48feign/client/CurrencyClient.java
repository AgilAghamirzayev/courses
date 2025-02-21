package az.ders.l48feign.client;

import az.ders.l48feign.client.request.RateRequest;
import az.ders.l48feign.config.CustomFeignErrorDecoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "rate-service",
    url = "${url.currency_exchange}",
    configuration = CustomFeignErrorDecoder.class
)
public interface CurrencyClient {

  @GetMapping(value = "/v2.0/rates/latest", consumes = "application/json")
  RateRequest getExchangeRate(@RequestParam String apikey);

}
