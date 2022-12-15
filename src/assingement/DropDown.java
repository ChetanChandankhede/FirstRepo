package assingement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		driver.findElement(By.xpath("//span[@class='dropArrowDD']")).click();
		Thread.sleep(5000);
		List<WebElement> DD = driver.findElements(By.xpath("//div[@class='dropDownPrimaryContainer dropdownShow ']//ul//li//span"));
		for(WebElement CC:DD)
		{
			if(CC.getText().contains("5 years")) {
				CC.click();
				break;
			}
			
		}
		
		
	
		
		
		
		
		

	}

}
