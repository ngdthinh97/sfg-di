package springframework.tng.sfgdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import springframework.tng.sfgdi.examplebeans.FakeDataSource;
import springframework.tng.sfgdi.examplebeans.FakeJmsSource;

@Configuration
public class PropertyConfig {
	
	@Value("${tng.username}")
	String user;
	
	@Value("${tng.userpassword}")
	String password;
	
	@Value("${tng.dburl}")
	String url;
	
	@Value("${tng.jms.username}")
	String jmsuser;
	
	@Value("${tng.jms.userpassword}")
	String jmspassword;
	
	@Value("${tng.jms.dburl}")
	String jmsurl;
	
	
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	@Bean
	public FakeJmsSource fakeJmsSource() {
		FakeJmsSource fakeJmsSource = new FakeJmsSource();
		fakeJmsSource.setJmsUser(jmsuser);
		fakeJmsSource.setJmsPassword(jmspassword);
		fakeJmsSource.setJmsUrl(jmsurl);
		return fakeJmsSource;
	}
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	
}
