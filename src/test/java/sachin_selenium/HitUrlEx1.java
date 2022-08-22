package sachin_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class HitUrlEx1 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://itera-qa.azurewebsites.net/Login";
		WebDriver driver = bu.startUp("Chrome",url);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.cssSelector("#Username")).sendKeys("prince");
		driver.findElement(By.cssSelector("#Password")).sendKeys("manager");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Log out']")))).click();
		
        // explicit wait - to wait for the Logout button to be click-able
		bu.waitForVisibilityofLocatedBy(driver, "xpath" , "//a[text()='Log out']", 5);
		// click on the compose button as soon as the "compose" button is visible
        driver.findElement(By.xpath("//a[text()='Log out']")).click(); 
		
		System.out.println("****Program Start****");

	}

}
