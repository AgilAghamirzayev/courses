package az.texnoera.l34userms.scopes;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    private final String instanceId;

    public SingletonBean() {
        this.instanceId = "SingletonBean-" + System.currentTimeMillis();
    }

    public String getInstanceId() {
        return instanceId;
    }
}