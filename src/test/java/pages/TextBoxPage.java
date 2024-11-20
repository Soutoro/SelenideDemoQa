package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage {

    public SelenideElement textBoxPage() {
        return $x("//span[text()='Text Box']");
    }

    public SelenideElement userNameInput() {
        return $x("//input[@id='userName']");
    }

    public SelenideElement userEmailInput() {
        return $x("//input[@id='userEmail']");
    }

    public SelenideElement userCurrentAddressInput() {
        return $x("//textarea[@id='currentAddress']");
    }

    public SelenideElement userPermanentAddressInput() {
        return $x("//textarea[@id='permanentAddress']");
    }

    public SelenideElement submitBtn() {
        return $x("//button[@id='submit']");
    }

    public SelenideElement userNameResult() {
        return $x("//p[@id='name']");
    }

    public SelenideElement userEmailResult() {
        return $x("//p[@id='email']");
    }

    public SelenideElement userCurrentAddressResult() {
        return $x("//p[@id='currentAddress']");
    }

    public SelenideElement userPermanentAddressResult() {
        return $x("//p[@id='permanentAddress']");
    }

}
