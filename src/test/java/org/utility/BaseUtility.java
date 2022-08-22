package org.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	WebDriver driver;
	public WebDriver startUp(String bName,String url) {
		if(bName.equalsIgnoreCase("chrome")|| bName.equalsIgnoreCase("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
//			String path=System.getProperty("user.dir");
//			System.setProperty("webdriver.chrome.driver", path+"\\BrowserDriver\\chromedriver.exe");
		}else if(bName.equalsIgnoreCase("firefox")|| bName.equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(bName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
		}else {
			System.out.println("Invalid Browser Name");
		}	
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public void clickByJs(WebElement uploadBtn,WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",uploadBtn);
	}
	public void waitForVisibilityofWebElement(WebDriver driver,WebElement ele,int time) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitForVisibilityofLocatedBy(WebDriver driver,String locType,String locator,int time) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		switch(locType) {
		case "xpath": wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		break;
		case "css": wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		break;
		case "id": wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		break;
		case "class": wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		break;	
		case "linkText":wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locator)));
		break;
		}
	}
	
}
