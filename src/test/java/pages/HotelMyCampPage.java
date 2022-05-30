package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id="navLogon")
    public WebElement logIn;

    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy (id="btnSubmit")
    public WebElement giris;

    @FindBy(xpath = "//*[text()='ListOfUsers']")
    public WebElement pozitifTestSonuc;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement negatifTestSonuc;



}
