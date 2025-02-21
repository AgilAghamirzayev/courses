package az.ders.l47config.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component
@ConfigurationProperties(prefix = "app.database-config")
public class DatabaseProperties {

  private String url;
  private String username;
  private String password;

}
