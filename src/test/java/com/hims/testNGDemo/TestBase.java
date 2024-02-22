package com.hims.testNGDemo;

import org.testng.annotations.Test;

public class TestBase {

	
	@Test (priority=1)
	public void verifyLoginFeature() {
		System.out.println("welcome to testNG");
	}
	
	@Test (priority=3)
	public void verifyLogoutFeature() {
		System.out.println("verifyLogoutFeature");
	}
	
	@Test (priority=2)
	public void verifyRegestrationFeature() {
		System.out.println("verifyRegestrationFeature");
	}
	
	@Test (priority=4)
	public void verifyadd() {
		System.out.println("verifyadd");
	}
	
}
