package TC_03_NegativeAndPositiveLogin;

import Helper.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NegativeAndPozitiveUserLogin extends BaseDriver {

    @Test(dataProvider = "negativeData")
    public void negativeTest(String username, String pass) {
        NegativeAndPozitiveUserLoginElement negative = new NegativeAndPozitiveUserLoginElement();
        negative.loginButton.click();
        negative.eMail.sendKeys(username);
        negative.password.sendKeys(pass);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", negative.loginBtn);
        negative.loginBtn.click();
        Assert.assertTrue(negative.errorMessage.getText().contains("unsuccessful"));
    }

    @Test(dataProvider = "positiveData")
    public void pozitiveTest(String username, String pass) {
        NegativeAndPozitiveUserLoginElement pozitive = new NegativeAndPozitiveUserLoginElement();
        pozitive.loginButton.click();
        pozitive.eMail.sendKeys(username);
        pozitive.password.sendKeys(pass);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", pozitive.loginBtn);
        pozitive.loginBtn.click();
        Assert.assertEquals(pozitive.loginMessage.getText(), "My account");
    }

    @DataProvider
    public Object[][] negativeData() {
        Object[][] data = {
                {"ali@gmail.com", "ali123"},
                {"banu@gmail.com", "banu123"},
                {"ceyda@gmail.com", "ceyda123"},
                {"demir@gmail.com", "demir123"},
                {"emre@gmail.com", "emre123"},
                {"ferdi@gmail.com", "ferdi123"},
        };
        return data;
    }

    @DataProvider
    public Object[][] positiveData() {
        Object[][] data = {
                {"bezdim@gmail.com", "cancancan"}
        };
        return data;
    }
}



