package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMedhods {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //driver manage methodlari

        //1-A driver.manage().window().getSize(); icinde oldugumuz sayfanin olculerini
        driver.manage().window().getSize();

        //1-B driver.manage().window().getPosition(); icinde oldugu sayfanin piksel olaral konumunu dondurur
        driver.manage().window().getPosition();

        //1-C driver.manage().window().setPosition(); icinde oldugu sayfanin bizim manuel girdigimiz konumu girer.
        driver.manage().window().setPosition(new Point(30,30));

        //1-D driver.manage().window().maximize(); icinde oldugu sayfayi max yapar.
        //1-F driver.manage().window().fullscreen(); icinde oldugu sayfayi fullScreen yapar.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //implicitlyWait driver'a sayfanin yuklenmesi ve kullanacagimiz webelementlerin bulunmasi icin
        //bekleyecegi max sureyi belirtir. mesela 3, saniyede sayfa acildi o zaman yoluna devam eder, acildi diye illa
        //belirtilen sure beklemiyor.

    }
}
