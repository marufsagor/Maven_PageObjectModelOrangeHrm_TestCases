package orangeHrmPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangeHrmBase.BaseClass;

public class HomePage extends BaseClass {
	@FindBy (xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span") 
	WebElement adminTabElement;
	
	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	public SystemUserPage ClickAdminTab() {
		adminTabElement.click();
		return new SystemUserPage();
		
	}
	

}
