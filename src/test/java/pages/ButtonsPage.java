package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ButtonsPage {

    public SelenideElement buttonsPage() {
        return $x("//span[text()='Buttons']");
    }

    public SelenideElement dblClickBtn() {
        return $x("//button[@id='doubleClickBtn']");
    }

    public SelenideElement rightClickBtn() {
        return $x("//button[@id='rightClickBtn']");
    }

    public SelenideElement clickBtn() {
        return $x("//button[text()='Click Me']");
    }

    public SelenideElement dblClickBtnPopup() {
        return $x("//p[@id='doubleClickMessage']");
    }

    public SelenideElement rightClickBtnPopup() {
        return $x("//p[@id='rightClickMessage']");
    }

    public SelenideElement clickBtnPopup() {
        return $x("//p[@id='dynamicClickMessage']");
    }

}
