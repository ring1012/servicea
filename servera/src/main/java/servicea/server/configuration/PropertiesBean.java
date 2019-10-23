package servicea.server.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuan@focusmedia.cn
 * @date 2019/10/22
 */
@Configuration
@ConfigurationProperties(prefix = "greeting")
public class PropertiesBean {
    private String message = "a message that can be changed live";

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
