package Test;

import Pages.ClickAddEmployeePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_ClickAddEmployeeTest extends TestBase {

    ClickAddEmployeePage clickAdd;

@Test
    public void ClickAddEmp() throws InterruptedException {
        TestBase.driver.get("https://frontend.oetest2.tech/school/ar/manager/employees");
        Thread.sleep(2000);
        clickAdd= new ClickAddEmployeePage(TestBase.driver);
        clickAdd.ClickAddEmployee();

        Thread.sleep(2000);

       String Actule=driver.getCurrentUrl();
       String Expexted="https://frontend.oetest2.tech/school/ar/manager/employees/create-update?mode=create";
    Assert.assertEquals(Actule,Expexted);

    }
}
