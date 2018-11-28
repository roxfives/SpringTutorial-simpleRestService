package application;

import contoller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {GreetingController.class})
public class Main {
    public static void main(String args[]) {
        SpringApplication.run(Main.class, args);
    }
}
