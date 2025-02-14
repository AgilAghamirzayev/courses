package az.ders.l45liquibaseschedulerasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class L45LiquibaseSchedulerAsyncApplication {

  public static void main(String[] args) {
    SpringApplication.run(L45LiquibaseSchedulerAsyncApplication.class, args);
  }

}
