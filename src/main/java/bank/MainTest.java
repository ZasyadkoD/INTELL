package Bank; /**
 * Здесь мы можем уже тестировать и выведем в константы (отдельные переменные).
 * Имя, Фамилия, Посткод, Депозит и Снятие денег
 */

import bank.BaseTestUtils;
import bank.page.*;
import org.junit.Test;
public class MainTest extends BaseTestUtils {

    private final static String BASE_URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
    private final static String FIRST_NAME = "Dimitrii";
    private final static String LAST_NAME ="Zasyadko";
    private final static String POST_CODE = "1507";
    private final static String AMOUNT_TO_BE_DEPOSIT = "100";
    private final static String AMOUNT_TO_BE_WITH_DRAW = "50";

    @Test
    public void MainTest() {
        //1) Главная страница сайта
        homePage();

        //2) Кабинет создания покупателя
        addCustomer();

        //3) Открыть счет для нового покупателя и вернуться в главное меню
        openAccount();

        //4) Зайти в кабинет покупателя
        customerLogin();

        //5) Пополнение депозита на 100
        deposit();

        //6) Снятие денег со счета 50
        withdraw();

        //7) Зайти в транзакции, очистить список транзакций и вернуться домой
        transactions();

        //8) Удалить последнего пользователя
        deleteLastUser();

        int a = 0;

    }

    private void homePage() {
        HomePage Homepage = new HomePage(BASE_URL);
        Homepage.clickOnBankManager();
    }

    private void addCustomer() {
        AddCustomerPage.clickOnAddCustomer();
        AddCustomerPage.firstName(FIRST_NAME);
        AddCustomerPage.lastName(LAST_NAME);
        AddCustomerPage.postCode(POST_CODE);
        AddCustomerPage.clickAddCustomerButton();
    }
    private void openAccount() {
        OpenAccountPage.clickOnOpenAccount();
        OpenAccountPage.clickAndCheckLastUser();
        OpenAccountPage.clickOnUser();
        OpenAccountPage.clickOnCurrency();
        OpenAccountPage.clickOnChooseCurrency();
        OpenAccountPage.clickOnProcessButton();
        OpenAccountPage.clickOnHomeButton();
    }



    private void customerLogin() {
        CustomerLoginPage.clickOnCustomerLogin();
        CustomerLoginPage.clickOnYourName();
        CustomerLoginPage.clickOnLastUser();
        CustomerLoginPage.clickOnloginButton();
    }
    private void deposit() {
        DepositPage.depositButton();
        DepositPage.clickOnamountDeposit(AMOUNT_TO_BE_DEPOSIT);
        DepositPage.ClickOndepositButton();
    }

    private void withdraw() {
        WithdrawPage.withdrawButton();
        WithdrawPage.clickOnamountWithdraw(AMOUNT_TO_BE_WITH_DRAW);
        WithdrawPage.ClickOnWithdrawButton();
    }

    private void transactions() {
        TransactionsPage.transactionsButton();
        TransactionsPage.resetTransactions();
        TransactionsPage.BackHome();
    }

    private void deleteLastUser() {
        DeleteLastUser.setDeleteLastUser();
        DeleteLastUser.customers();
        DeleteLastUser.deleteLastUser();
    }
















}
