package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	public LoginPage(WebDriver drive) {
		super(drive);
	}

	@FindBy(id ="__BVID__25")
	WebElement emilTxBox ;

	@FindBy(id ="__BVID__27")
	WebElement passwordTxBox ;
	@FindBy(className = "btn-lg")
	WebElement loginBtn;

	public void userlogin(String email , String password) {
		PageBase.setTextElement(emilTxBox, email);
		PageBase.setTextElement(passwordTxBox, password);
		PageBase.clickButton(loginBtn);




	}
}
