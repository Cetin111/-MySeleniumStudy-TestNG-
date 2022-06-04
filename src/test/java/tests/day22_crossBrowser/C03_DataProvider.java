package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {



    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazon ana sayfaya gidelim
        //nutella icin arama yapalim
        //sonuclarin nutella icerdgini test edelim

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        String expectedKelime = "Nutella";
        String actuelSonucYazisi = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actuelSonucYazisi.contains(expectedKelime));
        Driver.closeDriver();


    }

    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] arananKelimeArrayi = {{"Nutella"}, {"Java"}, {"cigdem"}, {"Netherland"}};
        return arananKelimeArrayi;
    }

    @Test (dataProvider = "AranacakKelimeler")
    //aranacak kelimeleri bir liste gibi tutup bana yollayacak bir veri saglayicisi olusturacagiz

    public void test02(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Nutella, Java, cigdem, Netherland icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);


        //sonuclarin aradigimiz kelime icerdigini test edelim.
        String expectedKelime = arananKelime;
        String actuelSonucYazisi = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actuelSonucYazisi.contains(expectedKelime));
        Driver.closeDriver();

    }


}
