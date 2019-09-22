package com.nano.integ.product.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Bean
    ApplicationRunner init(ProductRepository repository) {
        return args -> {
			Stream.of("National Bank-Checking", 
					  "National Bank-Saving", 
					  "Punjab Bank-Checking", 
					  "Punjab Bank-Saving").forEach(name -> {
                Product product = new Product();
                product.setName(name);
                repository.save(product);
            });
            repository.findAll().forEach(System.out::println);
        };
    }

}
