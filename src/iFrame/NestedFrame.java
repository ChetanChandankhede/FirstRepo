package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		String s = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(s);
		//driver.switchTo().frame("mce_0_ifr");
		//String s = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		//System.out.println(s);

	}

}
