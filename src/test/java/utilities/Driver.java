package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    /*
    POM de Driver icin TestBase class ina extends etmek yerine
    Driver class indan statik methodlar kullanarak driver olusturup ilgili ayarlarin yapilmasi
    ve en sonunda driver in kapatilmasi tercih edilmistir.
     */
  static WebDriver driver;
    public static WebDriver getDriver(){

        if(driver==null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;

    }

    public static void closeDriver(){
        if (driver!=null){  //yani driver a deger atanmissa yani acilmissa
            driver.close();
            driver=null;  //sonraki driver acmalarda sorun olmasin diye geri null atadik
        }

    }


}
