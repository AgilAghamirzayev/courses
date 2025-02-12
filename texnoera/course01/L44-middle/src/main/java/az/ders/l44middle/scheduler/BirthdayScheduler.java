package az.ders.l44middle.scheduler;

import az.ders.l44middle.service.BirthdayNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BirthdayScheduler {

    private final BirthdayNotificationService notificationService;

    @Scheduled(cron = "0 0 8 * * ?")
    public void scheduleBirthdayNotifications() {
        System.out.println("🔔 Running birthday notification scheduler...");
        notificationService.sendBirthdayNotifications();
    }

}

