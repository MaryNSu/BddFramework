package stepdefs;

import io.cucumber.java.en.And;
import pages.InventoryPages;

public class InventoryStepDefs {
    InventoryPages inventoryPages = new InventoryPages();

    @And("user select the item")
    public void selectItem() {inventoryPages.selectItem();}
}


