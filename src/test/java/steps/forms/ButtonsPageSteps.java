package steps.forms;

import pages.ButtonsPage;
import steps.common.CommonSteps;

import static com.codeborne.selenide.Condition.visible;

public class ButtonsPageSteps {

    CommonSteps commonSteps = new CommonSteps();
    ButtonsPage buttonsPage = new ButtonsPage();

    public void goToButtonsPage() {
        commonSteps.goToPage(buttonsPage.buttonsPage());
    }

    public void clickButtons() {
        buttonsPage.dblClickBtn().doubleClick();
        buttonsPage.rightClickBtn().contextClick();
        buttonsPage.clickBtn().click();
    }

    public void checkButtonsPopups() {
        buttonsPage.dblClickBtnPopup().shouldBe(visible);
        buttonsPage.rightClickBtnPopup().shouldBe(visible);
        buttonsPage.clickBtnPopup().shouldBe(visible);
    }

}
