package az.ders.l44middle.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerExamples {

  @Scheduled(fixedRate = 5000) // Runs every 5 seconds
  public void runTask1() {
    System.out.println("Fixed Rate Task - " + System.currentTimeMillis());
  }

  @Scheduled(fixedDelay = 5000) // Runs 5 seconds after the last execution finishes
  public void runTask2() {
    System.out.println("Fixed Delay Task - " + System.currentTimeMillis());
  }

  @Scheduled(initialDelay = 10000, fixedDelay = 5000) // Runs 10 seconds after starting, then runs every 5 seconds
  public void runTask3() {
    System.out.println("Initial Delay and Fixed Delay Task - " + System.currentTimeMillis());
  }

}


// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/support/CronExpression.html