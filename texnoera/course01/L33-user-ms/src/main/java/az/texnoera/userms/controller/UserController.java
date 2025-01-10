package az.texnoera.userms.controller;

import az.texnoera.userms.entity.User;
import az.texnoera.userms.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userService.getUsers();
  }

  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable Long id) {
    return userService.getUsersById(id);
  }

}
