package az.ders.l47config;

import az.ders.l47config.properties.DatabaseProperties;
import az.ders.l47config.properties.CommonProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@Profile("dev")
@RequiredArgsConstructor
public class CashbackService {

  @Value("${flag.umico.enabled}")
  private Boolean isUmicoEnabled;

  private final DatabaseProperties databaseProperties;
  private final CommonProperties commonProperties;

  public double calculateCashback() {
    double umicoAmount = 0;
    if (isUmicoEnabled) {
       log.info("Using Umico cashback amount: {}", isUmicoEnabled);
       umicoAmount = getUmicoAmount();
    }

    return (10 * 0.05) + umicoAmount;
  }

  public double getUmicoAmount() {
    return Math.round(1 * 1.05) / 100.0;
  }

  @Scheduled(fixedDelayString = "${schedule.umico.delay}")
  public void isUmicoEnabled() {
    log.info(commonProperties.getSupportedLanguages());
    log.info(databaseProperties);
    log.info(commonProperties.getEmployees());
    log.info(commonProperties.getDatabaseConfig());
  }

}
