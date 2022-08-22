package sachin_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class BasicMethod2 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/radio-button";
		WebDriver driver= bu.startUp("chrome",url);
		WebElement noRadioBtn1 = driver.findElement(By.id("noRadio"));
	    System.out.println("enabled = "+noRadioBtn1.isEnabled());
		WebElement yesRadioBtn1 = driver.findElement(By.id("yesRadio"));
	    System.out.println("enabled = "+yesRadioBtn1.isDisplayed());
	    
		
		System.out.println("****Program Start****");

	}

}
