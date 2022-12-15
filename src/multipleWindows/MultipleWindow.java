package multipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");//going to web-page.
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Start Selenium Practice")).click();//clicking at Start Selenium Practice page
		Thread.sleep(1000);
		Set<String> webpageIds = driver.getWindowHandles();
		
		System.out.println(webpageIds);//getting ids of all tab/webpage.
		System.out.println();
		Thread.sleep(500);
		Iterator<String> IT = webpageIds.iterator();//create iterator to traverse through set of string.
		String mainwebpageid = IT.next();
		String childwebpageid = IT.next();
		System.out.println("Main Page ID:-"+mainwebpageid);
		System.out.println("child Page ID:-"+childwebpageid);
		System.out.println();
		Thread.sleep(1000);
		driver.switchTo().window(mainwebpageid);//changing focus of selenium to main webpage.
		Thread.sleep(1000);
		WebElement textofmainpage = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class')]"));
		
		System.out.println("Main Web Page Text:- "+"'"+textofmainpage.getText()+"'");//getting text of main webpage.
		Thread.sleep(3000);
		driver.switchTo().window(childwebpageid);//changing focus of selenium to child webpage.
		Thread.sleep(500);
		WebElement textofchildpage = driver.findElement(By.xpath("//h1[contains(text(),'Welcome To')]"));
		System.out.println("Child Web Page Text:- "+"'"+textofchildpage.getText()+"'");//getting text of child webpage.
		
		
		Thread.sleep(500);
		
		driver.quit();
		
		
		
		

	}

}
