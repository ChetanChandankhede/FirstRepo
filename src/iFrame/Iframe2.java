package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions click = new Actions(driver);
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe1);
		WebElement firstimg = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trash = driver.findElement(By.id("trash"));
		Thread.sleep(1000);
		click.moveToElement(firstimg).clickAndHold().moveToElement(trash).release().build().perform();
		WebElement secondimg = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		Thread.sleep(1000);
		click.dragAndDrop(secondimg, trash).perform();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
	}

}
