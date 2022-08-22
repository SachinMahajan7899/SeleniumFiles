package sachin_selenium;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserEx2 {
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
//		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"\\Browser Driver\\chromedriver.exe");
		//ChromeDriver obj = new ChromeDriver(); // Open Browser 
		OpenBrowserEx2 obj = new OpenBrowserEx2();
		obj.ff();
	}
	public void ff() {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\Browser Driver\\geckodriver.exe");
		FirefoxDriver obj = new FirefoxDriver();
		}

}
