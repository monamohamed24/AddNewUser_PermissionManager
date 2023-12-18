package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AddUserRolePage extends PageBase{
    public AddUserRolePage(WebDriver drive) {
        super(drive);
    }
@FindBy(css = "form[class=\"av-tooltip tooltip-label-top\"]")
    WebElement forms;
   WebElement Selectrole= forms.findElements(By.cssSelector("input[class=\"vs__search\"]")).get(0);
    WebElement Selectbranch= forms.findElements(By.cssSelector("input[class=\"vs__search\"]")).get(1);

    @FindBy(id = "example-datepicker__value_")
    WebElement clickCalender;

    @FindBy(id = "example-datepicker__dialog_")
    WebElement openCal;
@FindBy(css = "div[class*=\"col-md-6\"] [class*=\"simple-icon\"]")
WebElement clickaddRolesData;

@FindBy(css = "button[class*=\"submit-btn\"]")
WebElement clickAddAllInfo;

    public void clickRole(){
setTextElement(Selectrole, "مدير المدرسة");
        Selectrole.sendKeys(Keys.ENTER);
    }
    public void clickBranch(){
        setTextElement(Selectbranch, "عرقة بنين عالمي");
        Selectbranch.sendKeys(Keys.ENTER);
    }

public void clickCalender( WebDriver drive){
 clickButton(clickCalender);
    try {


        WebDriverWait exp= new WebDriverWait(drive, Duration.ofSeconds(7000));
        exp.until
                (ExpectedConditions.visibilityOfElementLocated
                        (By.cssSelector("div[class*=\"p-0\"]")));
        openCal.findElements(By.cssSelector("div[class*=\"p-0\"]")).get(2).click();
    }

    catch (NoAlertPresentException e) {
        e.printStackTrace();
        System.out.println("Alert not shown");
    }


}
public void addNewUser(){
    clickButton(clickaddRolesData);
    clickButton(clickAddAllInfo);
    }

}
