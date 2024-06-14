package be.faros.sandwich.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
public class SandwichApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SandwichApiApplication.class, args);
    }

}
