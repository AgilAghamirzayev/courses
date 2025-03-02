package az.ders.l51springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @GetMapping
  public String userEndpoint() {
    return "Admin Access - Welcome ADMIN!";
  }

}


