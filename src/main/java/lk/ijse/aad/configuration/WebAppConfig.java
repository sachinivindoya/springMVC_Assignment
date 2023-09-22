package lk.ijse.aad.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad")
@EnableWebMvc
public class WebAppConfig {

    public WebAppConfig(){

        System.out.println("WebAppConfig : start");
    }
}
