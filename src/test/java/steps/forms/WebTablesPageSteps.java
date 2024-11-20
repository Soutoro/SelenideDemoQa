package steps.forms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.WebTablesPage;
import steps.common.CommonSteps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPageSteps {

    private static final Logger logger = LogManager.getLogger(WebTablesPageSteps.class);
    CommonSteps commonSteps = new CommonSteps();
    WebTablesPage webTablesPage = new WebTablesPage();

    public void goToWebTablesPage() {
        logger.info("Проверка логгера");
        commonSteps.goToPage(webTablesPage.webTablesPage());
    }

    public void findAndDeleteLine(String lastNameInLine) {
        $(byText(lastNameInLine)).parent().$(byTitle("Delete")).click();
    }

    public void checkDeletingLine(String lastNameInLine) {
        for (int i = 0; i < $$(".rt-td").size(); i++) {
            $$(".rt-td").get(i).shouldNotHave(text(lastNameInLine));
        }
    }

}
