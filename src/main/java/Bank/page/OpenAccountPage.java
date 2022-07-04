package bank.page;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import static bank.page.AddCustomerPage.FIRST_NAME;
import static bank.page.AddCustomerPage.LAST_NAME;
import static com.codeborne.selenide.Selenide.$x;
/**
 * Добавляем недавно созданного пользователя и выбираем валюту (Доллар)
 */

public class OpenAccountPage {
    public static final String OPEN_ACCOUNT_BUTTON_PATH = "//*[@ng-click='openAccount()']";
    private static final SelenideElement OPEN_ACCOUNT_BUTTON = $x(OPEN_ACCOUNT_BUTTON_PATH);
    private static final SelenideElement PROCESS_BUTTON = $x("//*[@type='submit']");
    private static final SelenideElement USER = $x("//*[@ng-model='custId']");
    private static final SelenideElement LAST_USER = $x("(//*[@ng-repeat='cust in Customers'])[last()]");
    private static final SelenideElement CURRENCY = $x("//*[@ng-model='currency']");
    private static final SelenideElement CHOOSE_CURRENCY = $x("//*[@value='Dollar']");
    private static final SelenideElement BACK_HOME_PAGE = $x("//*[@ng-click='home()']");

    public static void clickOnOpenAccount() {
        OPEN_ACCOUNT_BUTTON.click();    }
    public static void clickOnUser() {
        USER.click();
    }
    public static void clickAndCheckLastUser() {
                LAST_USER.click();

    }
    public static void clickOnCurrency() {
                CURRENCY.click();    }
    public static void clickOnChooseCurrency() {
        CHOOSE_CURRENCY.click();    }

    public static void clickOnProcessButton() {
        PROCESS_BUTTON.click();
        PROCESS_BUTTON.sendKeys(Keys.ENTER);    }
    public static void clickOnHomeButton() {
        BACK_HOME_PAGE.click();
    }

}
