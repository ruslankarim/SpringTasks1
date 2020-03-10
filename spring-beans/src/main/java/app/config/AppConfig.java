package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean
    public Dog getDog(){
        Dog dog = new Dog();
        return dog;
    }

    @Bean(name="timer")
    public Timer getTimer(){
        Timer timer = new Timer();
        return timer;
    }
}
