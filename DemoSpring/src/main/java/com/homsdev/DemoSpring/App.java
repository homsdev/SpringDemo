package com.homsdev.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//    	The are two forms of getting a bean
//    	BeanFactory; for small application 
//    	ApplicationContext; for web or EE applications

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        vehicle obj= (vehicle) context.getBean("engine");
//        obj.Drive();
		Engine obj = context.getBean("engine", Engine.class);
		System.out.println(obj.getBrand());

	}
}
