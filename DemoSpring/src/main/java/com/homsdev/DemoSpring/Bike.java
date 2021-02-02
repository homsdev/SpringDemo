package com.homsdev.DemoSpring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle {

	public void Drive() {
		System.out.println("This bike is driven very well");
	}
}
