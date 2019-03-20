package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.aop.AccountDAO;
import com.luv2code.aopdemo.aop.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
//		read spring config java class
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		//		get the bean from spring context
AccountDAO ad=context.getBean("accountDAO", AccountDAO.class);
//get membership dao from spring container
MembershipDAO m=context.getBean("membershipDAO", MembershipDAO.class);

Account a=new Account();
//		call the business method
ad.addAccount(a);
m.addAccount();
//call it again!
System.out.println("after second time");

//		close the context
context.close();

	}

}
