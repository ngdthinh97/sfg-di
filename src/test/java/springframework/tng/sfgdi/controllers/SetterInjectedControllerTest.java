package springframework.tng.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;  

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import springframework.tng.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {
	SetterInjectedController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
