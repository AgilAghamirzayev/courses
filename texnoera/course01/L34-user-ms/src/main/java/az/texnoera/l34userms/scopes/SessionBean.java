package az.texnoera.l34userms.scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBean {
  private final String instanceId;

  public SessionBean() {
    this.instanceId = "SessionBean-" + System.currentTimeMillis();
  }

  public String getInstanceId() {
    return instanceId;
  }
}