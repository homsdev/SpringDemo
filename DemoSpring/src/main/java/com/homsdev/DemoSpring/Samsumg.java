package com.homsdev.DemoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsumg {

	@Autowired
	@Qualifier("snapDragon")
	CPU processor;

	public CPU getProcessor() {
		return processor;
	}

	public void setProcessor(SnapDragon processor) {
		this.processor = processor;
	}

	public void Config() {
		System.out.println("4GB RAM 12Mp Camera");
	}

	@Override
	public String toString() {
		return "Samsumg [processor=" + processor + "]";
	}

}
