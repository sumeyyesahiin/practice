package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon arama sayfasina gidin
        driver.get("https://www.amazon.com/");

        //arama cubuguna "Nutella" yazdirin.

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.click();
        aramaKutusu.sendKeys("Nutella");

        //Nutella yazdiktan sonra ENTER'e basarak arama islemini yapin

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

        //Bulunan sonuc sayisini yazdirin.
        WebElement resultOfNumber = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(resultOfNumber.getText());
    }

}
