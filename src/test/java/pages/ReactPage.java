package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReactPage {

   public ReactPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "sc-124al1g-4 eeXMBo")
    public List<WebElement> urunlerListesi;








}
