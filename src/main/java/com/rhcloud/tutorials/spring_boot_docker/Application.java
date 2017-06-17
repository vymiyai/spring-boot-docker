package com.rhcloud.tutorials.spring_boot_docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.rhcloud.tutorials.spring_boot_docker")
@ComponentScan("com.rhcloud.tutorials.spring_boot_docker.beans")
@RestController
public class Application {

	private BeanComponent bc;

	@Autowired
	public void setBeanComponent(BeanComponent beanComponent) {
		this.bc = beanComponent;
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World " + bc.text;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}