import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.sql.Driver;
import java.time.Duration;
import java.time.Instant;

import static java.sql.Driver.*;

public class XYZ_Bank {
    public static void main(String[] args) {
        ChromeDriver driver = setUpChromeDriver();

        //Выбрать Банк менеджер логин
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement BankManagerLogin = driver.findElement(By.xpath("//*[.='Bank Manager Login']"));
        BankManagerLogin.click();

        //Добавить пользователя
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement AddCustomer = driver.findElement(By.xpath("//*[@ng-click='addCust()']"));
        AddCustomer.click();

        //Создать пользователя (заполненить данные)
        WebElement FirstName = driver.findElement(By.xpath("//*[@ng-model='fName']"));
        FirstName.sendKeys("Zasyadko");
        WebElement LastName = driver.findElement(By.xpath("//*[@ng-model='lName']"));
        LastName.sendKeys("Dmitrii");
        WebElement PostCode = driver.findElement(By.xpath("//*[@ng-model='postCd']"));
        PostCode.sendKeys("4815162342");
        WebElement AddCustomer1 = driver.findElement(By.xpath("//*[text()='Add Customer']"));
        AddCustomer1.click();

        //Подтверждить Алерт
        driver.switchTo().alert().accept();

        //Открыть счет для нового пользователя
        WebElement OpenAccount = driver.findElement(By.xpath("//*[@ng-click='openAccount()']"));
        OpenAccount.click();

        //Выбрать пользователя
        WebElement ClickCustomer = driver.findElement(By.xpath("//*[@ng-model='custId']"));
        ClickCustomer.click();
        WebElement ClickUser = driver.findElement(By.xpath("(//*[@ng-repeat='cust in Customers'])[last()]"));
        ClickUser.click();

        //Выбрать валюту доллар и подтвердить
        WebElement ClickCurrency = driver.findElement(By.xpath("//*[@ng-model='currency']"));
        ClickCurrency.click();
        WebElement ClickDollar = driver.findElement(By.xpath("//*[@value='Dollar']"));
        ClickDollar.click();
        WebElement ClickProcess = driver.findElement(By.xpath("//*[@type='submit']"));
        ClickProcess.click();

        //Подтвердить Алерт
        driver.switchTo().alert().accept();

        //Ввернуться домой
        WebElement BackHome = driver.findElement(By.xpath("//*[@ng-click='home()']"));
        BackHome.click();

        //Зайти в аккаунт
        WebElement CustomerLogin = driver.findElement(By.xpath("//*[@ng-click='customer()']"));
        CustomerLogin.click();

        //Выбрать пользователя
        WebElement YourName = driver.findElement(By.xpath("//*[@ng-model='custId']"));
        YourName.click();
        WebElement UserName = driver.findElement(By.xpath("//option[@value='6']"));
        UserName.click();

        //Нажать кнопку Логин
        WebElement LoginClick = driver.findElement(By.xpath("//*[text()='Login']"));
        LoginClick.click();

        //Операция с пополнением
        WebElement DepositButton = driver.findElement(By.xpath("//*[@ng-click='deposit()']"));
        DepositButton.click();

        //Пополнить Депозит на 100
        WebElement BalanceDiv = driver.findElement(By.xpath("//*[text()='Account Number : ']"));
        WebElement ChildBalanceText = BalanceDiv.findElements(By.xpath("//*[text()='Account Number : ']/child::strong")).get(1);
        String balanceBefore = ChildBalanceText.getText();
        WebElement AmountDeposit = driver.findElement(By.xpath("//*[text()='Amount to be Deposited :']/following-sibling::input"));
        AmountDeposit.sendKeys("100");

        //Нажать депозит
        WebElement DepostiClick = driver.findElement(By.xpath("//*[text()='Deposit']"));
        DepostiClick.click();

        //Проверяем что баланс изменился
        String BalanceAfter = BalanceDiv.findElements(By.xpath("//*[text()='Account Number : ']/child::strong")).get(1).getText();
        int sum = Integer.parseInt(BalanceAfter) - Integer.parseInt(balanceBefore);
        if (sum != 100) {
            throw new RuntimeException("asdfa");
        }


        //Снять 50 долларов со счета
        WebElement WithDrawlButton = driver.findElement(By.xpath("//*[@ng-click='withdrawl()']"));
        WithDrawlButton.click();
        WebElement AmountWithDrawn = driver.findElement(By.xpath("//*[text()='Amount to be Withdrawn :']/following-sibling::input"));
        AmountWithDrawn.sendKeys("50");
        WebElement WithDrawClick = driver.findElement(By.xpath("//*[text()='Withdraw']"));
        WithDrawClick.click();


        //Зайти в транзакции
        WebElement Transactions = driver.findElement(By.xpath("//*[@ng-click='transactions()']"));
        Transactions.click();

        //Нажать очистить список транзакций
        WebElement Reset = driver.findElement(By.xpath("//*[@ng-click='reset()']"));
        Reset.click();

        //Вернуться домой
        WebElement Home = driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        Home.click();

        //Зайти в Банк Менеджер
        WebElement BankManagerLogin2 = driver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]"));
        BankManagerLogin2.click();

        //Зайти в меню пользователей
        WebElement Customers = driver.findElement(By.xpath("//*[@ng-class='btnClass3']"));
        Customers.click();

        //Удалить последнего пользователя
        WebElement DeleteCustomer = driver.findElement(By.xpath("(//td//button)[last()]"));
        DeleteCustomer.click();

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.quit();
    }


    private static ChromeDriver setUpChromeDriver() {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        return driver;




    }
}

