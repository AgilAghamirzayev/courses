package az.ders.l39ecommerce.controller;

import static az.ders.l39ecommerce.exception.constants.ExceptionConstants.NOT_EXIST_EXCEPTION;
import static az.ders.l39ecommerce.exception.constants.ExceptionConstants.NOT_FOUND_EXCEPTION;

import az.ders.l39ecommerce.exception.AppException;
import az.ders.l39ecommerce.model.validation.UserRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/users")
public class UserController {

  @PostMapping
  public void createUser(@Valid @RequestBody UserRequest userRequest) {
    log.info(userRequest);
  }

  @GetMapping
  public void getUser(@RequestParam String name) {
    if ("test".equals(name)) {
      throw new AppException(name, NOT_FOUND_EXCEPTION);
    }

    throw new AppException(NOT_EXIST_EXCEPTION, "gvhbdejfnvkdbgfmh");
  }

}
