package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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
        }
        return null;
    }
}
