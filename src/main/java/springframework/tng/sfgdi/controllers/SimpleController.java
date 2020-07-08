package springframework.tng.sfgdi.controllers;


import org.springframework.stereotype.Controller;

import springframework.tng.sfgdi.services.GreetingService;

@Controller
public class SimpleController {
	
	
	private final GreetingService greetingService;
	
	public SimpleController(GreetingService greetingService) { //without no Qualifier here then Srping is going to find @Primary bean from the SimpleGreetingService
		this.greetingService = greetingService;
	}

	public String SayHello() {
		return greetingService.sayGreeting();
	}
}
