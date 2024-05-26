package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPages {
    private final SelenideElement addItem = $(By.cssSelector(".btn.btn-success.btn-lg"));

    public void addItem () {
        addItem.should(Condition.clickable).click();
    }
}


