package springframework.tng.sfgdi.services;


import org.springframework.stereotype.Component;


@Component  // also can be a @Service too
public class GreetingRepositoryImpl implements GreetingRepository{

	@Override
	public String getEnglishGreeting() {
		// TODO Auto-generated method stub
		return "My name Thinh Nguyen";
	}

	@Override
	public String getVietnamGreeting() {
		// TODO Auto-generated method stub
		return "Ten toi la Thinh Nguyen";
	}

	@Override
	public String getChinaGreeting() {
		// TODO Auto-generated method stub
		return "asjwkkv Thinh Nguyen";
	}

	@Override
	public String getJapanGreeting() {
		// TODO Auto-generated method stub
		return "Ok ta shi Thinh Nguyen";
	}
	
}
