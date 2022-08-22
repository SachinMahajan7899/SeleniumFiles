package sachin_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class ElementMethod {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://itera-qa.azurewebsites.net/Login";
		WebDriver driver= bu.startUp("Chrome",url);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.cssSelector("#Username")).sendKeys("prince");
		driver.findElement(By.cssSelector("#Password")).sendKeys("manager");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		
		System.out.println("****Program Start****");

	}

}
