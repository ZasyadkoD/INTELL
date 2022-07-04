package bank.page;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Удаляем все выполненные транзакции пользователем
 */

public class TransactionsPage {
    private static final SelenideElement TRANSACTIONS_BUTTON = $x("//*[@ng-click='transactions()']");
    private static final SelenideElement transactionListTable = $x("//*[@ng-click='transactions()']");
    public static void transactionsButton() {
        TRANSACTIONS_BUTTON.click();
    }
    private static final SelenideElement RESET_TRANSACTIONS_BUTTON = $x("//*[@ng-click='reset()']");
    public static void resetTransactions(){
        RESET_TRANSACTIONS_BUTTON.click();
    }

    /*public static void checkTransactions() {
        Assert.assertTrue(transactionListTable.getChilds().getSize() == 2);
        Assert.assertTrue(transactionListTable.getChilds().get(0).getText() == "100");
        Assert.assertTrue(transactionListTable.getChilds().get(1).getText() == "50");
    }*/
    private static final SelenideElement BACK_HOME_BUTTON = $x("//button[contains(text(),'Home')]");
    public static void BackHome(){
        BACK_HOME_BUTTON.click();
    }
}
