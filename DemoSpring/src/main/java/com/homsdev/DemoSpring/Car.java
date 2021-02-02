package com.homsdev.DemoSpring;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle {

	public void Drive() {
		System.out.println("this car is driven very well");
	}
}
