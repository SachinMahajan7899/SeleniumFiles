package sachin_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class SingleSelectEx2 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= bu.startUp("chrome",url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		WebElement singleDDl = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(singleDDl);
		WebElement selectoption = sel.getFirstSelectedOption();
		String selectColor = selectoption.getText();
		System.out.println("Default Color: "+selectColor);
		sel.selectByVisibleText("Black");
		selectoption = sel.getFirstSelectedOption();
		selectColor = selectoption.getText();
		System.out.println("User Color: "+selectColor);
		System.out.println("****Program Start****");

	}

}
