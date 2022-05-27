package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {
    //abstract yapmamizin nedeni, bu class dan obje uretilmesinin onune gecmek icin

    // Bu class abstract yapildi ve alt satirdaki Webdriver onune protected yazildi.
    // artik test icin ailacak her class bu class a extend edilerek baslangic v bitis ayarlari burdan calistirilabilecek.
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @AfterMethod
    public void tearDown(){
        // driver.quit();
    }



}
