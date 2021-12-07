package CaseStudy.FareMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FareMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FareMicroserviceApplication.class, args);
	}

}
