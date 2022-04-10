package browsertesting;
/* i am testing nopcommerce website on firefox browser and will perform following automation steps.
 * 1 open the browser
 * 2 open the https://www.nopcommerce.com/demo url
 * 3 maximise the window
 * 4 implicitly wait 10 second
 * 5 get the tittle name
 * 6 verify the tittle name
 * 6 verify the tittle  contains "Register"
 * 7  get the tittle length
 * 8 close the browser
 *
 * created by vishal
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Firefox_Testing {

    public static void main(String[] args) {
        // variable for base url
        String baseurl = "https://demo.nopcommerce.com/";
        // create a System.setproperty method
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        // create the object
        WebDriver driver = new FirefoxDriver();
        // use driver.manage().window().maximize(); for maximize the window
        driver.manage().window().maximize();
        // for timeout use   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); methode.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // use get methode for url
        driver.get(baseurl);
        //get the tittle name by creating tittle variable and driver.getTitle() method.
        String tittle = driver.getTitle();
        System.out.println(tittle);
        // verify the tittle name by creating variable and assign to tittle.equals("nop commerce") method;
        boolean verify = tittle.equals("nop commerce");
        System.out.println(verify);
        // verify the  any specific contains
        boolean verifyContains = tittle.contains("Get Register");
        // get the tittle length
        int length = tittle.length();
        System.out.println(length);
        // close the browser using .close method
        driver.close();


    }
}
