
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://vikisews.com/");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.cssSelector(".container > .right-icons > .d-none > .icon")).click();
        driver.findElement(By.id("email_login")).click();
        driver.findElement(By.id("email_login")).sendKeys("gz1k0prvg3kc@mail.ru");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("6185");
        driver.findElement(By.id("buttonLogin")).click();

        driver.get("https://vikisews.com/profile/");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(1) > .fa")).click();
        driver.findElement(By.name("chest_girth")).sendKeys("90");
        driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(1) > .btn")).click();
        driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(2) > .fa")).click();
        driver.findElement(By.name("waist")).sendKeys("60");
        driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(2) > .btn")).click();
        driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(3) > .fa")).click();
        driver.findElement(By.name("hip_girth")).sendKeys("90");
        driver.findElement(By.cssSelector(".mb-3 > .align-items-center:nth-child(3) > .btn")).click();

        driver.get("https://vikisews.com/profile/");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.linkText("Заказы")).click();
        driver.findElement(By.cssSelector(".align-items-baseline > .mr-auto")).click();
        driver.findElement(By.linkText("Сертификаты")).click();

        driver.get("https://vikisews.com/my-certificates/");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.cssSelector(".search")).click();
        driver.findElement(By.id("search-pattern")).sendKeys("Худи Джейкоб");
        driver.findElement(By.cssSelector(".btn-search")).click();
        driver.findElement(By.cssSelector(".col-6:nth-child(1) .position-relative .popular-slide-img")).click();

       driver.quit();
    }
}