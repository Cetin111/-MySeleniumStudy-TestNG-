package tests.day21_resableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PozitiveLoginTestiRaporlu  extends TestBaseRapor {
   //extends TestBaseRapor yapmayi unutma
    BrcPage brcPage = new BrcPage();

    @Test
    public void PositiveLoginTest() {

        extentTest = extentReports.createTest("Pozitif Login","Gecerli username password testi");


        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc ana sayfaya gidildi");

        // login butonuna bas
        brcPage.ilkLoginButonu.click();
        extentTest.info("Login butonuna tiklandi");

        // test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Gecerli email girildi");

        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("Gecerli password girildi");

        // login butonuna tiklayiniz
        brcPage.ikinciLoginButonu.click();
        extentTest.info("login butonuna tiklandi");

        // Sayfaya basarili sekilde girilebildigini test et
        String actuelUserName = brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName = ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actuelUserName,expectedUserName);
        extentTest.pass("kullanici basarili sekilde giris yapti");


        Driver.closeDriver();



    }

}
