package tests.day21_resableMethods_HtmlReports;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ReactPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class C05_ReactOdev {
    // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
    // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
    // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
    // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
    // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
    // (Her ürün 1 defadan fazla eklenemez!)
    // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
    // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
    // 7.Checkout'a tıklayın
    //Driver.quitDriver();



    @Test
    public void test01() {


        // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("reactUrl"));
        ReactPage reactPage=new ReactPage();

        // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
        //  System.out.println(reactPage.urunlerElement.getText());
        List<WebElement> urunlerList =  reactPage.urunlerListesi;
        System.out.println(urunlerList);

        // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )

        // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin


        // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
        // (Her ürün 1 defadan fazla eklenemez!)


        // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın



        // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin




        // 7.Checkout'a tıklayın


        //Driver.quitDriver();


    }
}