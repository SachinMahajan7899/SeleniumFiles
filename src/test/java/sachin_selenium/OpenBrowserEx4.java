package sachin_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserEx4 {
	WebDriver driver;
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		OpenBrowserEx4 obj = new OpenBrowserEx4();
		obj.openB("edge");
		System.out.println("****Program Ends****");
	}
	public WebDriver openB(String browserName) {
		switch(browserName) {
		case "CH":
		case "ch":
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FF":
		case "ff":
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
	    case "edge":
	    case "EDGE":
		     WebDriverManager.edgedriver().setup();
		     driver = new EdgeDriver();
		     break;
		     default:System.out.println("Invali Browser");
		}
		return driver;

    }
}	
