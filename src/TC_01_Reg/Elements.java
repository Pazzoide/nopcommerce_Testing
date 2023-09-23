package TC_01_Reg;

import Helper.BaseDriver;

public class Elements extends BaseDriver {
    public Elements() {
        PageFactory.initElements(Base_Driver.driver, this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Register')]")
    public WebElement register;

    @FindBy(css = "input[id='FirstName']")
    public WebElement firstnameR;

    @FindBy(css = "input[id='LastName']")
    public WebElement lastnameR;

    @FindBy(css = "input[value='M']")
    public WebElement gender;



    @FindBy(css = "select[name='DateOfBirthDay']")
    public WebElement day;


    @FindBy(css = "select[name='DateOfBirthMonth']")
    public WebElement month;

    @FindBy(css = "select[name='DateOfBirthYear']")
    public WebElement year;

    @FindBy(css = "input[id='Email']")
    public WebElement email;

    @FindBy(css = "input[id='Company']")
    public WebElement companyName;

    @FindBy(css = "input[id='Password']")
    public WebElement passwordR;

    @FindBy(css = "input[id='ConfirmPassword']")
    public WebElement passwordRC;

    @FindBy(css = "button[id='register-button']")
    public WebElement registerButton;

    @FindBy(css = "div[class='result']")
    public WebElement watch;

    @FindBy(xpath = "//a[contains(text(), 'Log in')]")
    public WebElement login;

    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    public WebElement SignIn;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email1;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password2;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement logclick;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    public WebElement homepage;



}
