package tests;

import com.codeborne.selenide.Configuration;
import configs.BaseConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    public static BaseConfig config = ConfigFactory.create(BaseConfig.class);

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserSize = config.getBrowserSize();
    }

}
