package az.texnoera.l34userms.scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestBean {
  private final String instanceId;

  public RequestBean() {
    this.instanceId = "RequestBean-" + System.currentTimeMillis();
  }

  public String getInstanceId() {
    return instanceId;
  }
}