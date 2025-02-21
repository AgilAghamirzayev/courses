package az.ders.l48feign.service;

import az.ders.l48feign.client.CurrencyClient;
import az.ders.l48feign.client.request.RateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class CurrencyService {

  private final CurrencyClient currencyClient;

  @Value("${secret.rates.apikey}")
  private String apiKey;

  public RateRequest getExchangeRate() {
    RateRequest exchangeRate = currencyClient.getExchangeRate(apiKey);
    log.info("Received exchange rate: {}", exchangeRate);
    return exchangeRate;
  }

}
