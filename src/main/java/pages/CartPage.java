package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement phoneItem = $(By.cssSelector("tr.success"));

    public void itemIsPresent() {
        phoneItem.should(Condition.appear);
    }
}
