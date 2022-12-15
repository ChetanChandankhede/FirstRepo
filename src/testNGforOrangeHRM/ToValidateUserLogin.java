package testNGforOrangeHRM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClassForBrowser;
import pOMclassesforOranggHRM.LoginPage;
import utilityClasses.UtilityMethods;

public class ToValidateUserLogin extends BaseClassForBrowser {
	LoginPage userID;
	LoginPage password;
	
	@BeforeClass
	public void launchOrangeHRM() 
	{
	
		launchBrowser();//from base class.
		userID = new LoginPage(driver);
		password=new LoginPage(driver);
		
		
	}
	@BeforeMethod
	public void loginToHRM() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		userID.userID(driver, UtilityMethods.excelDataRead(5,1));
		Thread.sleep(2000);
		password.password(driver, UtilityMethods.excelDataRead(5,2));
		Thread.sleep(2000);
		password.loginbutton(driver);
		
	}
	
	
  @Test
  public void f() {
  }
}
