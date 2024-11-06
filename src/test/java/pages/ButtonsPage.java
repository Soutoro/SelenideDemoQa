package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {

    private SelenideElement buttonsTab = $(byText("Buttons")),
            dblClickBtn = $(byText("Double Click Me")),
            resultDblClickBtn = $("#doubleClickMessage"),
            rghtClickBtn = $(byText("Right Click Me")),
            resultRghtClickBtn = $("#rightClickMessage"),
            clickBtn = $(byText("Click Me")),
            resultClickBtn = $("#dynamicClickMessage");

    public ButtonsPage openButtonsTab() {
        buttonsTab.click();

        return this;
    }

    public ButtonsPage dblClickBtn() {
        dblClickBtn.doubleClick();

        return this;
    }

    public ButtonsPage resultDblClickBtn() {
        resultDblClickBtn.shouldBe(visible);

        return this;
    }

    public ButtonsPage rghtClickBtn() {
        rghtClickBtn.contextClick();

        return this;
    }

    public ButtonsPage resultRghtClickBtn() {
        resultRghtClickBtn.shouldBe(visible);

        return this;
    }

    public ButtonsPage clickBtn() {
        clickBtn.click();

        return this;
    }

    public ButtonsPage resultClickBtn() {
        resultClickBtn.shouldBe(visible);

        return this;
    }

}
