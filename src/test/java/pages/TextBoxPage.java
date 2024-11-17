package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {

    private final SelenideElement textBoxTab = $(byText("Text Box")),
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitBtn = $("#submit"),
            resultName = $("p#name"),
            resultEmail = $("p#email"),
            resultCurrentAddress = $("p#currentAddress"),
            resultPermanentAddress = $("p#permanentAddress");

    public TextBoxPage openTextBoxTab () {
        textBoxTab.click();

        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage submit() {
        submitBtn.click();

        return this;
    }

    public TextBoxPage resultName(String name) {
        resultName.shouldHave(text(name));

        return this;
    }

    public TextBoxPage resultEmail(String email) {
        resultEmail.shouldHave(text(email));

        return this;
    }

    public TextBoxPage resultCurrentAddress(String currentAddress) {
        resultCurrentAddress.shouldHave(text(currentAddress));

        return this;
    }

    public TextBoxPage resultPermanentAddress(String permanentAddress) {
        resultPermanentAddress.shouldHave(text(permanentAddress));

        return this;
    }

}
