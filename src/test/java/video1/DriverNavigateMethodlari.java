package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //oncelikle webDriver ile ilgili ayarlari yapmamiz gerekiyor, install vs

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");
        driver.navigate().to("https://www.facebook.com.tr/");

        //driver.get("") ==> tirnak icindeki url ye git.
        //driver.navigate.to("") ==> navigate kullanirken hem url'ye giderim hemde
        // back or forward, refresh bu tarz islemleri de yapmamizi
        //saglar.

        driver.navigate().back(); //bir onceki sayfaya donus saglar.
        //yani facebook'a doner.

        driver.navigate().forward();//back komutu ile geldigi sayfaya geri doner.
        //yani huawei sayfasina geri doner.

        driver.navigate().refresh();//sayfanin refleshlenmesini saglar.

        driver.close();//driver olusturuldugunda acilan sayfasin kapanmasi

        driver.quit();//driver calisirken birden fazla tab veya window actiysa tumunu kapatmak icin
    }
}
