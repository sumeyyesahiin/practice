package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.amazon.com.tr/";
        driver.get(url);


        //icinde oldugu sayfanin basligini dondurur.
        System.out.println(driver.getTitle());

        //icinde oldugu sayfanin URL'sini dondurur.
        System.out.println(driver.getCurrentUrl());

        //icinde oldugu sayfanin kaynak kodlarini dondurur.
        //System.out.println(driver.getPageSource());

        //icinde oldugu sayfanin UNIQUE hash kodunu dondurur.
        System.out.println(driver.getWindowHandle()); // driver calisirken icinde bulundugu
        //tum sayfalarin UNIQUE hash kodunu dondurur. Hash code her sayfa refresh oldugunda
        //yenilenir.



    }

}
