package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");


        //email kismina random bir mail adresi giriniz.
        WebElement emailButton = driver.findElement(By.id("email"));
        emailButton.click();
        emailButton.sendKeys("sumrabiasahin@gmail.com");

        //password kismina random bir password adresi giriniz.
        WebElement passwordButton = driver.findElement(By.xpath("//input[@type='password']"));
        passwordButton.click();
        passwordButton.sendKeys("4286Sumeyye." + Keys.ENTER);

        //uyari mesajini dondur
        WebElement failedMessage = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        System.out.println(failedMessage.getText());
        String expectedResult = "The email address you entered isn't connected to an account. Find your account and log in.";

        if (failedMessage.getText().contains(expectedResult)) {
            System.out.println("The failed message that appears and the expected result are the same.");
        } else {
            System.out.println("the failed message that appears ant the expected result are not the same." +
                    "Test case did not pass.");
        }

        //sayfayi kapatin.
        driver.close();
    }


}

