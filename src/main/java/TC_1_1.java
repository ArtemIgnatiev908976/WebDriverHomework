import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class TC_1_1 {
    WebDriver driver;
    public TC_1_1(WebDriver driver) {
        this.driver = driver;
    }


    By searchInput = By.xpath("//input[@id='search_form_input_homepage']");
    By searchButton = By.xpath("//input[@id='search_button_homepage']");
    By firstOfSearch = By.xpath("//*[@id=\"r1-0\"]/div[2]/h2/a/span");
    By firstImage = By.xpath("//body/section[2]/div[1]/ul[2]/li[1]/span[1]/a[1]/div[1]");
    By imageInModal = By.xpath("//body/div[8]");

    By loginField = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[2]/input[1]");
    By passwordField = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[3]/input[1]");
    By loginButton = By.xpath("//header/div[1]/div[3]/div[1]/div[1]/button[1]");
    By loginButtonInForm = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[4]/button[1]");


    public TC_1_1  typeLoginButtonInForm() {
        driver.findElement(loginButtonInForm).click();
        return this;
    }

    public TC_1_1 typeSendKeysOTYS() {
        driver.findElement(this.searchInput).sendKeys("ОТУС");
        return this;
    }

    public TC_1_1  typeClickSearchButton() {
        driver.findElement(searchButton).click();
        return this;
    }


    public TC_1_1 typeFirstOfSearch() {

        if(driver.findElement(firstOfSearch).getText().contains("Онлайн‑курсы для профессионалов, дистанционное обучение")){
            System.out.println("Поисковой выдаче первый результат Онлайн‑курсы для профессионалов, дистанционное обучение +++");
        }
        else System.out.println("В поисковой выдаче на первом месте другой текст ---");
        return this;
    }


    public TC_1_1 typeGoToW3layouts() {

        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
        return this;
    }


    public TC_1_1  typeClickFirstImage() {
        driver.findElement(firstImage).click();
        return this;
    }



    public TC_1_1  typeModalImageClass() {

        if (driver.findElements(imageInModal).size() > 0) System.out.println("Картинка в модальном окне  +++");
        else System.out.println("Картинка не открылась в модальном окне ---");
        return this;
    }

    public TC_1_1 typeOpenChromeMaximize() {

        driver.manage().window().maximize();
        return this;
    }

    public TC_1_1 typeOpenChromeFullscreen() {

        driver.manage().window().fullscreen();
        return this;
    }
    public TC_1_1 typeGoToOtus() {

        driver.get("https://otus.ru");
        return this;
    }



    public TC_1_1  typeLogin() {
        driver.findElement(this.loginField).sendKeys("ignatievan@answer-42.ru");
        return this;
    }

    public TC_1_1  typePassword() {
        driver.findElement(this.passwordField).sendKeys("aAvHTe8HYB9P");
        return this;
    }

    public TC_1_1  typeClickLogin() {
        driver.findElement(loginButton).click();
        return this;
    }


}
