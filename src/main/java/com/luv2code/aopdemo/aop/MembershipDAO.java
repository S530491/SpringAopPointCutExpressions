package com.luv2code.aopdemo.aop;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass()+": doing stuff inside method of add acount in membershipdao");
	}
}
