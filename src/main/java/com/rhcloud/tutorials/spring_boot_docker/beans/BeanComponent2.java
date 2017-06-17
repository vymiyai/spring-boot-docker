package com.rhcloud.tutorials.spring_boot_docker.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanComponent2 implements IBeanComponent {

	@Override
	public String execute() {

		return "I'm bean 2.";
	}

}
