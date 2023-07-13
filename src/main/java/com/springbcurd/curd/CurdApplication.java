package com.springbcurd.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class CurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdApplication.class, args);
	}
	   @Bean
	   public RestTemplate getRestTemplate() 
	 {
	      return new RestTemplate();
	 }
	   
}
