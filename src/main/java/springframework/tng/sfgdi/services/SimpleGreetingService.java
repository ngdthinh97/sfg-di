package springframework.tng.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary // there is the control which tell pring go ahead used this service
@Service
@Profile("sp")
public class SimpleGreetingService implements GreetingService{
	
	@Override
	public String sayGreeting() {
		return "hello from Primary Bean";
	}
}
