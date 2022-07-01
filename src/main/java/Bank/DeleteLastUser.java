package Bank;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DeleteLastUser {

    private static final SelenideElement bankManagerLogin = $x("//button[contains(text(),'Bank Manager Login')]");
    public static void setDeleteLastUser() {
        bankManagerLogin.click();
    }
    private static final SelenideElement customers = $x("//*[@ng-class='btnClass3']");
    public static void customers(){
        customers.click();
    }
    private static final SelenideElement deleteLastUser = $x("(//td//button)[last()]");
    public static void deleteLastUser(){
        deleteLastUser.click();
    }

}
