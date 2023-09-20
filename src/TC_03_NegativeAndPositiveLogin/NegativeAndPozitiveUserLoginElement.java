package TC_03_NegativeAndPositiveLogin;

import Helper.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NegativeAndPozitiveUserLoginElement {
    public NegativeAndPozitiveUserLoginElement() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(linkText ="Log in")
    public WebElement loginButton;
    @FindBy(id = "Email")
    public WebElement eMail;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginBtn;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']" )
    public WebElement errorMessage;
    @FindBy(xpath = "//div[@class='header-links']//li[1]" )
    public WebElement loginMessage;

}
