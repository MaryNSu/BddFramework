package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePages {
    private final SelenideElement cartLink = $(By.id("cartur"));

    public void goToCart () {
        cartLink.should(Condition.clickable).click();
    }
}


