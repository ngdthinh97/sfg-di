package springframework.tng.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("VN")
@Service("l18nService")
public class l18nVietnameseService implements GreetingService{
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Xin chao - VN";
	}
}
