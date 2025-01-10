package az.texnoera.userms.service;

import az.texnoera.userms.entity.User;
import az.texnoera.userms.repository.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

  public User getUsersById(Long id) {
    return userRepository.findAll().stream()
        .filter(user -> user.id().equals(id))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("User not found"));
  }

}
