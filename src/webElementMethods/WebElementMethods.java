package webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.apple.com/in/");
		driver.manage().window().maximize();

	}

}
