package assingement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Actions act=new Actions(driver);
		Thread.sleep(500);
		WebElement refElement = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Thread.sleep(500);
		act.moveToElement(refElement).perform();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//a[text()='Sweatshirts']")).click();
		WebElement click = driver.findElement(By.xpath("//a[text()='Sweatshirts']"));
		Thread.sleep(1000);
		act.click(click).perform();
		
		
		

	}

}
