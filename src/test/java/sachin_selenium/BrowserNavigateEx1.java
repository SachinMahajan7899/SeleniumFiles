package sachin_selenium;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class BrowserNavigateEx1 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://www.google.com/";
		WebDriver driver= bu.startUp("chrome",url);
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("****Program Start****");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("****Program Start****");

	}

}
