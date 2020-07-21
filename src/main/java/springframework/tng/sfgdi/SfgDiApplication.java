package springframework.tng.sfgdi;

import org.springframework.boot.SpringApplication;     
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import springframework.tng.sfgdi.controllers.ConstructorInjectedController;
import springframework.tng.sfgdi.controllers.PropertyInjectedController;
import springframework.tng.sfgdi.controllers.SetterInjectedController;
import springframework.tng.sfgdi.controllers.SimpleController;
import springframework.tng.sfgdi.examplebeans.FakeDataSource;
import springframework.tng.sfgdi.examplebeans.FakeJmsSource;

//@ComponentScan(basePackages = {"springframework.tng.services","springframework.tng.sfgdi"}) //componentScan {specifier base package , defaulf package}
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		
		FakeJmsSource fakeJmsSource = (FakeJmsSource) ctx.getBean(FakeJmsSource.class);
		System.out.println(fakeJmsSource.getJmsUser());
		
	}

}
