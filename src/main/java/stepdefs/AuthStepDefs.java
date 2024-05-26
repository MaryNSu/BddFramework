package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthPages;

public class AuthStepDefs {
    AuthPages authPages = new AuthPages();

    @When("user open login form")
    public void openLoginForm() {
        authPages.openLoginForm();
    }

    @And("user enter {string} username")
    public void enterUserName(String userName) {
        authPages.enterUsername(userName);
    }

    @And("user enter {string} password")
    public void enterPassword(String pwd) {
        authPages.enterPassword(pwd);
    }

    @And("user click on Login button")
    public void clickOnLogin() {
        authPages.clickToLogin();
    }

    @Then("salutation should appear")
    public void isSalutationPresent() {
        authPages.isSalutationPresent();
    }

    @And("user clicks on Logout button")
    public void clickOnLogout() {
        authPages.clickToLogout();
    }

    @Then("Login button should appear")
    public void isLoginButtonPresent() {
        authPages.isLoginButtonPresent();
    }
}


