package org.example;
//class import for selenium
import org.openqa.selenium.By;
//class import for selenium web-driver
import org.openqa.selenium.WebDriver;
//class import to direct to Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//class import for simple date format, so you can use id for several times
import java.text.SimpleDateFormat;
//class created to print 3 products from homepage
public class Products {
    //protected web-driver
    protected static WebDriver driver;
    //creating main method to print 3 product name  on https://demo.nopcommerce.com/ homepage

    public static void main(String[] args) {
        //creating object to communicate with chrome web-driver to open the browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //creating object for  simple date format, so you can show times when you have use this method
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);
//creating object to maximize the browser
        driver.manage().window().maximize();
        //command for to open https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");
        //command for to click on computers at home page
        driver.findElement(By.xpath("//a[@href=\"/computers\"] ")).click();
        //command for to click on desktop at home page
        driver.findElement(By.xpath("//a[@title=\"Show products in category Desktops\"]")).click();
        //command and crating object  to get text for product 1
        String Msg1 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]")).getText();
        System.out.println("1. "+Msg1);
        //command and crating object  to get text for product 2
        String Msg2 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        System.out.println("2. "+Msg2);
        //command and crating object  to get text for product 3
        String Msg3=driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        System.out.println("3. "+Msg3);
        //command for close and quit programme
        driver.quit();

    }
}
