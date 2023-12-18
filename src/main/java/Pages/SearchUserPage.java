package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchUserPage extends PageBase{
    public SearchUserPage(WebDriver drive) {
        super(drive);
    }
@FindBy(css = "button[class*=\"justify-content-between\"]")
WebElement ClickExpand;
    @FindBy(css = "div[class=\"card-body\"]")
    WebElement cardBody;
@FindBy(css = "button[class*=\"btn-primary\"]")
WebElement clickSearch;
    public void searchUserID(WebDriver drive,String searchByID){
        clickButton(ClickExpand);
        try {

            WebDriverWait exp= new WebDriverWait(drive, Duration.ofSeconds(7000));
            exp.until
                    (ExpectedConditions.visibilityOfElementLocated
                            (By.cssSelector("input[class=\"form-control\"]")));
            WebElement searchID=   cardBody.findElements(By.cssSelector("input[class=\"form-control\"]")).get(0);
            setTextElement(searchID,searchByID);


        }

        catch (NoAlertPresentException e) {
            e.printStackTrace();
            System.out.println("Alert not shown");
        }

        clickButton(clickSearch);


    }
}
