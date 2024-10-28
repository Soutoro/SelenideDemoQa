import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@DisplayName("Тесты на проверку вкладки Elements")
public class ElementsTest {

@BeforeEach
    void setup() {

    open("https://demoqa.com/elements");
    Configuration.timeout=10000;

}

    @Test
    @Tag("SMOKE")
    @DisplayName("Тест на проверку текстбокса")
    public void textBoxPositiveTest() {

    String  name = "Name",
            email = "ss@ss.com",
            current_address = "Kukuevo",
            permanent_address = "Belyashivo";

    $(byText("Text Box")).click();
    $("#userName").setValue(name);
    $("#userEmail").setValue(email);
    $("#currentAddress").setValue(current_address);
    $("#permanentAddress").setValue(permanent_address);
    $("#submit").click();
    $("p#name").shouldHave(text(name));
    $("p#email").shouldHave(text(email));
    $("p#currentAddress").shouldHave(text(current_address));
    $("p#permanentAddress").shouldHave(text(permanent_address));

    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Тест на проверку удаления строки из таблицы")
    public void deletingEntryFromTable() {

    $(byText("Web Tables")).click();
    $$(".rt-tr-group").first().find("#delete-record-1").click();

            for(int i=0; i<$$(".rt-td").size(); i++) {
                $$(".rt-td").get(i).shouldNotHave(text("Vega"));
        }

    }

    @Test
    @Tags({
            @Tag("SMOKE"),
            @Tag("REGRESS"),
    })
    @DisplayName("Тест на проверку нажатия на кнопки")
    public void clickButton() {

    $(byText("Buttons")).click();
    $(byText("Double Click Me")).doubleClick();
    $("#doubleClickMessage").shouldBe(visible);
    $(byText("Right Click Me")).contextClick();
    $("#rightClickMessage").shouldBe(visible);
    $(byText("Click Me")).click();
    $("#dynamicClickMessage").shouldBe(visible);

    }



}
