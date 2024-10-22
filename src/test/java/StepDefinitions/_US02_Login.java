package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.List;

public class _US02_Login {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Then("Login Message Should be Displayed")
    public void loginMessageShouldBeDisplayed(DataTable dtMessage) {
        List<String> listMessages = dtMessage.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            ln.verifyLoginMessageContainsText(listMessages.get(i));
        }
    }

    @And("User registers and send random keys in LeftNav")
    public void userRegistersAndSendRandomKeysInLeftNav() {
        String randomData= RandomStringUtils.randomAlphanumeric(8);

        dc.mySendKeys(dc.firstName,randomData);
        dc.mySendKeys(dc.lastName,randomData);
        dc.mySendKeys(dc.address,randomData);
        dc.mySendKeys(dc.city,randomData);
        dc.mySendKeys(dc.state,randomData);
        dc.mySendKeys(dc.zipCode,randomData);
        dc.mySendKeys(dc.phone,randomData);
        dc.mySendKeys(dc.ssn,randomData);
        dc.mySendKeys(dc.userName,randomData);
        dc.mySendKeys(dc.password,randomData);
        dc.mySendKeys(dc.confirmPassword,randomData);
        dc.myClick(dc.registerButton2);

        ln.myClick(ln.logout);

        ln.mySendKeys(ln.username, randomData);
        ln.mySendKeys(ln.password, randomData);
    }

    @And("User send random keys in LeftNav")
    public void userSendRandomKeysInLeftNav() {
        String randomData= RandomStringUtils.randomAlphanumeric(8);

        ln.mySendKeys(ln.username, randomData);
        ln.mySendKeys(ln.password, randomData);
    }

    @Then("Error Message Should be Displayed")
    public void errorMessageShouldBeDisplayed(DataTable dtError) {
        List<String> listMessages = dtError.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            verifyErrorMessage(listMessages.get(i));
        }
    }

    public void verifyErrorMessage( String value) {
        wait.until(ExpectedConditions.visibilityOf(dc.errorMessage));
        Assert.assertTrue(dc.errorMessage.getText().toLowerCase().contains(value.toLowerCase()));
    }
}
