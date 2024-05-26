package stepdefs;

import io.cucumber.java.en.When;
import pages.InventoryPages;

public class InventoryStepDefs {
    InventoryPages inventoryPages = new InventoryPages();

    @When("user select the item")
    public void selectItem() {inventoryPages.selectItem();}
}


