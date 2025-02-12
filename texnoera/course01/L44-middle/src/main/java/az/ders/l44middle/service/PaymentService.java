package az.ders.l44middle.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//A transaction is a sequence of database operations that must be atomic (all succeed or none succeed).
//The four key properties of a transaction (ACID) are:
//    1.	Atomicity – All operations complete successfully or none of them are applied.
//    2.	Consistency – The database remains in a valid state before and after the transaction.
//    3.	Isolation – Concurrent transactions do not interfere with each other.
// 	  4.	Durability – Committed transactions are permanently saved.

@Log4j2
@Service
@RequiredArgsConstructor
public class PaymentService {

  private final NotificationService notificationService;

  @Transactional
  public void processPayment() {
    // Step 1: Deduct balance from user account
    deductBalance();

    // Step 2: Save transaction details
    saveTransaction();

    sentToMurad();

    notificationService.sendNotification("ali@gmail.com");

    // Step 3: Notify user
  }


  private void sentToMurad() {
  }

  private void deductBalance() {
    log.info("Deducting balance from user account");
  }

  private void saveTransaction() {
    log.info("START: Saving transaction details");

    log.info("END: Saving transaction details");
  }

}