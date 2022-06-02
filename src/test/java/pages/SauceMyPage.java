package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SauceMyPage {
    public SauceMyPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement kullaniciIsmi;

    @FindBy(id="password")
    public WebElement sifre;

    @FindBy(id="login-button")
    public WebElement girisButonu;

    @FindBy(className = "product_sort_container")
    public WebElement dropDownButonu;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> urunlerListesi;

}
