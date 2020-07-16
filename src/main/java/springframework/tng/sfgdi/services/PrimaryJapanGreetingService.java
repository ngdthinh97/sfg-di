package springframework.tng.sfgdi.services;



public class PrimaryJapanGreetingService implements GreetingService{
	GreetingRepository greetingRepository;

	public PrimaryJapanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return greetingRepository.getJapanGreeting();
	}
}
