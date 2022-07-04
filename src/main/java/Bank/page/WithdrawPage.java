package bank.page;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


/**
 * Снимаем со счета пользователя 50 долларов
 */
public class WithdrawPage {

    private static final SelenideElement WITHDRAW_BUTTON = $x("//*[@ng-click='withdrawl()']");
    private static final SelenideElement AMOUNT_WITHDRAW = $x("//*[text()='Amount to be Withdrawn :']/following-sibling::input");
    private static final SelenideElement CLICK_ON_WITHDRAW_BUTTON = $x("//*[text()='Withdraw']");




    public static void withdrawButton() {
        WITHDRAW_BUTTON.click();
    }
    public static void clickOnamountWithdraw(String first) {
        AMOUNT_WITHDRAW.setValue(first);
    }
    public static void ClickOnWithdrawButton() {
        CLICK_ON_WITHDRAW_BUTTON.click();
    }

}
