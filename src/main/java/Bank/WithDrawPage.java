package Bank;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WithDrawPage {

    private static final SelenideElement withdrawButton = $x("//*[@ng-click='withdrawl()']");
    public static void withdrawButton() {
        withdrawButton.click();
    }
    private static final SelenideElement amountWithdraw = $x("//*[text()='Amount to be Withdrawn :']/following-sibling::input");
    public static void clickOnamountWithdraw(String first){

        amountWithdraw.setValue(first);
    }
    private static final SelenideElement clickOnWithdrawButton = $x("//*[text()='Withdraw']");
    public static void ClickOnWithdrawButton(){
        clickOnWithdrawButton.click();
    }
}
