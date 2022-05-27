package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClas_AfterClass extends TestBase {

    //JUnit te BeforeClass ve AfterClass notasyonuna sahip methotlar static olmak zorundaydi
    //ama TestNG bu zorunlulukltan bizi kurtariyor.

    /*
   TestNg bize daha fazla before ve after notasyonlari sunar
   diger before/after notasyonlari tanimlayacagimiz
   grup, test veya sut'den once ve sonra calisirlar
   ileride xml dosyalari ile birlikte bunu gorecegiz
   */

    @BeforeClass
    public void beforeClassMethodu(){
        System.out.println("BaforeClass");

    }
    @AfterClass
    public void afterClassMethodu(){
        System.out.println("AfterClass");

    }


    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void techproTesti(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }


}
