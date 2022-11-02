package org.example;
//class import for selenium
import org.openqa.selenium.By;
//class import for selenium web-driver
import org.openqa.selenium.WebDriver;
//class import to direct to Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//class import for simple date format, so you can use id for several times
import java.text.SimpleDateFormat;
//class created
public class Register {
    //protected web-driver
    protected static WebDriver driver;
//creating main method to register on https://demo.nopcommerce.com/
    public static void main(String[] args) {
         //creating object to communicate with chrome web-driver to open the browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //creating object for  simple date format, so you can use credential for several times also you can show times when you have use this method
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);
        //creating object to maximize the browser
        driver.manage().window().maximize();
        //command for to open https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");
        //command for to click on register at HP
        driver.findElement(By.className("ico-register")).click();
        //commands to entre mandatory * details
        driver.findElement(By.id("FirstName")).sendKeys("Mili");
        driver.findElement(By.id("LastName")).sendKeys("Thaker");
        driver.findElement(By.id("Email")).sendKeys("mili" + timeStamp + "@yahoo.co.uk");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Mili5636");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Mili5636");
        //command to click on register button to register
        driver.findElement(By.id("register-button")).click();
// command to get text for Your registration completed(result)
        String regMsg = driver.findElement(By.className("result")).getText();
        System.out.println(regMsg);
        //command for close and quit programme
        driver.quit();
    }




}
