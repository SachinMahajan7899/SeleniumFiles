package org.testNg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Ex1 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
