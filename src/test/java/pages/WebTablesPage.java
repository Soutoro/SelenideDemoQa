package pages;

import com.codeborne.selenide.SelenideElement;
import net.bytebuddy.asm.Advice;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPage {

    private final SelenideElement webTablesTab =  $(byText("Web Tables"));

    public WebTablesPage openWebTablesTab() {
        webTablesTab.click();

        return this;
    }

    public WebTablesPage findAndDeleteTableWithVega(String name, String title) {
        $(byText(name)).parent().$(byTitle(title)).click();

        return this;
    }

    public WebTablesPage checkDeletingTable(String name) {
        for (int i = 0; i < $$(".rt-td").size(); i++) {
            $$(".rt-td").get(i).shouldNotHave(text(name));
        }

        return this;
    }

}
