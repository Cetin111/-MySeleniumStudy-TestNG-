package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {
//@BeforeMethod ve @AfterMethod notasyonlari Junit deki before ve after gibidir.
//her test methodundan once ve sonra calisirlar. (bunlari TestBase de olusturduk.)
    //TestNG testleri, test isimnlerindeki alfabetik sira ile calistirir.

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void test03(){
        driver.get("https://www.techproeducation.com");
    }

}
