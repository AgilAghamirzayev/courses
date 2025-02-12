package az.ders.l44middle.controller;

import az.ders.l44middle.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bank")
public class BankController {

    private final BankService bankService;

    @PostMapping("/transfer")
    public String transferMoney(@RequestParam String fromAccount,
                                @RequestParam String toAccount,
                                @RequestParam BigDecimal amount) throws Exception {
        bankService.transferMoney(fromAccount, toAccount, amount);
        return "Transfer successful!";
    }
}