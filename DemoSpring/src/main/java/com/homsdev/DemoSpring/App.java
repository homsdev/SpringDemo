package com.homsdev.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Samsumg phone= factory.getBean(Samsumg.class);
		phone.getProcessor().speed();
	}
}
