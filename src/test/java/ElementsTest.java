import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import pages.ButtonsPage;
import pages.TextBoxPage;
import pages.WebTablesPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

public class ElementsTest extends TestBase {

    @BeforeEach
    void setup() {

        open("/elements");

    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Тест на проверку текстбокса")
    public void textBoxPositiveTest() {

        TextBoxPage textBoxPage = new TextBoxPage();

        textBoxPage.openTextBoxTab()
                .setUserName("Ivan")
                .setUserEmail("test@test.com")
                .setCurrentAddress("Tuduevo")
                .setPermanentAddress("Suduevo")
                .submit()
                .resultName("Ivan")
                .resultEmail("test@test.com")
                .setCurrentAddress("Tuduevo")
                .setPermanentAddress("Suduevo");
    }

    @Test
    @Tags({
            @Tag("SMOKE"),
            @Tag("REGRESS"),
    })
    @DisplayName("Тест на проверку нажатия на кнопки")
    public void clickButtonsTest() {

        ButtonsPage buttonsPage = new ButtonsPage();

        buttonsPage.openButtonsTab()
                        .dblClickBtn()
                        .resultDblClickBtn()
                        .rghtClickBtn()
                        .resultRghtClickBtn()
                        .clickBtn()
                        .resultClickBtn();

    }

    @Test
    public void deletingEntryFromTable() {
        WebTablesPage webTablesPage = new WebTablesPage()
                .openWebTablesTab().
                findAndDeleteTableWithVega("Vega", "Delete").
                checkDeletingTable("Vega");

    }

}
