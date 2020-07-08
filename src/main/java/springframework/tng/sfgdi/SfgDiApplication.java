package springframework.tng.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springframework.tng.sfgdi.controllers.ConstructorInjectedController;
import springframework.tng.sfgdi.controllers.PropertyInjectedController;
import springframework.tng.sfgdi.controllers.SetterInjectedController;
import springframework.tng.sfgdi.controllers.SimpleController;
import springframework.tng.sfgdi.controllers.l18nController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		l18nController l18nController = (l18nController) ctx.getBean("l18nController");
		System.out.println("---------------------- Using Language");
		System.out.println(l18nController.rLanguage());

		
		SimpleController mController = (SimpleController) ctx.getBean("simpleController");
		System.out.println("---------------------- Primary Bean");
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
