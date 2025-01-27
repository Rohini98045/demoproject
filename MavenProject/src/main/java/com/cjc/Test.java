package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
   ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
   Student stu=(Student) apc.getBean("s");
   System.out.println(stu);
	}

}
