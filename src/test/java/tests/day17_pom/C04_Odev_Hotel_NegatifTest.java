package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_Odev_Hotel_NegatifTest {
    //Negatif Test

    /*
    1) Bir Class olustur : HotelmycampPositiveTest
    2) Bir test method olustur positiveLoginTest()
         https://www.hotelmycamp.com/ adresine git
         login butonuna bas
         test data username: manager1
         test data password : Manager1!
         Degerleri girildiginde sayfaya girilemedigini test et
     */

        @Test
        public void test02(){
            HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
            Driver.getDriver().get("https://www.hotelmycamp.com/");


             hotelMyCampPage.logIn.click();
             hotelMyCampPage.username.sendKeys("manager1");
             hotelMyCampPage.password.sendKeys("Manager1!");
             hotelMyCampPage.giris.click();
             Assert.assertTrue(hotelMyCampPage.negatifTestSonuc.isDisplayed());

        }
}
