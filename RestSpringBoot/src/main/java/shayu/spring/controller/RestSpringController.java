package shayu.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSpringController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot with Rest Service.";
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from Spring Boot with Rest Service.";
	}
}
