package Bank;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DepositPage {
    private static final SelenideElement depositButton = $x("//*[@ng-click='deposit()']");
    public static void depositButton() {
        depositButton.click();
    }
     private static final SelenideElement amountDeposit = $x("//*[text()='Amount to be Deposited :']/following-sibling::input");
    public static void clickOnamountDeposit(String first){

        amountDeposit.setValue(first);
    }
        private static final SelenideElement clickOnDepositButton = $x("//*[text()='Deposit']");
    public static void ClickOndepositButton(){
        clickOnDepositButton.click();
    }
}

