package az.texnoera.userms;

import az.texnoera.userms.a.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserMsApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext ac = SpringApplication.run(UserMsApplication.class, args);
//    ac.getBeanFactory().getBeanNamesIterator().forEachRemaining(System.out::println);

    Test test = ac.getBean("test1", Test.class);
    test.test();
  }

}
