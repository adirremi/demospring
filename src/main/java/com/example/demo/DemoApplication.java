package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8181 );
		SpringApplication.run(DemoApplication.class, args);
	}
@Override  
public void customize(ConfigurableEmbeddedServletContainer container)   
{  
container.setPort(8181);  
}  
}
