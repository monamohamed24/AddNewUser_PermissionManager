package Test;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC01_LoginTest extends TestBase {
    LoginPage clickreg;

    @Test
    public void RegisteredUsern() throws InterruptedException{

      clickreg= new LoginPage(TestBase.driver);
        clickreg.userlogin("123","12345678");
        Thread.sleep(2000);



    }
}
