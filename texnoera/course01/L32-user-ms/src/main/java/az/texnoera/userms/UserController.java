package az.texnoera.userms;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

  private static final List<User> users = List.of(
      new User(1L, "Ali"),
      new User(2L, "Rufat"),
      new User(3L, "Nasir"),
      new User(4L, "Murad"),
      new User(5L, "Latifa")
  );

  @GetMapping("/users")
  public List<User> getUsers() {
    return users;
  }

  @GetMapping("/users/{id}")
  public User getUsers(@PathVariable Long id) {
    return users.stream()
         .filter(user -> user.id().equals(id))
         .findFirst()
         .orElseThrow(() -> new RuntimeException("User not found"));
  }

}
