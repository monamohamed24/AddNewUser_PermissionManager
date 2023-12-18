package Test;

import Pages.SelectRolePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC02_SelectRoleTest extends TestBase
{
	SelectRolePage selectrole;

	@Test
	public void clickrole() throws InterruptedException{
		selectrole= new SelectRolePage(driver);
		selectrole.SelectOneRole();  ;
		Thread.sleep(2000);
		selectrole.clickbutton();
		Thread.sleep(3000);
		String Actule= driver.getCurrentUrl();
		String Expexted ="https://frontend.oetest2.tech/school/ar/notifications-list";
		Assert.assertEquals(Actule,Expexted);
	}
}
