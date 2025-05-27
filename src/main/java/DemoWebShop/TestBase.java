package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod//(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    protected boolean isPresentLogoWebOk() {
        return isPresentLogoWebOk(By.cssSelector("body>div>div>div>div>a>img"));
    }

    private boolean isPresentLogoWebOk(By selector) {
        System.out.println(selector + " Найден");
        return driver.findElements(selector).size() > 0;
    }
}