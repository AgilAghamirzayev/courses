package az.ders.l45liquibaseschedulerasync.controller;

import az.ders.l45liquibaseschedulerasync.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

  private final PaymentService paymentService;

  @PostMapping("/pay")
  public void transferMoney() {
    paymentService.processPayment();
  }

}
