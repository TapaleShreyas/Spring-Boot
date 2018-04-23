package shayu.springboot.rest.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = "shayu.springboot.rest.controller")
public class SpringRestController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot with Rest Service.";
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from Spring Boot with Rest Service.";
	}
}
