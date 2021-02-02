package com.homsdev.DemoSpring;

public class Engine {
	
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Engine [Brand=" + brand + "]";
	}
	
}
