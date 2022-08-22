package org.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;
public class Ex3 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver= bu.startUp("chrome",url);
		WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		bu.clickByJs(uploadBtn, driver);
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec("./Autoit/CromeUpload.exe");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("****Program Ends****");
	}

}

