package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class _US05_TransferFunds {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    WebDriverWait wd=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    @Then("Login Success Message Should be Displayed")
    public void loginSuccessMessageShouldBeDisplayed() {

        Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("overview"));
    }

    @Then("Transfer Page Should be Displayed")
    public void transferPageShouldBeDisplayed() {

        Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("transfer"));
    }


    @Then("Transfer Confirmation Message")
    public void transferConfirmationMessage() {
        wd.until(ExpectedConditions.visibilityOf(dc.transferControlMessage));
        Assert.assertTrue(dc.transferControlMessage.getText().contains("Complete"));
    }

    @And("Funds Transfer Transaction Received")
    public void fundsTransferTransactionReceived(DataTable dt) {
        List<String> butonlar = dt.asList();

        for (int i = 0; i < butonlar.size(); i++) {

            dc.myClick(dc.getWebElement(butonlar.get(i)));
        }


    }

    @And("Amount Transaction Control")
    public void amountTransactionControl() {

        double item2=Double.parseDouble(dc.amount.getAccessibleName());
        System.out.println(item2);
        double item= Double.parseDouble(dc.amountControl.getText().replaceAll("[^0-9]",""));;
        System.out.println(item);


        Assert.assertTrue(dc.amountControl.getText().contains(dc.amount.getText()),"Para transfer kontrolü başarısız");
    }
}
