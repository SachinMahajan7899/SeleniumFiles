package sachin_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class SelectMultiEx2 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= bu.startUp("chrome",url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement multiDDl = driver.findElement(By.id("cars"));
		Select sel = new Select(multiDDl);
		sel.selectByIndex(3);
		sel.selectByValue("opel");
		sel.selectByVisibleText("Volvo");
		System.out.println("****Program Start****");

	}

}
