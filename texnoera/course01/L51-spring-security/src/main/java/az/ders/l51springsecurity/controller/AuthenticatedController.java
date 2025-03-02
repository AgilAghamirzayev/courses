package az.ders.l51springsecurity.controller;

import az.ders.l51springsecurity.model.UserRequest;
import az.ders.l51springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticatedController {

  private final UserService userService;

  @GetMapping
  public String userEndpoint() {
    return "Authenticated Access - Welcome Authenticated USER!";
  }


//  @PostMapping("/register")
//  public void register(@RequestBody UserRequest userRequest) {
//    userService.userRegister(userRequest);
//  }


  @PostMapping("/login")
  public void login(@RequestBody UserRequest userRequest) {
    userService.login(userRequest);
  }


}
