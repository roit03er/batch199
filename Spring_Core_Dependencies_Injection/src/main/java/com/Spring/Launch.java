package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
		
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 CargoPlane bean = (CargoPlane)context.getBean("cargo");
		 PassengerPlane bean2 = (PassengerPlane)context.getBean("pp");
		 FighterPlane bean3 =(FighterPlane) context.getBean("fp");
		 System.out.println(bean);
		 System.out.println(bean2);
		 System.out.println(bean3);

		}
}
