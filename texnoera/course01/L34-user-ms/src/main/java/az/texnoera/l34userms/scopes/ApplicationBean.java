package az.texnoera.l34userms.scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationBean {
    private final String instanceId;

    public ApplicationBean() {
        this.instanceId = "ApplicationBean-" + System.currentTimeMillis();
    }

    public String getInstanceId() {
        return instanceId;
    }
}