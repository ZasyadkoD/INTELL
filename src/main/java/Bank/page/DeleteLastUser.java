package bank.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


/**
 * Удаляем последнего созданного пользователя
 */
public class DeleteLastUser {

    private static final SelenideElement BANK_MANAGER_LOGIN = $x("//button[contains(text(),'Bank Manager Login')]");
    private static final SelenideElement CUSTOMERS = $x("//*[@ng-class='btnClass3']");
    private static final SelenideElement DELETE_LAST_USER = $x("(//td//button)[last()]");


    public static void setDeleteLastUser() {
        BANK_MANAGER_LOGIN.click();
    }
    public static void customers(){
        CUSTOMERS.click();
    }
    public static void deleteLastUser(){
        DELETE_LAST_USER.click();
    }

}
