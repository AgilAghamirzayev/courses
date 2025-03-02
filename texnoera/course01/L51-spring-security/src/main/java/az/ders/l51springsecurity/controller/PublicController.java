package az.ders.l51springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

  @GetMapping
  public String userEndpoint() {
    return "Public Access - No authentication required!";
  }

}