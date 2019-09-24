package com.antonioazambuja.javapocs.feignpoc.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.antonioazambuja.javapocs.feignpoc.operation.FeignHttpClient;

import feign.Feign;
import feign.jackson.JacksonDecoder;

@Configuration
public class AppConfig {
	
	@Value("${github.url}")
	private String gitHubUrl;
	
	@Bean
	public FeignHttpClient feignHttpClient() {
		return Feign.builder()
				.decoder(new JacksonDecoder())
				.target(FeignHttpClient.class, gitHubUrl);
	}
	
}
