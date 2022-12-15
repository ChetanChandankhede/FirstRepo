package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\\\Software Testing\\\\Automation Testing\\\\Selenium Software\\\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		/*WebDriver driver2=new ChromeDriver();
		WebDriver driver3=new ChromeDriver();
		WebDriver driver4=new ChromeDriver();*/
		
		 //--Driver.close() is used to close current tab in browser
		
		driver1.get("https://www.amazon.in");  
		Thread.sleep(3000);
		driver1.manage().window().maximize();
		String Title = driver1.getCurrentUrl();
		System.out.println("The URL is:- "+Title);
		Thread.sleep(3000);
		driver1.get("https://www.apple.com/");
		Thread.sleep(3000);
		String Title1 = driver1.getCurrentUrl();
		System.out.println("The URL is:- "+Title1);
		driver1.navigate().back();
		Thread.sleep(3000);
		driver1.navigate().forward();
		Thread.sleep(3000);
		
	
		
		/*driver2.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver2.manage().window().maximize();
		Thread.sleep(1000);
		driver2.close();
	    Thread.sleep(1000);
		
	
	    driver3.get("https://www.myntra.com/");
		Thread.sleep(1000);
		driver3.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver4.get("https://www.apple.com/");
		Thread.sleep(1000);
		driver4.manage().window().maximize();
		Thread.sleep(1000);
		driver3.quit();
		driver4.quit();*/
		

	}

}
