package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserInfoPage extends PageBase{
    public AddUserInfoPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(css = "div[class=\"card-body\"]")
    WebElement body;
    WebElement firstName = body.findElements(By.cssSelector("input[class=\"form-control\"]")).get(0);
    WebElement lastName = body.findElements(By.cssSelector("input[class=\"form-control\"]")).get(1);
    WebElement nationalID = body.findElements(By.cssSelector("input[class=\"form-control\"]")).get(2);

    WebElement email = body.findElements(By.cssSelector("input[class=\"form-control\"]")).get(4);
    WebElement password = body.findElements(By.cssSelector("input[class=\"form-control\"]")).get(5);
    WebElement confirmpass = body.findElements(By.cssSelector(
            "input[class=\"form-control\"]")).get(6);
    WebElement addphone = body.findElements(By.cssSelector("input[class=\"vti__input\"]")).get(0);

    @FindBy(css = "label[class=\"custom-control-label\"]")
    WebElement clickwhats;

public void adduser(String First, String second, String id, String mail,String PhonNum, String pass){
    setTextElement(firstName, First);
    setTextElement(lastName, second);
    setTextElement(nationalID,id);
    setTextElement(addphone,PhonNum);
    setTextElement(email,mail);
    setTextElement(password,pass);
    setTextElement(confirmpass,pass);
    clickButton(clickwhats);
}
}


