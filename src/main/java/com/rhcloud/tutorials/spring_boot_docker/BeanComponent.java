package com.rhcloud.tutorials.spring_boot_docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rhcloud.tutorials.spring_boot_docker.beans.BeanComponent1;

@Component
public class BeanComponent {

	public String text = "";

	@Autowired
	void setBeanComponent1(BeanComponent1 bc1) {
		this.text = bc1.execute();
	}
}
