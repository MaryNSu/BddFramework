package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPages {
    public void openLoginForm() {
        $(By.id("login2")).should(Condition.clickable).click();
    }

    public void enterUsername(String username){
        $(By.id("loginusername")).should(Condition.appear).sendKeys(username);
    }

    public void enterPassword(String password) {
        $(By.id("loginpassword")).should(Condition.appear).sendKeys(password);
    }

    public void clickToLogin() {
        $(By.cssSelector("#logInModal .modal-footer .btn.btn-primary")).should(Condition.clickable).click();
    }

    public void isSalutationPresent() {
        $(By.id("nameofuser")).should(Condition.appear);
    }

    public void clickToLogout() {
        $(By.id("logout2")).should(Condition.clickable).click();
    }

    public  void isLoginButtonPresent() {
        $(By.id("login2")).should(Condition.appear);
    }
}


