package neil.com.converter.configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import neil.com.converter.service.ConverterService;

@Profile("test")
@Configuration
public class ConversionTestConfiguration {

	@Bean
	@Primary
	public ConverterService converterService() {
		return Mockito.mock(ConverterService.class);
	}
}