package TC_01_Reg;

import Helper.BaseDriver;

public class Register extends BaseDriver {
    @Test
    public void register() {
        Elements e = new Elements(); //nesne
        driver.get("https://demo.nopcommerce.com");
        e.click(e.register);
        e.click(e.gender);
        e.sendKeys(e.firstnameR, "Ayse");
        e.sendKeys(e.lastnameR, "Sari");
        Select DOBA = new Select(e.day);
        DOBA.selectByVisibleText("5");
        Select DOBM = new Select(e.month);
        DOBM.selectByVisibleText("June");
        Select DOBY = new Select(e.year);
        DOBY.selectByVisibleText("1994");
        e.sendKeys(e.email, "iig@gmail.com");
        e.sendKeys(e.companyName, "Karaca");
        e.sendKeys(e.passwordR, "123pul");
        e.sendKeys(e.passwordRC, "123pul");
        String passwordRvalue = e.passwordR.getAttribute("value");
        String passwordRCvalue = e.passwordRC.getAttribute("value");
        Assert.assertEquals(passwordRvalue, passwordRCvalue, "Sifreler esit  degil");
        e.click(e.registerButton);
        wait.until(ExpectedConditions.visibilityOf(e.watch));
        e.click(e.login);
        wait.until(ExpectedConditions.visibilityOf(e.SignIn));
        e.sendKeys(e.email1,"iig@gmail.com");
        e.sendKeys(e.password2,"123pul");
        e.click(e.logclick);
        e.click(e.homepage);
    }
}
