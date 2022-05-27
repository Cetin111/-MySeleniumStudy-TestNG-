package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {
    @Test
    public void test01(){
        FacebookPage facebookface = new FacebookPage();
        //facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");
        //cookies cikarsa onu kapat  bende cikmadi
        //facebookface.cokies.click();

        //kullanici mail kutusuna rastgele bir isim yazdirin
        Faker faker = new Faker();
        facebookface.mailKutusu.sendKeys(faker.internet().emailAddress());
        //kullanici sifre kismina rastgele bir password yazdirin
        facebookface.sifreKutusu.sendKeys(faker.internet().password());
        //login butonuna basin
        facebookface.loginTusu.click();
        //giris yapilamadigini test edin
        Assert.assertTrue(facebookface.girilemediYaziElementi.isDisplayed());

        Driver.closeDriver();
    }
}
