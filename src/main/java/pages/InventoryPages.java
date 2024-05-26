package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPages {
    private final SelenideElement selectItem = $(By.className("hrefch"));

    public void selectItem() {
        selectItem.should(Condition.clickable).click();
    }
}


