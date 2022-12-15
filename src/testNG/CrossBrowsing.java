package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {
	WebDriver driver;
	@Parameters("browserName")
	
  @Test
  public void crossBrowser(String bName) {
		
		if(bName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(bName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	  
  }
}
