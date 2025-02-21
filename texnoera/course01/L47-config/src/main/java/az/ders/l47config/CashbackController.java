package az.ders.l47config;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cashback")
@RequiredArgsConstructor
public class CashbackController {

  private final CashbackService cashbackService;

  @GetMapping("/calculate")
  public double calculateCashback() {
    return cashbackService.calculateCashback();
  }

}
