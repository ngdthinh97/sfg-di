package springframework.tng.sfgdi.services; 
/*
 * 
 * 
 * */

public class GreetingServiceFactory {
	
	public GreetingRepository greetingRepository; // 5.	Tao moi 1 noi dung 
	
	public GreetingServiceFactory(GreetingRepository greetingRepository) { // 6. khai bao 1 contrucstor de co the duoc tra ve instance tu ben ngoai
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang) { // 7. tra ve 1 instance cua GreetingService su dung lai 1 phuong thuoc String cua GreetingService
		
		switch(lang){
			case "en":
				return new PrimaryEnglishGreetingService(greetingRepository);   // 8. khi duoc goi se tra ve new instance co noi dung duoc duoc DI vao` .
			case "vn":
				return new PrimaryVietnamGreetingService(greetingRepository);	// 8. khi duoc goi se tra ve new instance co noi dung duoc duoc DI vao` .
			case "cn":
				return new PrimaryChinaGreetingService(greetingRepository);		// 8. khi duoc goi se tra ve new instance co noi dung duoc duoc DI vao` .
			case "jp":
				return new PrimaryJapanGreetingService(greetingRepository);		// 8. khi duoc goi se tra ve new instance co noi dung duoc duoc DI vao` .
			default :
				return new PrimaryVietnamGreetingService(greetingRepository);	// 8. khi duoc goi se tra ve new instance co noi dung duoc duoc DI vao` .
		}
	}
	
}
