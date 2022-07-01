package Bank;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TransactionsPage {
    private static final SelenideElement transactionsButton = $x("//*[@ng-click='transactions()']");
    public static void transactionsButton() {
        transactionsButton.click();
    }
    private static final SelenideElement resetTransactions = $x("//*[@ng-click='reset()']");
    public static void resetTransactions(){
        resetTransactions.click();
    }
    private static final SelenideElement backHome = $x("//button[contains(text(),'Home')]");
    public static void BackHome(){
        backHome.click();
    }
}
