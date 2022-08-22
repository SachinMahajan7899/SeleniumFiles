package sachin_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class WithoutSelectMulti {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver= bu.startUp("chrome",url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement ddlEle = driver.findElement(By.xpath("//div[p[b[text()='Multiselect drop down']]]//div[@class=' css-1hwfws3']"));
		ddlEle.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		
		System.out.println("****Program Start****");

	}

}
