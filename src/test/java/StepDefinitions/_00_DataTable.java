package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _00_DataTable {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler) {
        List<String> listLinkler = dtLinkler.asList(String.class);

        for (int i = 0; i < listLinkler.size(); i++) {
            ln.myClick(ln.getWebElement(listLinkler.get(i)));
        }
    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtButtons) {
        List<String> listButton = dtButtons.asList(String.class);
        for (int i = 0; i < listButton.size(); i++) {
            ln.myClick(dc.getWebElement(listButton.get(i)));
        }
    }

    @And("User send keys in Dialog")
    public void userSendKeysInDialog(DataTable dtKutuVeYazilar) {
        List<List<String>> listKutuVeYazilar = dtKutuVeYazilar.asLists(String.class);
        for (int i = 0; i < listKutuVeYazilar.size(); i++) {
            WebElement kutu = (dc.getWebElement(listKutuVeYazilar.get(i).get(0)));
            dc.mySendKeys(kutu, listKutuVeYazilar.get(i).get(1));
        }
    }

    @And("User delete the element from Dialog")
    public void userDeleteTheElementFromDialog(DataTable dtSilinecekler) {
        List<String> listSilinecekler = dtSilinecekler.asList();
        for (int i = 0; i < listSilinecekler.size(); i++) {
            dc.deleteItem(listSilinecekler.get(i));
        }

    }





}
