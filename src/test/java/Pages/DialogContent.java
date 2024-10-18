package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

//    @FindBy ()
//    public WebElement test;







    public void deleteItem(String deleteName) {

    }
    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()) {


        }
        return null;
    }



}
