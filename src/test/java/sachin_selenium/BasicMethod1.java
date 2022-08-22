package sachin_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class BasicMethod1 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://itera-qa.azurewebsites.net";
		WebDriver driver= bu.startUp("chrome",url);
		String expTitle = "Home Page - Testautomation practice page";
		String actTitle = driver.getTitle(); // Find webpage Title
		if(actTitle.equals(expTitle)) {      // verify webpage Title
			System.out.println("Title Match");
		}else {
		System.out.println("Title Match");
		}
		String expurl = "https://itera-qa.azurewebsites.net/";
		String acturl = driver.getCurrentUrl();
		System.out.println(acturl);
		if(expurl.equals(acturl)) {      // verify webpage url
			System.out.println("url Match");
		}else {
		System.out.println("url Not Match");
		}
		WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
		ele.getAttribute("text");
		System.out.println("AttributeName is:= "+ele.getText()); //get attribute name

		
		System.out.println("****Program Start****");

	}

}
