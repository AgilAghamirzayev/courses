package az.ders.l45liquibaseschedulerasync.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class NotificationService {

  @Async
  public void sendNotification(String email) {
    log.info("Sending notification to {}", email);

    try {
      Thread.sleep(5000);  // Simulating delay (e.g., email sending process)
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    log.info("Notification sent to {}", email);
  }

}