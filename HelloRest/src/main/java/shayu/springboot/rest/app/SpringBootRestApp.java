package shayu.springboot.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "shayu.springboot.rest.controller")
public class SpringBootRestApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApp.class, args);
	}

}
