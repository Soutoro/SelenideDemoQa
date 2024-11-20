package steps.common;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

public class CommonSteps {

    @DisplayName("Переход на вкладку")
    public void goToPage(SelenideElement locator) {
        locator.click();
    }

    @DisplayName("Ввод значения")
    public void setValueToInput (SelenideElement input, String value) {
        input.setValue(value);
    }

    @DisplayName("Нажать на кнопку подтверждения")
    public void submit(SelenideElement submitBtn) {
        submitBtn.click();
    }

}
