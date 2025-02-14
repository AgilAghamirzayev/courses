package az.ders.l45liquibaseschedulerasync.scheduler;

import java.time.LocalDateTime;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerExamples {

//  @Scheduled(fixedRateString = "2s") // Runs every 5 seconds
//  @SneakyThrows
//  public void runTask1() {
//    Thread.sleep(5000);
//    System.out.println("Fixed Rate Task 1 - " + LocalDateTime.now());
//  }
//
//  @Scheduled(fixedRateString = "2s") // Runs every 5 seconds
//  public void runTask2() {
//    System.out.println("Fixed Rate Task 2 - " + LocalDateTime.now());
//  }

//  @Scheduled(fixedDelayString= "5s") // Runs 5 seconds after the last execution finishes
//  @SneakyThrows
//  public void runTask2() {
//    Thread.sleep(4000);
//    System.out.println("Fixed Delay Task - " + LocalDateTime.now());
//  }

  // Runs 10 seconds after starting, then runs every 5 seconds
//  @Scheduled(initialDelay = 10000, fixedDelay = 5000)
//  public void runTask3() {
//    System.out.println("Initial Delay and Fixed Delay Task - " + LocalDateTime.now());
//  }

//  @Scheduled(cron = "")
//  public void runTask3() {
//    System.out.println("Initial Delay and Fixed Delay Task - " + LocalDateTime.now());
//  }

}

// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/support/CronExpression.html