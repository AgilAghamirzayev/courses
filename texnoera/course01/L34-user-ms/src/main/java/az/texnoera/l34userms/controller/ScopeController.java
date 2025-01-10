package az.texnoera.l34userms.controller;

import az.texnoera.l34userms.scopes.PrototypeBean;
import az.texnoera.l34userms.scopes.RequestBean;
import az.texnoera.l34userms.scopes.SessionBean;
import az.texnoera.l34userms.scopes.SingletonBean;
import java.awt.print.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/scopes")
public class ScopeController {

  private SingletonBean singletonBean;
  private final PrototypeBean prototypeBean;
  private final RequestBean requestBean;
  private final SessionBean sessionBean;

  @GetMapping("/test")
  public String testScopes() {
     new Book();
    return """
        Singleton Bean: %s<br>
        Prototype Bean: %s<br>
        Request Bean: %s<br>
        Session Bean: %s<br>
        """.formatted(
        singletonBean.getInstanceId(),
        prototypeBean.getInstanceId(),
        requestBean.getInstanceId(),
        sessionBean.getInstanceId()
    );
  }
}