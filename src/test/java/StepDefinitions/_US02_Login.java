package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class _US02_Login {
    LeftNav ln = new LeftNav();


    @Then("Login Message Should be Displayed")
    public void loginMessageShouldBeDisplayed(DataTable dtMessage) {
        List<String> listMessages = dtMessage.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            ln.verifyMessageContainsText(listMessages.get(i));
        }
    }
}
