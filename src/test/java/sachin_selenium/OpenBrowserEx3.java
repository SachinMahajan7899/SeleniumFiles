package sachin_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserEx3 {
	WebDriver driver;
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		OpenBrowserEx3 obj = new OpenBrowserEx3();
		obj.openB("chrome");
		System.out.println("****Program Ends****");
	}
	public WebDriver openB(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")||browserName.equalsIgnoreCase("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox")|| browserName.equalsIgnoreCase("ff")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		    }else if(browserName.equalsIgnoreCase("edge")) {
		    	WebDriverManager.edgedriver().setup();
		    	driver = new EdgeDriver();	
		    	}else{
		    	System.out.println("Invalid Browser Name");
		    	}
		      driver.manage().window().maximize();
			return driver;
		}

    }	
