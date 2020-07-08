package springframework.tng.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"VN","default"}) // What i did is comment 1 line active in application.properties file like "#spring.profiles.active =VN" and i mark a default here right the @Profile anotation
@Service("l18nService")
public class l18nVietnameseService implements GreetingService{
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Xin chao - VN";
	}
}
