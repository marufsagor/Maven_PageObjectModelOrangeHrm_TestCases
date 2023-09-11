package orangeHrmPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;
import orangeHrmBase.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy (name ="username")
	WebElement userNameElement;
	
	@FindBy(name="password")
	WebElement passwordElement;
	
	@FindBy(css="[type=submit]")
	WebElement btnLoginSubmitElement;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")
	WebElement logoElement;
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	public boolean validLogo() {
		logoElement.isDisplayed();
		return true;
		
	}
	
	public HomePage login() {
		userNameElement.sendKeys("admin");
		passwordElement.sendKeys("admin123");
		btnLoginSubmitElement.click();
		return new HomePage(); //homePage object is from selenium
		
	}
	
}
