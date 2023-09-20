package TC_02_Login;

import Helper.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLogin extends BaseDriver {
    @Test
    public void userLoginTest(){
        UserLoginElement user = new UserLoginElement();
        user.loginButton.click();
        user.eMail.sendKeys("bezdim@gmail.com");
        user.password.sendKeys("cancancan");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", user.loginBtn);
        user.loginBtn.click();
        Assert.assertEquals(user.loginControl.getText(),"My account");
    }
}
