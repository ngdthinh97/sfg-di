package springframework.tng.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "hello from manual - Setter";
	}
}
