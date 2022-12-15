package orangeHRM_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {
	
	//variable declaration(globally)--> no of elements = no of variable
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(name="username")private WebElement userID;
	@FindBy(name="password")private WebElement password;
	@FindBy(xpath="//button[text()=' Login ']")private WebElement loginButton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public OrangeHRMLogin(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	//3.Utilize within a method with access level public
	
	public void userID() {
		userID.sendKeys("Admin");
	}
	
	public void password() {
		password.sendKeys("admin123");
	}
	public void loginbutton() {
		loginButton.click();
	}

}
