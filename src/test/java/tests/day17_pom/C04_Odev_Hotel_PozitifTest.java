package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_Odev_Hotel_PozitifTest{
    @Test
    public void test01() {

        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.logIn.click();
        hotelMyCampPage.username.sendKeys("manager");
        hotelMyCampPage.password.sendKeys("Manager1!");
        hotelMyCampPage.giris.click();
        Assert.assertTrue(hotelMyCampPage.pozitifTestSonuc.isDisplayed());
    }

}
