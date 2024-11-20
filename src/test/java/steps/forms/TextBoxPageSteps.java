package steps.forms;

import pages.TextBoxPage;
import steps.common.CommonSteps;

import static com.codeborne.selenide.Condition.text;

public class TextBoxPageSteps {

    CommonSteps commonSteps = new CommonSteps();
    TextBoxPage textBoxPage = new TextBoxPage();

    private final String name = "Name";
    private final String email = "Email@email.ru";
    private final String currentAddress = "Current Address";
    private final String permanentAddress = "Permanent Address";

    public void goToTextBoxPage() {
        commonSteps.goToPage(textBoxPage.textBoxPage());
    }

    public void setValues() {
        commonSteps.setValueToInput(textBoxPage.userNameInput(), name);
        commonSteps.setValueToInput(textBoxPage.userEmailInput(), email);
        commonSteps.setValueToInput(textBoxPage.userCurrentAddressInput(), currentAddress);
        commonSteps.setValueToInput(textBoxPage.userPermanentAddressInput(), permanentAddress);
        commonSteps.submit(textBoxPage.submitBtn());
    }

    public void checkSaveValues() {
        textBoxPage.userNameResult().shouldHave(text(name));
        textBoxPage.userEmailResult().shouldHave(text(email));
        textBoxPage.userCurrentAddressResult().shouldHave(text(currentAddress));
        textBoxPage.userPermanentAddressResult().shouldHave(text(permanentAddress));
    }

}
