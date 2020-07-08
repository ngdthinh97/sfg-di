package springframework.tng.sfgdi.controllers;

import springframework.tng.sfgdi.services.GreetingService;

public class PropertyInjectedController {
	GreetingService greatingServices;
	
	public String getGreeting() {
		return greatingServices.sayGreeting();
	}
}
