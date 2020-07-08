package springframework.tng.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SimpleController {
	
	public String SayHello() {
		System.out.println("Hello world");
		return "Saying from spring";
	}
}
