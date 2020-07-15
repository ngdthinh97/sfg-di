package springframework.tng.services;

import org.springframework.stereotype.Service;

@Service // Anotation @Service which tells spring that is a spring managed component to bring it into the spring context
public class ConstructorGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "hello from manual - Constructor";
	}
}
