package springframework.tng.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Controller;

import springframework.tng.services.GreetingService;

@Controller // this controller is control 2 language EN and VN , so there have a confict here. we have to config it in Profiles(application.properties)
public class l18nController {
	private final GreetingService greetingService;

	public l18nController(@Qualifier("l18nService") GreetingService greetingService) {  // Neu o day khong @Qualifier thi mac dinh Spring se di tim Service nao co @Primary bean de DI 
		this.greetingService = greetingService;
	}
	
	public String rLanguage() {
		return greetingService.sayGreeting();
	}
	
}
