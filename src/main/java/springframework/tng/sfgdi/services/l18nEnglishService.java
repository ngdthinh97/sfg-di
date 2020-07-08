package springframework.tng.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("l18nService")
public class l18nEnglishService implements GreetingService{
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello - EN";
	}
	
}
