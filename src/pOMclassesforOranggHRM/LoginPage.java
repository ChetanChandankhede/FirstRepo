package pOMclassesforOranggHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utilityClasses.UtilityMethods;

public class LoginPage {
	
	//variable declaration(globally)--> no of elements = no of variable
		//1. Data member should be declared globally with access level private using @findBy Annotation
		
		@FindBy(name="username")private WebElement userID;
		@FindBy(name="password")private WebElement password;
		@FindBy(xpath="//button[text()=' Login ']")private WebElement loginButton;
		
		//2. Initialize within a constructor with access level public using pagefactory
		
		public LoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
			
		}
		
		//3.Utilize within a method with access level public
		
		public void userID(WebDriver driver,String loginID) {
			UtilityMethods.implicitWait(driver,1000);
			userID.sendKeys(loginID);
			Reporter.log("Entering usreID",true);
		}
		
		public void password(WebDriver driver,String paswrd) {
			UtilityMethods.implicitWait(driver,1000);
			password.sendKeys(paswrd);
			Reporter.log("Entering password",true);
		}
		public void loginbutton(WebDriver driver) {
			UtilityMethods.implicitWait(driver,1000);
			loginButton.click();
			Reporter.log("Clicking on login Button",true);
		}
}
