package az.ders.l51springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


  @GetMapping
  public String userEndpoint() {
    return "User Access - Welcome USER!";
  }

}
