package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

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
public class Chromebrowser_testing {

    
    public static void main(String[] args) {

        // creating variable for url
        String baseurl ="https://www.nopcommerce.com/demo";

        // use set.Property method.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        // created hte object of webdriver class.
        WebDriver driver= new ChromeDriver();
        // call the manage ,window,maximize methode to maximize the window.
        driver.manage().window().maximize();
        // put the implicitlywait for timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // use the get method
        driver.get(baseurl);

        // get the tittle name with the get method and assign to variable .
        String title = driver.getTitle();
        System.out.println(title);

         // verify the tittle name with the equals method and assign to variable.
        boolean verifytittle = title.equals("Store Demo - nopCommerce");
        System.out.println(verifytittle);
        // verify the contains "Register" tab
        boolean verifyTittlecontains =title.contains("GET STARTED");
        System.out.println(verifyTittlecontains);
        // get the length
        int length = title.length();
        System.out.println(length);

        // close the browser
        driver.close();

    }
}
