package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MyConfiguration.class);
		ctx.refresh();

		MyBean mb1 = ctx.getBean(MyBean.class);

		MyBean mb2 = ctx.getBean(MyBean.class);
		System.out.println(mb1 == mb2);
		ctx.close();
	}

}
