package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;


public class C01_YeniDriverIlkClass {
    @Test (groups = "grup1")
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");

        /*
        Bu gune kadar TestBase classina extends ederek kullandigimiz driver yerine
        bundan sonra Driver class indan kullanacagimiz getDriver static metodunu kullanacagiz
        yani, bundan sonra;
        Driver.getDriver()     ==>> in
        driver              ==>>  on
         */
        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.faacebook.com");

        Driver.closeDriver();
    }
}
