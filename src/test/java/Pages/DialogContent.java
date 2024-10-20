package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DialogContent extends ParentPage {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phone;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement confirmPassword;
    @FindBy(css = "input.button[value='Register']")
    public WebElement registerButton2;
    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement billName;
    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement billAddress;
    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement billCity;
    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement billState;
    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement billZipCode;
    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement billAccNum;
    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement billAccNumVrf;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement billAmount;
    @FindBy(xpath = "//select[@name='fromAccountId']")
    public WebElement billSelectAcc;
    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement billPaymentButton;
    @FindBy(xpath = "//div[@id='rightPanel']")
    public WebElement messageBoxDC;
    @FindBy(xpath = "//table[@id='accountTable']//a")
    public WebElement accTableFirstAcc;
    @FindBy(xpath = "(//a[starts-with(text(),'Bill Payment to')])[1]")
    public WebElement billPayment1;
    @FindBy(xpath = "(//a[starts-with(text(),'Bill Payment to')])[2]")
    public WebElement billPayment2;
    @FindBy(xpath = "(//a[starts-with(text(),'Bill Payment to')])[3]")
    public WebElement billPayment3;





    public void verifyMessageContainsText( String value) {
        wait.until(ExpectedConditions.visibilityOf(this.messageBoxDC));
        Assert.assertTrue(this.messageBoxDC.getText().toLowerCase().contains(value.toLowerCase()));
    }

    public void deleteItem (String deleteName){

    }

    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()) {
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zipCode": return this.zipCode;
            case "phone": return this.phone;
            case "ssn": return this.ssn;
            case "username": return this.userName;
            case "password": return this.password;
            case "confirmPassword": return this.confirmPassword;
            case "registerButton2": return this.registerButton2;
            case "billName":return this.billName;
            case "billAddress":return this.billAddress;
            case "billCity":return this.billCity;
            case "billState":return this.billState;
            case "billZipCode":return this.billZipCode;
            case "billAccNum":return this.billAccNum;
            case "billAccNumVrf":return this.billAccNumVrf;
            case "billAmount":return this.billAmount;
            case "billSelectAcc":return this.billSelectAcc;
            case "billPaymentButton":return this.billPaymentButton;
            case "messageBoxDC":return this.messageBoxDC;
            case "accTableFirstAcc":return this.accTableFirstAcc;
            case "billPayment1":return this.billPayment1;
            case "billPayment2":return this.billPayment2;
            case "billPayment3":return this.billPayment3;


        }
        return null;
    }
}
