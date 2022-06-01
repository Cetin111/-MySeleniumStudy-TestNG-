package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
        //TestNG testlerin isim sirasina gore calistirir
            // isim siralamsinin disinda bir sira ile calistirmak icin,
        // test methodlarina oncelik (priority) tanimlayabiliriz

    //priority kucukten buyuge gore calisir, eger bir test methoduna priority deger atanmamissa
    //default olarak priority=0 olarak kabul edilir.

    @Test(priority = 5)     //5 yazinca digerlerinde priority yoksa onlardan sonra calisacak

    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority = -2)
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test (groups = "grup1")
    public void techproTesti(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }


    // priority degeri kucuk olan once calisir... yani once bestbuy caliscak, sonra tecpro(piriority yazmadigi
                // icin default deger yani 0 alincak ve ikinci olarak bu calisacak. son olarakda
                    //prioroty degeri 5 olan amazon caliscak.
}
