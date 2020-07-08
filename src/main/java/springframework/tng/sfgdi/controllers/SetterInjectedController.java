package springframework.tng.sfgdi.controllers;

import springframework.tng.sfgdi.services.GreetingService;

public class SetterInjectedController {
	GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
