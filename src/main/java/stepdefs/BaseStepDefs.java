package stepdefs;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.BasePages;

public class BaseStepDefs {
    BasePages basePages = new BasePages();

    @When("open application")
    public void openApp() {

    }

    @And("Sleep {int}")
    public void sleep(int milliseconds) {
        Selenide.sleep(milliseconds);
    }

    @And("navigate to cart")
    public void navigateToCart() {
        basePages.goToCart();
    }
}


