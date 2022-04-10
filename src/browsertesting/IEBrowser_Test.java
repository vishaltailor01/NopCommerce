package browsertesting;
/* i am testing nopcommerce website on google chrome browser and will perform following automation steps.
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
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowser_Test {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/"; // create a variable for URL

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe"); //  // create a System.setproperty method
        WebDriver driver = new InternetExplorerDriver(); // create Object
        // use driver.manage().window().maximize(); for maximize the window
        driver.manage().window().maximize();
        // for timeout use   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); methode.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);  // use get methode for url
        String tittle = driver.getTitle(); //get the tittle name by creating tittle variable and driver.getTitle() method.
        System.out.println(tittle);
        // verify the tittle name by creating variable and assign to tittle.equals("nop commerce") method;
        boolean verify = tittle.equals("nop commerce");
        System.out.println(verify);
        boolean verifyContains = tittle.contains("Login");  // verify the  any specific contains
        System.out.println(verifyContains);
        int length = tittle.length();  // get the tittle length
        driver.close(); // close the browser


    }


}
