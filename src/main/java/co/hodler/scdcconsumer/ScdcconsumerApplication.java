package co.hodler.scdcconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ScdcconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScdcconsumerApplication.class, args);
	}
}
