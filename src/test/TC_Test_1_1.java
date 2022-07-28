


import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;


public class TC_Test_1_1 {

    WebDriver driver;
    TC_1_1 tc_1_1;




    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");


//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://duckduckgo.com/");

    }


    @Test
    public void TC_1_1() {

        System.out.println("Проверка кейса TC_D_1_1 https://jira.edu.mos.ru/browse/EDW-238  ");
        tc_1_1 = new TC_1_1(driver);


      tc_1_1

              .typeSendKeysOTYS()
              .typeClickSearchButton()
              .typeFirstOfSearch()
              .typeOpenChromeFullscreen()
              .typeGoToW3layouts()
              .typeClickFirstImage()
              .typeModalImageClass()
              .typeOpenChromeMaximize()
              .typeGoToOtus()
              .typeClickLogin()
              .typeLogin()
              .typePassword()
              .typeLoginButtonInForm()

      ;

        driver.quit();
    }
}
