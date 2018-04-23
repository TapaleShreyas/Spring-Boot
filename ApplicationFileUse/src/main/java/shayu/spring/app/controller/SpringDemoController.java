package shayu.spring.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {

	@RequestMapping("/")
	public String welcomeMessage() {
		return "Welcome to Spring Boot.";
	}
}
