package springframework.tng.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // there is the control
@Service
public class SimpleGreetingService implements GreetingService{
	
	@Override
	public String sayGreeting() {
		return "hello from Primary Bean";
	}
}
