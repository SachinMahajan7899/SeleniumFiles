package sachin_selenium;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("****Program Start****");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver= bu.startUp("chrome",url);
		String parent1 = driver.getWindowHandle();
		System.out.println("parent1: "+parent1);
		driver.findElement(By.id("tabButton")).click();
		String parent2 = driver.getWindowHandle();
		System.out.println("Parent2: "+parent2);
		Set<String>allWindowId = driver.getWindowHandles();
		Iterator<String>itr = allWindowId.iterator();
		String id1 = itr.next();
		System.out.println("id1: "+id1);
		
		String id2 = itr.next();
		System.out.println("id2: "+id2);
		driver.switchTo().window(id2);   // ek window se other window pr jane k liye
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text: "+text);
		System.out.println("****Program Start****");
	}

}
