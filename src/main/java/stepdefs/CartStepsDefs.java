package stepdefs;

import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartStepsDefs {
    CartPage cartPage = new CartPage();

    @Then("bag should be in the cart")
    public void itemIsPresent() {
        cartPage.itemIsPresent();
    }
}



