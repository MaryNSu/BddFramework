package stepdefs;

import io.cucumber.java.en.And;
import pages.ProductPages;

public class ProductStepDefs {
    ProductPages productPages = new ProductPages();

    @And("add item to the cart")
    public void addItem() {productPages.addItem();}
}


