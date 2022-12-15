package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("mce_0_ifr");
		String s = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(s);
		
		driver.switchTo().defaultContent();
		
		//String d = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame containing the TinyMCE WYSIWYG Editor')]")).getText();
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'An iFrame containing the TinyMCE WYSIWYG Editor')]")).getText());
	}

}
