package StepDefinitions;


import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _US03_PayingBills {
    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    @Then("Bill Payment Message Should be Displayed")
    public void billPaymentMessageShouldBeDisplayed(DataTable dtMessage) {
        List<String> listMessages = dtMessage.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            verifyBillMessageContainsText(listMessages.get(i), i);
        }
    }

    public void verifyBillMessageContainsText(String value, int index) {
        switch (index) {
            case 0: {
                wait.until(ExpectedConditions.visibilityOf(dc.billPayment1));
                Assert.assertTrue(dc.billPayment1.getText().toLowerCase().contains(value.toLowerCase()));
            }
            case 1: {
                wait.until(ExpectedConditions.visibilityOf(dc.billPayment2));
                Assert.assertTrue(dc.billPayment2.getText().toLowerCase().contains(value.toLowerCase()));
            }
            case 2: {
                wait.until(ExpectedConditions.visibilityOf(dc.billPayment3));
                Assert.assertTrue(dc.billPayment3.getText().toLowerCase().contains(value.toLowerCase()));
            }
            default:
                Assert.fail();

        }

    }

}
