package orangeHrmTestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import orangeHrmBase.BaseClass;
import orangeHrmPages.HomePage;
import orangeHrmPages.LoginPage;

public class LoginPageTest extends BaseClass{
	LoginPage loginPage;
	HomePage homePage;
	
	@Test
	public void verifyLogo() {
		boolean flag= loginPage.validLogo();
		assertTrue(flag);
		
		
	}
	@Test
	public void loginTest() {
		homePage= loginPage.login();
		String expectedUrlString="https://www.orangehrm.com/";
		String actualUrlString=driver.getCurrentUrl();
		assertEquals(actualUrlString, expectedUrlString);
		
		
	}
	@Test
	public void TitleVerify() {
		String expectedTitle="OrangeHRM";
		String actualTitle=driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}

}
