package bank.page;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static bank.MainTest.FIRST_NAME;
import static bank.MainTest.LAST_NAME;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Cоздаем нового пользователя, используя наши данные (Имя, Фамилия, Посткод)
 */
public class AddCustomerPage {

    private static final SelenideElement ADD_CUSTOMER = $x("//*[@ng-click='addCust()']");
    private static final SelenideElement FIRST_NAME = $x("//*[@ng-model='fName']");
    private static final SelenideElement LAST_NAME = $x("//*[@ng-model='lName']");
    private static final SelenideElement POST_CODE = $x("//*[@ng-model='postCd']");
    private static final SelenideElement ADD_CUSTOMER_BUTTON = $x("//*[text()='Add Customer']");


    public static void clickOnAddCustomer() {
        ADD_CUSTOMER.click();    }
    public static void firstName(String first){
        FIRST_NAME.setValue(first);
    }
    public static void lastName(String last){
        LAST_NAME.setValue(last);    }
    public static void postCode(String code){
        POST_CODE.setValue(code);
    }
    public static void clickAddCustomerButton(){
        ADD_CUSTOMER_BUTTON.click();
        ADD_CUSTOMER_BUTTON.sendKeys(Keys.ENTER);    }
}
