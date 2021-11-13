package org.entitylabs.config;

import org.entitylabs.config.Beans.Reader;
import org.entitylabs.config.Beans.Writer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Reader reader() {
		return new Reader();

	}

	@Bean
	public Writer writer() {
		return new Writer();
	}

}
