package org.example;
import org.openqa.selenium.By;
//class import for selenium web-driver
import org.openqa.selenium.WebDriver;
//class import to direct to Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//class import for simple date format, so you can use id for several times
import java.text.SimpleDateFormat;
//class created to print msg when u send email msg to your friend
public class EmailAFriend {
    //protected web-driver
    protected static WebDriver driver;
    //creating main method to print msg when u send email msg to your friend
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
        //command to click on Apple MacBook Pro 13-inch at homepage
        driver.findElement(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]")).click();
        //command for to click on email a friend
        driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]")).click();
        //command to type friend's email
        driver.findElement(By.xpath("//input[@class=\"friend-email\"]")).sendKeys("abc.123@yhoo.com");
        //command to type your email
        driver.findElement(By.xpath("//input[@class=\"your-email\"]")).sendKeys("xyz.456@yahoo.com");
        //command to type personal message
        driver.findElement(By.xpath("//textarea[@class=\"your-email\"]")).sendKeys("Hello");
        //command to click on send email
        driver.findElement(By.xpath("//div[@class=\"buttons\"]/button[@type=\"submit\"]")).click();
        //command to get text for the result
        String Msg1 = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();
        System.out.println(Msg1);
        //command for close and quit programme
        driver.quit();

    }
}
