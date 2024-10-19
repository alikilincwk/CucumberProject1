package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class _US01_Register {
    DialogContent dc = new DialogContent();
    LeftNav ln=new LeftNav();


    @Given("Navigate to ParaBank Website")
    public void navigate_to_para_bank_website() {
        GWD.getDriver().get("https://parabank.parasoft.com/");

    }
    @When("The user clicks on the {string} button on the LeftNav")
    public void the_user_clicks_on_the_button_on_the_left_nav(String string) {
        ln.myClick(ln.registerButton);

    }
    @When("The user fills out the registration form with valid data on the DialogContent")
    public void the_user_fills_out_the_registration_form_with_valid_data_on_the_dialog_content(io.cucumber.datatable.DataTable dataTable) {

//        dc.mySendKeys(dc.firstName,"Team2B6");
//        dc.mySendKeys(dc.lastName,"Cucumber1");
//        dc.mySendKeys(dc.address,"1231 Main St");
//        dc.mySendKeys(dc.city,"New Jersey");
//        dc.mySendKeys(dc.state,"NJ");
//        dc.mySendKeys(dc.zipCode,"10002");
//        dc.mySendKeys(dc.phone,"1234567891");
//        dc.mySendKeys(dc.ssn,"123-45-6781");
//        dc.mySendKeys(dc.userName,"team2B6Cucumber4");
//        dc.mySendKeys(dc.password,"password1234");
//        dc.mySendKeys(dc.confirmPassword,"password1234");

    }
    @When("The user clicks on the {string} button on the DialogContent")
    public void the_user_clicks_on_the_button_on_the_dialog_content(String string) {
        dc.myClick(dc.registerButton2);

    }
    @Then("Success Message Should be Displayed")
    public void success_message_should_be_displayed() {

    }

}
