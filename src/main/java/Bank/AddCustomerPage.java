package Bank;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * На этой странице мы создаем нового пользователя, используя наши данные (Имя, Фамилия, Посткод)
 */
public class AddCustomerPage {

    //Мы зашли в меню создания покупателя
    private static final SelenideElement addCustomer = $x("//*[@ng-click='addCust()']");

    public static void clickOnAddCustomer() {
        addCustomer.click();
    }

    //Вводим данные покупателя

    private static final SelenideElement firstName = $x("//*[@ng-model='fName']");
    private static final SelenideElement lastName = $x("//*[@ng-model='lName']");
    private static final SelenideElement postCode = $x("//*[@ng-model='postCd']");
    private static final SelenideElement addCustomerButton = $x("//*[text()='Add Customer']");

    public static void firstName(String first){
        firstName.setValue(first);
    }
    public static void lastName(String last){
        lastName.setValue(last);
    }
    public static void postCode(String code){
        postCode.setValue(code);
    }
    public static void clickaddCustomerButton(){
        addCustomerButton.click();
        addCustomerButton.sendKeys(Keys.ENTER);
    }

}
