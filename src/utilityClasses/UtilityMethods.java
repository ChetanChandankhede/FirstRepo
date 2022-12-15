package utilityClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class UtilityMethods {
	
	//commonly used method
	//screenshot,wait, scrolling, excel reading etc.
	
	public static String excelDataRead(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Software Testing\\Automation Testing\\PracticeUID.xlsx");
		String value=WorkbookFactory.create(myfile).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Getting Data from excel sheet",true);
		return value;
	}
	
	public static void screenshoot(WebDriver driver,String screenshotname) throws IOException 
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing\\Automation Testing\\SeleniumScreenshot"+screenshotname+".jpg");
		FileHandler.copy(src, dest);
		Reporter.log("Tking screenshot",true);
		
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollintoView(true)", element);
		Reporter.log("Scrolling into view", true);
	}
	
	public static void implicitWait(WebDriver driver,int waitTimes) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTimes));
		Reporter.log("Waiting for "+waitTimes+"ms",true);
		
		
	}
	
	
	
	

}
