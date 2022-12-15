package assingement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Use_of_Collection {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		WebElement T1 = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		Thread.sleep(1000);
		T1.click();
		Thread.sleep(1000);
		
		
		WebElement T2 = driver.findElement(By.id("day"));
		T2.click();
		Thread.sleep(1000);

		Select day=new Select(T2);
		day.selectByIndex(1);
		
		List<WebElement> Days = day.getOptions();
		System.out.println("Total Numbers For Days:- "+Days.size());
		System.out.println("Days Are as follows--->");
		for(WebElement D:Days)
		{
			System.out.println(D.getText());
			
		}
		Thread.sleep(1000);
		
		WebElement T3 = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		T3.click();
		Thread.sleep(1000);
		Select month=new Select(T3);
		Thread.sleep(1000);
		month.selectByVisibleText("Jan");
		List<WebElement> Months = month.getOptions();
		System.out.println("Total Months:- "+Months.size());
		Thread.sleep(1000);
		System.out.println("Months Are as follows--->");
		for(WebElement M:Months)
		{
			System.out.println(M.getText());
		}
		Thread.sleep(1000);
		WebElement T4 = driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		T4.click();
		Thread.sleep(1000);
		
		Select year=new Select(T4);
		year.selectByValue("1992");
		List<WebElement> Years = year.getOptions();
		System.out.println("Total Yearss:- "+Years.size());
		Thread.sleep(1000);
		System.out.println("Years Are as follows--->");
		for(WebElement Y:Years)
		{
			System.out.println(Y.getText());
		}
		
		
		
		
		
		
		

	}

}
