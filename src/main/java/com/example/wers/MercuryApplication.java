package com.example.wers;

import com.example.wers.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class MercuryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercuryApplication.class, args);
	}

}
