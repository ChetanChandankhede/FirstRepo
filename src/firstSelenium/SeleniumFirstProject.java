package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProject {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.amazon.com");
		driver.quit();
		chrome.close();

	}

}
