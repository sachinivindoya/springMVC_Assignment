package lk.ijse.aad.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
public class WebAppRootConfig {

    public WebAppRootConfig(){
        System.out.println("WebRootConfig initialized");
    }
}
