package springframework.tng.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import springframework.tng.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	PropertyInjectedController controller;	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new PropertyInjectedController();
		controller.greatingServices = new GreetingServiceImpl();
		
	}

	@Test
	void testGetGreeting() {
		String hello = controller.getGreeting();
		System.out.println(hello);
	}

}
