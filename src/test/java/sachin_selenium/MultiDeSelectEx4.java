package sachin_selenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class MultiDeSelectEx4 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= bu.startUp("chrome",url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement multiDDl = driver.findElement(By.id("cars"));
		Select sel = new Select(multiDDl);
		for(int i=0;i<sel.getOptions().size();i++) {
			sel.selectByIndex(i);
		}
		sel.deselectAll();
		System.out.println("****Program Start****");
	}
}
