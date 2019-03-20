package com.luv2code.aopdemo.aop;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account t) {
		System.out.println(getClass()+" : welcome to aop demo class");
	}
}
