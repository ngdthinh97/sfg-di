package springframework.tng.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springframework.tng.sfgdi.controllers.SimpleController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		SimpleController mController = (SimpleController) ctx.getBean("simpleController");
		
		System.out.println(mController.SayHello());
		
	}

}
