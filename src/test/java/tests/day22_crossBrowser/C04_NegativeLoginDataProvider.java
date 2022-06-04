package tests.day22_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NegativeLoginDataProvider {

    @DataProvider
    public static Object[][] kullaniciListesi() {
        Object[][] kullaniciBilgileri = {{"firuze@nehaber.com", "123456"},
                                        {"murat@naber.com", "13579"},
                                        {"ilker@gmail.com","654321"}};

        return kullaniciBilgileri;
    }

    @Test(dataProvider = "kullaniciListesi")
    public void yanlisSifre(String userEmail, String password) throws InterruptedException {
        BrcPage brcPage = new BrcPage();

        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // login butonuna bas
        brcPage.ilkLoginButonu.click();

        // test data user email: dataprovider den alalim
        brcPage.emailTextBox.sendKeys(userEmail);

        // test data password : dataprovider den alalim
        brcPage.passwordTextBox.sendKeys(password);

        // login butonuna tiklayiniz
        brcPage.ikinciLoginButonu.click();

        // Sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();

    }

}
