package az.ders.l41jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class L41JpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(L41JpaApplication.class, args);
  }

}
