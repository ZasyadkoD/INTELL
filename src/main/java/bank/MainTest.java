package Bank; /**
 * Здесь мы можем уже тестировать и выведем в константы (отдельные переменные).
 * Имя, Фамилия, Посткод, Депозит и Снятие денег
 */

import Bank.*;
import org.junit.Test;
public class MainTest extends BaseClass {

    private final static String Base_URL = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
    private final static String FirstName = "Dimitrii";
    private final static String LastName ="Zasyadko";
    private final static String PostCode = "1507";
    private final static String AmountToBeDeposit = "100";
    private final static String AmountToBeWithDraw = "50";

    //Пишем тело теста, где выполняется логика указания переменных и сравнения чего-то с чем-то (проверка теста);
    //Логика взаимодействия с элементами (нажать перейти в Пейдж классе) Классы со страницами, каждой странице пренадлежит свой класс.

    @Test
    public void check() {
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

    private void deleteLastUser() {
        DeleteLastUser.setDeleteLastUser();
        DeleteLastUser.customers();
        DeleteLastUser.deleteLastUser();
    }

    private void homePage() {
        HomePage Homepage = new HomePage(Base_URL);  //Перейти на главную страницу сайта по ссылке
        Homepage.clickOnBankManager();       //Нажать на кнопку Банк Менеджер
    }

    private void addCustomer() {
        AddCustomerPage.clickOnAddCustomer();    //Нажать на кнопку Создать покупателя
        AddCustomerPage.firstName(FirstName);    //Написать Имя Dmitrii
        AddCustomerPage.lastName(LastName);      //Написать Фамилию Zasyadko
        AddCustomerPage.postCode(PostCode);      //Написать Посткод 1507
        AddCustomerPage.clickaddCustomerButton(); //Нажать на создание и подтвердить Алерт
    }

    private void transactions() {
        TransactionsPage.transactionsButton();
        TransactionsPage.resetTransactions();
        TransactionsPage.BackHome();
    }

    private void withdraw() {
        WithDrawPage.withdrawButton();
        WithDrawPage.clickOnamountWithdraw(AmountToBeWithDraw);
        WithDrawPage.ClickOnWithdrawButton();
    }

    private void deposit() {
        DepositPage.depositButton();
        DepositPage.clickOnamountDeposit(AmountToBeDeposit);
        DepositPage.ClickOndepositButton();
    }

    private void customerLogin() {
        CustomerLoginPage.clickOnCustomerLogin();
        CustomerLoginPage.clickOnYourName();
        CustomerLoginPage.clickOnLastUser();
        CustomerLoginPage.clickOnloginButton();
    }

    private void openAccount() {
        OpenAccountPage.clickonopenAccount();
        OpenAccountPage.clickOnUser();
        OpenAccountPage.clickonLastUser();
        OpenAccountPage.clickonCurrency();
        OpenAccountPage.clickOnChooseCurrency();
        OpenAccountPage.clickOnprocessButton();
        OpenAccountPage.clickOnHomeButton();
    }


}
