package springframework.tng.sfgdi.services;

public class PrimaryEnglishGreetingService implements GreetingService{
	
	GreetingRepository greetingRepository;
	
	public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) { // 9. Tao constructor de ben ngoai co the tra ve instance
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return greetingRepository.getEnglishGreeting();   // 10. Dependency injection - di tim service tuong uong de lay noi dung ve
	}
	
}
