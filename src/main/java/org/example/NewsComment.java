package org.example;
import org.openqa.selenium.By;
//class import for selenium web-driver
import org.openqa.selenium.WebDriver;
//class import to direct to Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//class import for simple date format, so you can use id for several times
import java.text.SimpleDateFormat;
//class created to print comment
public class NewsComment {
    //protected web-driver
    protected static WebDriver driver;
    //creating main method to print news comment
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
        //command for to click on news release details
        driver.findElement(By.xpath("//div[@class=\"buttons\"]/a[@href=\"/nopcommerce-new-release\"]")).click();
        //command to type title
        driver.findElement(By.xpath("//input[@class=\"enter-comment-title\"]")).sendKeys("Outstanding");
        //command to type comments
        driver.findElement(By.xpath("//textarea[@class=\"enter-comment-text\"]")).sendKeys("I fully recommended this site, it has best products in the market");
        //command to click on new comment
        driver.findElement(By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]")).click();
        //command to get text result
        String Msg1 = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        System.out.println(Msg1);
        //command for close and quit programme
        driver.quit();
    }
}
