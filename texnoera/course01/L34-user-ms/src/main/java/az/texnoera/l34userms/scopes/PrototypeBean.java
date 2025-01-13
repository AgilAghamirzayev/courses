package az.texnoera.l34userms.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class PrototypeBean {
    private final String instanceId;

    public PrototypeBean() {
        this.instanceId = "PrototypeBean-" + System.currentTimeMillis();
    }

    public String getInstanceId() {
        return instanceId;
    }
}