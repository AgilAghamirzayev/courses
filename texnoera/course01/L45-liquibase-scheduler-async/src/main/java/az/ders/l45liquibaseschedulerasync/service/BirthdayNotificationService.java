package az.ders.l45liquibaseschedulerasync.service;

import az.ders.l45liquibaseschedulerasync.entity.User;
import az.ders.l45liquibaseschedulerasync.repository.UserRepository;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BirthdayNotificationService {

    private final UserRepository userRepository;

    public void sendBirthdayNotifications() {
        LocalDate today = LocalDate.now();
        List<User> birthdayUsers = userRepository.findUsersByBirthMonthAndDay(today.getMonthValue(), today.getDayOfMonth());

        for (User user : birthdayUsers) {
            sendEmail(user.getEmail(), user.getName());
        }
    }

    private void sendEmail(String email, String name) {
        System.out.println("🎉 Happy Birthday, " + name + "! 🎂 Notification sent to: " + email);
        // Here you can integrate an email service like JavaMailSender
    }
}