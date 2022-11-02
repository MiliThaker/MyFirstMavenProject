package org.example;
import org.openqa.selenium.By;
//class import for selenium web-driver
import org.openqa.selenium.WebDriver;
//class import to direct to Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//class import for simple date format, so you can use id for several times
import java.text.SimpleDateFormat;
//class created to print categories
public class HomePageCategories {
    //protected web-driver
    protected static WebDriver driver;
    //creating main method to print categories names from home page
    public static void main(String[] args) {
        //creating object to communicate with chrome web-driver to open the browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //creating object for  simple date format, so you can show times when you have use this method
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);
//creating object to maximize the browser
        driver.manage().window().maximize();
        //command for to open https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");
        //command to get text for category 1 from homepage
        String Msg1=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]")).getText();
        System.out.println("1. "+Msg1);
        //command to get text for category 2 from homepage
        String Msg2=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]")).getText();
        System.out.println("2. "+Msg2);
        //command to get text for category 3 from homepage
        String Msg3=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]")).getText();
        System.out.println("3. "+Msg3);
        //command to get text for category 4 from homepage
        String Msg4=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]")).getText();
        System.out.println("4. "+Msg4);
        //command to get text for category 5 from homepage
        String Msg5=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]")).getText();
        System.out.println("5. "+Msg5);
        //command to get text for category 6 from homepage
        String Msg6=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]")).getText();
        System.out.println("6. "+Msg6);
        //command to get text for category 7 from homepage
        String Msg7=driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[7]")).getText();
        System.out.println("7. "+Msg7);
        //command for close and quit programme
        driver.quit();
    }
}
