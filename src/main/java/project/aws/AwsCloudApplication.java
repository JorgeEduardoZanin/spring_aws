package project.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCloudApplication.class, args);
		System.out.println("Ola mundo!");
	}

}
