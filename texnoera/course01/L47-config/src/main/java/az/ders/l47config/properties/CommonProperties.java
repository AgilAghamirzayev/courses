package az.ders.l47config.properties;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "app")
public class CommonProperties {
  private List<String> supportedLanguages;
  private List<Employee> employees;
  private Map<String, String> databaseConfig;
}

record Employee (String name,
                 Integer age,
                 String department){}