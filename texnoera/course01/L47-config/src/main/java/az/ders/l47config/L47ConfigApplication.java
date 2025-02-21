package az.ders.l47config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class L47ConfigApplication {

  public static void main(String[] args) {
    SpringApplication.run(L47ConfigApplication.class, args);
  }

}
