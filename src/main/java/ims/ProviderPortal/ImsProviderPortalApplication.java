package ims.ProviderPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import ims.ProviderPortal.controllers.ProviderController;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackageClasses=ProviderController.class)
public class ImsProviderPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsProviderPortalApplication.class, args);
	}
}
