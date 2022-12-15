package orangeHRM_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class OrangeHRMwithPOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\Selenium Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//create object of loginPage
		OrangeHRMLogin login=new OrangeHRMLogin(driver);
		login.userID();
		login.password();
		login.loginbutton();

	}

}
