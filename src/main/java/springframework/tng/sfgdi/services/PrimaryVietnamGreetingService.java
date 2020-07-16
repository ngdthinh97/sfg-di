package springframework.tng.sfgdi.services;

public class PrimaryVietnamGreetingService implements GreetingService{
	
	GreetingRepository greetingRepository;

	public PrimaryVietnamGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return greetingRepository.getVietnamGreeting();
	}
}
