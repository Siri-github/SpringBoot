 package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.entity.Coder;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstSpringBootApplication.class, args);
		
		System.out.println("Welcome to Spring Boot");
		
		Coder c1 = (Coder) ctx.getBean("coder");
		c1.setCid(102);
		c1.setCname("Mina");
		c1.setTech("Java");
		
		System.out.println(c1);
		System.out.println(c1.hashCode());
		
		Coder c2 = (Coder) ctx.getBean("coder");
		c1.setCid(103);
		c1.setCname("Pia");
		c1.setTech("JavaFS");
		
		System.out.println(c2);
		System.out.println(c2.hashCode());
		
	}

}
