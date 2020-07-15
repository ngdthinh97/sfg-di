package springframework.tng.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import springframework.tng.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyGreetingService") // Qualifier is going to give Spring a hint as to which bean you want to have injected 
	@Autowired
	GreetingService greatingServices;
	
	public String getGreeting() {
		return greatingServices.sayGreeting();
	}
}
