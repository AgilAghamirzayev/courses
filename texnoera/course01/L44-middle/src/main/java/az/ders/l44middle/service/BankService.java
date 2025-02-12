package az.ders.l44middle.service;

import static az.ders.l44middle.exception.constants.ExceptionConstants.INSUFFICIENT_FUNDS_EXCEPTION;
import static az.ders.l44middle.exception.constants.ExceptionConstants.INVALID_AMOUNT_EXCEPTION;
import static az.ders.l44middle.exception.constants.ExceptionConstants.NOT_FOUND_EXCEPTION;

import az.ders.l44middle.entity.Account;
import az.ders.l44middle.exception.AppException;
import az.ders.l44middle.repository.AccountRepository;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
@RequiredArgsConstructor
public class BankService {

  private final AccountRepository accountRepository;

  @Transactional(isolation = Isolation.SERIALIZABLE)
  public void transferMoney(String fromAccount, String toAccount, BigDecimal amount) {
    if (amount.compareTo(BigDecimal.ZERO) <= 0) {
      throw new AppException(INVALID_AMOUNT_EXCEPTION);
    }

    Account sender = accountRepository.findById(fromAccount).orElseThrow(() ->
        new AppException(NOT_FOUND_EXCEPTION, "Sender account not found: " + fromAccount));

    Account receiver = accountRepository.findById(toAccount).orElseThrow(() ->
        new AppException(NOT_FOUND_EXCEPTION, "Receiver account not found: " + toAccount));

    if (sender.getBalance().compareTo(amount) < 0) {
      throw new AppException(fromAccount, INSUFFICIENT_FUNDS_EXCEPTION);
    }

    sender.setBalance(sender.getBalance().subtract(amount));
    receiver.setBalance(receiver.getBalance().add(amount));

    accountRepository.save(sender);
    accountRepository.save(receiver);

    log.info("Transferred {} from {} to {}", amount, fromAccount, toAccount);
  }

}