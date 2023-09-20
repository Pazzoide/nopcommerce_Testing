package TC_02_Login;

import Helper.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginElement {
    public UserLoginElement() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(linkText ="Log in")
    public WebElement loginButton;
    @FindBy(id = "Email")
    public WebElement eMail;
    @FindBy(id="Password")
    public WebElement password;
    @FindBy (css = "[class='button-1 login-button']")
    public WebElement loginBtn;
    @FindBy (xpath = "//div[@class='header-links']//li[1]")
    public WebElement loginControl;
}
