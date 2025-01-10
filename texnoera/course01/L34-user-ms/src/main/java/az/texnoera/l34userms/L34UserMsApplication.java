package az.texnoera.l34userms;

import az.texnoera.l34userms.scopes.PrototypeBean;
import az.texnoera.l34userms.scopes.RequestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class L34UserMsApplication {

  public static void main(String[] args) {
    var ac = SpringApplication.run(L34UserMsApplication.class, args);

    var p1 = ac.getBean("prototypeBean", PrototypeBean.class);
    var p2 = ac.getBean("prototypeBean", PrototypeBean.class);

    System.out.println(p1.getInstanceId());
    System.out.println(p2.getInstanceId());

//    var r1 = ac.getBean("requestBean", RequestBean.class);
//    var r2 = ac.getBean("requestBean", RequestBean.class);
//
//    System.out.println(r1.getInstanceId());
//    System.out.println(r2.getInstanceId());
  }

}
