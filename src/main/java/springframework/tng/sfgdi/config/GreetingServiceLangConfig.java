package springframework.tng.sfgdi.config;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import springframework.tng.sfgdi.services.GreetingRepository;
import springframework.tng.sfgdi.services.GreetingService;
import springframework.tng.sfgdi.services.GreetingServiceFactory;


@Configuration // 1. A hint config cua spring khi runtime spring se di tim class co @Configuration de tim Profile duoc truyen vao tu application.properties
public class GreetingServiceLangConfig {
	
	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) { // 3. Vi the can phai tao 1 Bean GreetingServiceFactory
		return new GreetingServiceFactory(greetingRepository); 
	}
	
	@Bean
	@Primary
	@Profile({"default"})
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){	// 2. Cac parameter cua bean nay can 1 bean-GreetingServiceFactory de truyen vao 
		return greetingServiceFactory.createGreetingService("vn");	// 4 . goi khi duoc tra vao method createGreetingServiec("1 String")
	}
	
	@Bean
	@Primary
	@Profile("en")
	GreetingService primaryEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {	// 2. Cac parameter cua bean nay can 1 bean-GreetingServiceFactory de truyen vao 
		return greetingServiceFactory.createGreetingService("en");
	}
	
	@Bean
	@Primary 	
	@Profile("vn")
	GreetingService primaryVietnamGreetingService (GreetingServiceFactory greetingServiceFactory) {	// 2. Cac parameter cua bean nay can 1 bean-GreetingServiceFactory de truyen vao 
		return greetingServiceFactory.createGreetingService("vn");
	}
	
	@Bean
	@Primary
	@Profile("cn")
	GreetingService primaryChinaGreetingService(GreetingServiceFactory greetingServiceFactory) {	// 2. Cac parameter cua bean nay can 1 bean-GreetingServiceFactory de truyen vao 
		return greetingServiceFactory.createGreetingService("cn");
	}
	
	@Bean
	@Primary
	@Profile("jp")
	GreetingService primaryJapanGreetingService(GreetingServiceFactory greetingServiceFactory) {	// 2. Cac parameter cua bean nay can 1 bean-GreetingServiceFactory de truyen vao 
		return greetingServiceFactory.createGreetingService("jp");
	}
	
	
}
