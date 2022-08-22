package sachin_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class SingleSelectEx1 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= bu.startUp("chrome",url);
		WebElement singleDDl = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(singleDDl);
//		sel.selectByValue("red");
//		sel.selectByIndex(6);
		sel.selectByVisibleText("Black"); // 3 method in use
		System.out.println("****Program Start****");

	}

}
