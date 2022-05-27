package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void test01() {
        AmazonPage amazonpage = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //nutella aratalim
        amazonpage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //sonuc yazisinin nutella icerdigini test et
        String actuelSonuc = amazonpage.aramaSonucElementi.getText();
        String arananKelime = "nutella";
        Assert.assertTrue(actuelSonuc.contains(arananKelime));

        Driver.closeDriver();

    }
}
