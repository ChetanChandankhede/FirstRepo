package assingement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class policyBazaar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.policybazaar.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  driver.findElement(By.xpath("(//div[@class='shadowHandlerBox'])[1]")).click();

	}

}
