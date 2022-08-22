package org.testNg1;

import org.testng.annotations.Test;
import org.utility.BaseUtility;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class OrangeHrmLogin {
	WebDriver driver;
	BaseUtility bu;
	@BeforeMethod
	public void openBrowser() {
		System.out.println("openBrowser");
		System.out.println("****Program Start****");
		bu = new BaseUtility();
		String url = "https://opensource-demo.orangehrmlive.com";
		driver= bu.startUp("chrome",url);
	}
	@Test
	public void login() {
		System.out.println("login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		//bu.waitForVisibilityofWebElement(driver, null, 0);
		bu.waitForVisibilityofLocatedBy(driver, "/index.php/auth/logout", "linkText", 10);
	}
	@AfterMethod
	public void logOut() {
		System.out.println("logOut");
		driver.findElement(By.linkText("/index.php/auth/logout")).click();
	}

}
