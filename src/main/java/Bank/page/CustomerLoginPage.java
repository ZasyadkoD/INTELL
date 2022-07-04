package bank.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
/**
 * Заходим в аккаунт пользователя, которого мы создали
 */
public class CustomerLoginPage {
    private static final SelenideElement CUSTOMER_LOGIN = $x("//*[@ng-click='customer()']");

    private static final SelenideElement YOUR_NAME = $x("//*[@ng-model='custId']");

    private static final SelenideElement LAST_USER = $x("(//*[@ng-repeat='cust in Customers'])[last()]");

    private static final SelenideElement LOGIN_BUTTON = $x("//*[text()='Login']");

    public static void clickOnCustomerLogin(){
        CUSTOMER_LOGIN.click();
    }
    public static void clickOnYourName(){
        YOUR_NAME.click();
    }
    public static void clickOnLastUser(){
        LAST_USER.click();
    }
    public static void clickOnloginButton(){
        LOGIN_BUTTON.click();
    }
}