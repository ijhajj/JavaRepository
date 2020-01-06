package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class JavaConfig {
	@Bean
	public Coach gulidandaCoach() {
		return new GulidandaCoach();
	}

}
