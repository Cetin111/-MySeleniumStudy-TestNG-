package tests.day19Odevler;

import org.testng.annotations.Test;
import pages.CreateHotelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CreateHotel {
    //1. Tests packagenin altına class olusturun: D17_CreateHotel
//2. Bir metod olusturun: createHotel
//3. https://concorthotel.com/ adresine git.
// 4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
//a. Username : manager
//b. Password : Manager1!
//5. Login butonuna tıklayın.
//6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
//7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
//8. Save butonuna tıklayın.

    CreateHotelPage createHotelPage = new CreateHotelPage();

    @Test
    public void createHotel(){
        //3. https://concorthotel.com/ adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("createHotelUrl"));

        // 4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //a. Username : manager
        //b. Password : Manager1!
        //5. Login butonuna tıklayın
        createHotelPage.ilkLogin.click();
        createHotelPage.kullaniciIsmi.sendKeys(ConfigReader.getProperty("createHotelValidUserName"));
        createHotelPage.password.sendKeys(ConfigReader.getProperty("createHotelValidPassword"));
        createHotelPage.ikinciLogin.click();

        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        createHotelPage.addButton.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

                //devamini simdilik biraktim..
    }


}
