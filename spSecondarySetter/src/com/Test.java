package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext act=new ClassPathXmlApplicationContext("bean.xml");
		Object obj=act.getBean("e");
		Employee e1=(Employee)obj;
		System.out.println(e1.getName());
		System.out.println(e1.getAddress().getPaddress());
		System.out.println(e1.getAddress().getLaddress());
		
	}

}
