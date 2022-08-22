package sachin_selenium;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver= bu.startUp("chrome",url);
		String parent1 = driver.getWindowHandle();
		System.out.println("parent1: "+parent1);
		driver.findElement(By.id("windowButton")).click();
		Set<String>allWindowId = driver.getWindowHandles();
		Iterator<String>itr = allWindowId.iterator();
		String id;
		while(itr.hasNext()) {
			id = itr.next();
			if(!id.equals(parent1)) {
				driver.switchTo().window(id);
				try {
				String text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("Text: "+text);
				}catch(NoSuchElementException e) {
					System.out.println("Switch to New Window!...");
				}
			}
		}
		driver.quit();
		System.out.println("****Program Start****");
	}
}
