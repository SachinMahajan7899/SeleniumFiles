package sachin_selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserEx1 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
	    OpenBrowserEx1 obj = new OpenBrowserEx1();
		//obj.ff();
	    //obj.edgebrowser();
	    obj.chromeb();
	    System.out.println("****Program Ends****");
	}
	public void ff() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver obj = new FirefoxDriver(); // Open Browser
		}
	public void edgebrowser() {
		WebDriverManager.edgedriver().setup();
		EdgeDriver obj =  new EdgeDriver();     // Open Browser
		}
	public void chromeb() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver() ;
	}

}
