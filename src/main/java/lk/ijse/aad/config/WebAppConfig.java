package lk.ijse.aad.config;

import lk.ijse.aad.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad")
@EnableWebMvc
public class WebAppConfig {

    public WebAppConfig(){
        System.out.println("webAppConfig Initialized");
    }
}
