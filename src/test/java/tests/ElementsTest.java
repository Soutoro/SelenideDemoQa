package tests;

import org.junit.jupiter.api.*;

import steps.forms.ButtonsPageSteps;
import steps.forms.TextBoxPageSteps;
import steps.forms.WebTablesPageSteps;

import static com.codeborne.selenide.Selenide.*;

public class ElementsTest extends TestBase {

    @BeforeEach
    public void setup() {
        open("/elements");
    }

    @Test
    @DisplayName("Тест на проверку текстбокса")
    public void textBoxPositiveTest() {
        TextBoxPageSteps textBoxPageSteps = new TextBoxPageSteps();

        textBoxPageSteps.goToTextBoxPage();
        textBoxPageSteps.setValues();
        textBoxPageSteps.checkSaveValues();
        sleep(10000);
    }

    @Test
    @DisplayName("Тест на проверку нажатия кнопок")
    public void clickButtonsTest() {
        ButtonsPageSteps buttonsPageSteps = new ButtonsPageSteps();

        buttonsPageSteps.goToButtonsPage();
        buttonsPageSteps.clickButtons();
        buttonsPageSteps.checkButtonsPopups();
    }

    @Test
    @DisplayName("Тест на проверку удаления строки таблицы")
    public void deletingEntryFromTable() {
        WebTablesPageSteps webTablesPageSteps = new WebTablesPageSteps();

        webTablesPageSteps.goToWebTablesPage();
        webTablesPageSteps.findAndDeleteLine("Vega");
        webTablesPageSteps.checkDeletingLine("Vega");
    }

}
