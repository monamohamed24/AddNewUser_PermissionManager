package Test;

import Pages.Data;
import Pages.SearchUserPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05_SearchUserTest extends TestBase{
    SearchUserPage search;

@Test
    public void Searchuser() throws InterruptedException {
    Thread.sleep(2000);
   String Actual=driver.getCurrentUrl();
   String Expected="https://frontend.oetest2.tech/school/ar/manager/employees";
   Assert.assertEquals(Actual,Expected);
    search=new SearchUserPage(driver);
    System.out.println(Data.nationaID);
     search.searchUserID(driver,Data.nationaID);
    Thread.sleep(2000);
     String IdExpect=Data.nationaID;
    String  IdAcule=driver.findElement(By.xpath("//*[@id=\"__BVID__324\"]/tbody/tr/td[3]")).getText();
    Assert.assertEquals(IdAcule,IdExpect);
    }


}
