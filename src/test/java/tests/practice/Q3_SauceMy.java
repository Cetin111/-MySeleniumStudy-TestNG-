package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.SauceMyPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Q3_SauceMy {
    SauceMyPage sauceMyPage = new SauceMyPage();

    /*
     * https://www.saucedemo.com/ adresine gidin
     * Kullanıcı adını standard_user olarak girin
     * Şifreyi secret_sauce olarak girin
     * Giriş düğmesine tıklayın
     * T1 : Yumuşak Assert ile düşükten yükseğe fiyatı seçin
     * T2 : Sert Assert ile ürün fiyatlarının düşükten yükseğe doğru sıralandığını doğrulayın
     */
    // Sabit Assert ile ürün fiyatlarının düşükten yükseğe doğru sıralandığını doğrulayın



    @Test
    public void test1(){
        //https://www.saucedemo.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));

        //Kullanıcı adını standard_user olarak girin
        //Şifreyi secret_sauce olarak girin
        //Giriş düğmesine tıklayın
        sauceMyPage.kullaniciIsmi.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        sauceMyPage.sifre.sendKeys(ConfigReader.getProperty("kkullaniciSifre"));
        sauceMyPage.girisButonu.click();

        //T1 : Yumuşak Assert ile düşükten yükseğe fiyatı seçin
        //dropDown dan fiyata gore artan i secelim.
        Select select=new Select(sauceMyPage.dropDownButonu);
        select.selectByVisibleText("Price (low to high)");

        // T2 : Sert Assert ile ürün fiyatlarının düşükten yükseğe doğru sıralandığını doğrulayın

       List<Double> urunlerDouble = new ArrayList<>();
        for (WebElement each: sauceMyPage.urunlerListesi
             ) {
            String fiyatlarStr = each.getText().replaceAll("$","");
            urunlerDouble.add(Double.parseDouble(fiyatlarStr));
        }





    }



}
