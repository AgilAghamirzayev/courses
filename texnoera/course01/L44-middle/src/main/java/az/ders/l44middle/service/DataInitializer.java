package az.ders.l44middle.service;

import az.ders.l44middle.entity.Account;
import az.ders.l44middle.repository.AccountRepository;
import jakarta.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class DataInitializer {

  private final AccountRepository accountRepository;

//  @PostConstruct
  public void run() {
    Account acc1 = Account.of("1", "Ali", new BigDecimal("1000"));
    Account acc2 = Account.of("2", "Murad", new BigDecimal("500"));

    accountRepository.saveAll(List.of(acc1, acc2));

    log.info("✅ Test accounts initialized");
  }
}