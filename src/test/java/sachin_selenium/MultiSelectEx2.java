package sachin_selenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class MultiSelectEx2 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= bu.startUp("chrome",url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement singleDDl = driver.findElement(By.id("cars"));
		Select sel = new Select(singleDDl);
		sel.selectByVisibleText("Saab");
		sel.selectByIndex(2);
		sel.selectByValue("audi");
		List<WebElement>allSelectoption = sel.getAllSelectedOptions();
		WebElement colorEle;
		String color;
		for(int i=0;i<allSelectoption.size();i++) {
			System.out.println(allSelectoption.get(i).getText());
		}

	}

}
