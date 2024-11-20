package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WebTablesPage {

    public SelenideElement webTablesPage() {
        return $x("//span[text()='Web Tables']");
    }

}
