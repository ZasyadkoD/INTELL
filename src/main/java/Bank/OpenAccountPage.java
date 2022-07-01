package Bank;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class OpenAccountPage {

    private static final SelenideElement openAccount = $x("//*[@ng-click='openAccount()']");

    public static void clickonopenAccount() {
        openAccount.click();
    }

    //Выбрать покупателя
    private static final SelenideElement User = $x("//*[@ng-model='custId']");
    public static void clickOnUser(){
        User.click();
    }
    private static final SelenideElement chooseUser = $x("(//*[@ng-repeat='cust in Customers'])[last()]");
    public static void clickonLastUser(){
        chooseUser.click();
    }
    //Выбрать валюту (Доллар)
    private static final SelenideElement currency = $x("//*[@ng-model='currency']");
    public static void clickonCurrency() {
        currency.click();
    }
    private static final SelenideElement chooseCurrency = $x("//*[@value='Dollar']");
    public static void clickOnChooseCurrency(){
        chooseCurrency.click();
    }
    private static final SelenideElement processButton = $x("//*[@type='submit']");
    public static void clickOnprocessButton(){
        processButton.click();
        processButton.sendKeys(Keys.ENTER);
    }

    private static final SelenideElement backHomePage = $x("//*[@ng-click='home()']");
    public static void clickOnHomeButton(){
        backHomePage.click();
    }

}
