package Test;

import Pages.AddUserInfoPage;
import Pages.AddUserRolePage;
import Pages.Data;
import org.testng.annotations.Test;


public class TC04_AddUserDataTest extends TestBase{
    AddUserInfoPage newuser;
    AddUserRolePage addrole;


@Test(priority = 1)
    public void addNewUser() throws InterruptedException {

        newuser= new AddUserInfoPage(driver);
        newuser.adduser(Data.FirstName,Data.SecondName,Data.nationaID,Data.Email,Data.phoneNumber, Data.Password);

    }
    @Test(priority = 2)
    public void SelectRole() throws InterruptedException {
        addrole= new AddUserRolePage(driver);
        Thread.sleep(2000);
        addrole.clickRole();
        Thread.sleep(2000);
        addrole.clickBranch();
        Thread.sleep(2000);
        addrole.clickCalender(driver);
        Thread.sleep(2000);
        addrole.addNewUser();

    }
}
