import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ElementsTest {

    @BeforeEach
    void setup() {

        open("https://demoqa.com/elements");
        Configuration.timeout = 10000;

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

}
