package Bank;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


abstract public class BaseClass {
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.driverManagerEnabled = true;
    }



    @Before
    //До запуска браузера мы будем запускать вебдрайвер
    public void init(){
        setUp();
    }

    @After
    //После автотеста браузер будет закрываться
    public void tearDown(){
        Selenide.closeWebDriver();
    }

}
