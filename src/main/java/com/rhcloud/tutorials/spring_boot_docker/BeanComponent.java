package com.rhcloud.tutorials.spring_boot_docker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rhcloud.tutorials.spring_boot_docker.beans.IBeanComponent;

@Component
public class BeanComponent {

	public String text = "";

	@Autowired
	void setBeanComponent1(List<IBeanComponent> beans) {
		for(IBeanComponent bc : beans)
			this.text = this.text + " " + bc.execute();
	}
}
