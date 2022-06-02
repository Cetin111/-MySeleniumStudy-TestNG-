package tests.day21_resableMethods_HtmlReports;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_ScreenShot_ReusableMethod {

    @Test
    public void test01() throws IOException {
        //amazon sayfasina gidip fotografini cekin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //hazir reusable method var onu kullanicaz...
        ReusableMethods.getScreenshot("amazon"); //calistirinca tagetin altinda
                                    //klasor ve icine de resmi atacak==> amazon20220602093051.png






    }
}
