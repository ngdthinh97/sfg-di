package springframework.tng.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import springframework.tng.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller; // 3. khoi tao moi doi tuong controller
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());  // 4. controller di lay sayGreeting() da duoc implement dong thoi tra ve greetingService
	}
	
	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting()); // 7. junit test case thuc thi method getGreeting(SayGreeting())
	}

}
