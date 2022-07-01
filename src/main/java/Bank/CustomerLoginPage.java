package Bank;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CustomerLoginPage {
    private static final SelenideElement customerLogin = $x("//*[@ng-click='customer()']");
    public static void clickOnCustomerLogin(){
        customerLogin.click();
    }
    private static final SelenideElement yourName = $x("//*[@ng-model='custId']");
    public static void clickOnYourName(){
        yourName.click();
    }
    private static final SelenideElement LastUser = $x("(//*[@ng-repeat='cust in Customers'])[last()]");
    public static void clickOnLastUser(){
        LastUser.click();
    }
    private static final SelenideElement loginButton = $x("//*[text()='Login']");
    public static void clickOnloginButton(){
        loginButton.click();
    }
}
