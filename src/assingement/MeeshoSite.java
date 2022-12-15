package assingement;

import java.time.Duration;
import java.util.List;

import org.apache.pdfbox.pdmodel.fdf.FDFJavaScript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		WebElement Category = driver.findElement(By.xpath("//span[text()='Category']"));
		JavascriptExecutor JS = ((JavascriptExecutor)driver);
		JS.executeScript("arguments[0].scrollIntoView(true);",Category);
		
		//driver.findElement(By.xpath("(//span[text()='Show More'])[1]")).click();
		
		List<WebElement> categories = driver.findElements(By.xpath("(//div[@class='Accordion__AccordionContentWrapper-zncow4-3 fGTrjI'])[1]//div//span[2]"));
		for(WebElement cl:categories) {
			/*if(cl.getText().contains("Analog Watches")) {
				cl.click();
				
				break;
			}*/
			System.out.println(cl.getText());
			cl.click();
		}
		
		
		
		
		

	}

}
