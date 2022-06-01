package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateHotelPage {

    public CreateHotelPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id="navLogon")
    public WebElement ilkLogin;

    @FindBy(id="UserName")
    public WebElement kullaniciIsmi;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="btnSubmit")
    public WebElement ikinciLogin;

    @FindBy(className = "btn btn-circle btn-default")
    public WebElement addButton;







}
