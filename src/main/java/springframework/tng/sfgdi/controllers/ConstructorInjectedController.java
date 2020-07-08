package springframework.tng.sfgdi.controllers;

import springframework.tng.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
	private final GreetingService greetingService;  // 1. tao 1 interface greetingService

	public ConstructorInjectedController(GreetingService greetingService) { //2. tao constructor-controller
		this.greetingService = greetingService; // 5. this.greetingService nhan method sayGreeting() co gia tri
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();  // 6. getGreeting duoc return medthod sayGreeting() co gia tri va duoc su dung.
	}
	
}
