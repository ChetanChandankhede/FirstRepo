package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TesstNG_Class {

	
		@Test
		public void testNGmethod(){
			 System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://testng.org/doc/download.html");
			
		}
		@Test
		public void testNGmethod_1(){
			 System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://upstox.com/");
			
		}

	

}
