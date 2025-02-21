package az.ders.l48feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class L48FeignApplication {

  public static void main(String[] args) {
    SpringApplication.run(L48FeignApplication.class, args);
  }

}
