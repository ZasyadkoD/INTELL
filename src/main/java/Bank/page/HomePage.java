package bank.page;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта https://www.globalsqa.com/ (Customer Login and Bank Manager Login)
 */
public class HomePage {

    private final SelenideElement bankManagerLogin = $x("//*[.='Bank Manager Login']");
    public HomePage(String url) {
        Selenide.open(url);
    }
    public void clickOnBankManager() {
        bankManagerLogin.click();
    }
}
