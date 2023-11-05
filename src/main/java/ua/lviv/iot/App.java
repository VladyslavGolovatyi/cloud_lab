package ua.lviv.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("ua.lviv.iot.domain") // Package containing entities
@EnableJpaRepositories(basePackages = {"ua.lviv.iot.repository", "ua.lviv.iot.domain", "ua.lviv.iot.config"})
@ComponentScan(basePackages = {"ua.lviv.iot.config"})
public class App{

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
