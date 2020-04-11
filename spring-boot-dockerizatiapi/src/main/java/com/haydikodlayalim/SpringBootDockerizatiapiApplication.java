package com.haydikodlayalim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootDockerizatiapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerizatiapiApplication.class, args);
	}

}
