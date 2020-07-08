package springframework.tng.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import springframework.tng.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;  // 1. tao 1 interface greetingService

	//@Autowired   in constructor khong can phai @autowired 
	// Qualifier is going to give Spring a hint as to which bean you want to have injected 
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) { //2. tao constructor-controller
		this.greetingService = greetingService; // 5. this.greetingService nhan method sayGreeting() co gia tri
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();  // 6. getGreeting duoc return medthod sayGreeting() co gia tri va duoc su dung.
	}
	
}
