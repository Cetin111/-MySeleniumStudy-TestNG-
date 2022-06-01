package tests.day19Odevler;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelPozitifTest {

    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

    @Test
    public void testPozitif() {

        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        hotelMyCampPage.logIn.click();
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelUsername"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hoterPassword"));
        hotelMyCampPage.giris.click();



    }
}
