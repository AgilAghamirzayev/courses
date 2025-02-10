package az.ders.l43jpa.controller;

import az.ders.l43jpa.entity.UserDetails;
import az.ders.l43jpa.service.UserDetailsService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserDetailsController {

  private final UserDetailsService userDetailsService;

  @GetMapping
  public List<UserDetails> getUsers() {
    return userDetailsService.getUsers();
  }

}
