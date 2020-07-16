package springframework.tng.sfgdi.services;

public class PrimaryChinaGreetingService implements GreetingService{
	GreetingRepository greetingRepository;

	public PrimaryChinaGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return greetingRepository.getChinaGreeting();
	}
}
