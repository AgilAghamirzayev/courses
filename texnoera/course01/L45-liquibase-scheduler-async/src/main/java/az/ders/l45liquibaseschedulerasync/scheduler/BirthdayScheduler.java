package az.ders.l45liquibaseschedulerasync.scheduler;

import az.ders.l45liquibaseschedulerasync.service.BirthdayNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BirthdayScheduler {

    private final BirthdayNotificationService notificationService;

    @Scheduled(cron = "33 30 8 * * ?")
    public void scheduleBirthdayNotifications() {
        System.out.println("🔔 Running birthday notification scheduler...");
        notificationService.sendBirthdayNotifications();
    }

}

