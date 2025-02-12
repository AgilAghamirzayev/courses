package az.ders.l44middle.service;

import az.ders.l44middle.entity.User;
import az.ders.l44middle.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

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