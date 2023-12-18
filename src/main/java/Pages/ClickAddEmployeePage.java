package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickAddEmployeePage extends PageBase {
    public ClickAddEmployeePage(WebDriver drive) {
        super(drive);
    }

    @FindBy(css = "button[class*=\"btn-success\"]")
    WebElement clickEmployee;

    public void ClickAddEmployee(){
        PageBase.clickButton(clickEmployee);
    }
}
