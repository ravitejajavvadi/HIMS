package com.hims.testNGDemo;

import org.testng.annotations.Test;

public class Homapage {
	
	

	@Test (priority = 2)
	public void add() {
		System.out.println("Welcome to the TestNG");
	}
	
	@Test (priority = 0,groups="smoke")
	public void logout() {
		System.out.println("Welcome to the logout");
	}
	
	@Test (priority = 1, groups="regression")
	public void Subtract() {
		System.out.println("Welcome to the TestNG1");
	}

	@Test (priority = 2, groups="smoke", enabled=false)
	public void Multiplication() {
		System.out.println("Welcome to the TestNG2");
	}
	
	@Test (priority = 3, groups="regression")
	public void login() {
		System.out.println("Welcome to the TestNG2");
	}

	@Test (groups="sanity")
	public void Division() {
		System.out.println("Welcome to the TestNG3");
	}

	@Test (enabled=false)
	public void Abbb() {
		System.out.println("Welcome to the abbb method");
	}
}
