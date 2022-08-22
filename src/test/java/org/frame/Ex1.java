package org.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/frames";
		WebDriver driver= bu.startUp("chrome",url);
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);	
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("text: "+text);
	}

}
