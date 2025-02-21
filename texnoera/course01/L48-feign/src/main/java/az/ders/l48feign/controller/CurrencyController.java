package az.ders.l48feign.controller;

import az.ders.l48feign.client.request.RateRequest;
import az.ders.l48feign.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
@RequiredArgsConstructor
public class CurrencyController {

  private final CurrencyService currencyService;

  @GetMapping("/rate")
  public RateRequest getExchangeRate() {
    return currencyService.getExchangeRate();
  }

}
