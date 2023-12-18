package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectRolePage extends PageBase {
    public SelectRolePage(WebDriver drive) {
        super(drive);
    }
    @FindBy(css = "div[class*=\"position-relative\"]>[class*=\"align-items-center\"]")
    WebElement rolePage;

   WebElement SelectRole = rolePage.findElements
            (By.cssSelector("div[class*=\"mb-4\"] [class*=\"font-weight-semibold\"]")).get(1);


    @FindBy (css = "div [class=\"text-center mt-4 col-sm-12 col-12\"] [type=\"button\"]")
    WebElement clickbu;

    public void SelectOneRole() {
        SelectRole.click();
    }

    public void clickbutton(){
        clickButton(clickbu);
    }
}
