package springframework.tng.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springframework.tng.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	GreetingService greatingServices;
	
	public String getGreeting() {
		return greatingServices.sayGreeting();
	}
}
