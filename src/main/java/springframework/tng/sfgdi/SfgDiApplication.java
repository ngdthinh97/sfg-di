package springframework.tng.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springframework.tng.sfgdi.controllers.ConstructorInjectedController;
import springframework.tng.sfgdi.controllers.PropertyInjectedController;
import springframework.tng.sfgdi.controllers.SetterInjectedController;
import springframework.tng.sfgdi.controllers.SimpleController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		SimpleController mController = (SimpleController) ctx.getBean("simpleController");
		System.out.println(mController.SayHello());
		
		System.out.println("---------------------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("---------------------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("---------------------- Constructor");	
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
