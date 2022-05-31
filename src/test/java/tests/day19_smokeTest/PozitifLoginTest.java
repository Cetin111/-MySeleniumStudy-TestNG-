package tests.day19_smokeTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {

    BrcPage brcPage = new BrcPage();

    @Test
    public void PositiveLoginTest() {

        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // login butonuna bas
        brcPage.ilkLoginButonu.click();

        // test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));

        // login butonuna tiklayiniz
        brcPage.ikinciLoginButonu.click();

        // Sayfaya basarili sekilde girilebildigini test et
        String actuelUserName = brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName = ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actuelUserName,expectedUserName);

        Driver.closeDriver();
    }
}
