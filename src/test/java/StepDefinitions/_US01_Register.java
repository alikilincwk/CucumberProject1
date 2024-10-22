package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class _US01_Register {
    DialogContent dc = new DialogContent();
    LeftNav ln=new LeftNav();


    @Given("Navigate to ParaBank Website")
    public void navigate_to_para_bank_website() {
        GWD.getDriver().get("https://parabank.parasoft.com/");

    }

    @And("User send random keys in Dialog")
    public void userSendRandomKeysInDialog() {
        String randomData= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf
       // String ulkeKodu= RandomStringUtils.randomNumeric(4); // 4 tane karşık rakam

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

    }
//    @When("The user clicks on the {string} button on the LeftNav")
//    public void the_user_clicks_on_the_button_on_the_left_nav(String string) {
//        ln.myClick(ln.register);
//
//    }
//    @When("The user fills out the registration form with valid data on the DialogContent")
//    public void the_user_fills_out_the_registration_form_with_valid_data_on_the_dialog_content(io.cucumber.datatable.DataTable dataTable) {

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

//    }
//    @When("The user clicks on the {string} button on the DialogContent")
//    public void the_user_clicks_on_the_button_on_the_dialog_content(String string) {
//        dc.myClick(dc.registerButton2);
//
//    }


}
