package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle() sayfa başlığını verir
        System.out.println("Amazon Actual Title : "+driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHandle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title : "+driver.getTitle());//getTitle() methodu sayfa başlığını verir

        //getCurrentUrl() gidilen sayfanın urlsini verir.
        //getPageSource() Açılan sayfanın kaynak kodlarını verir.
        //System.out.println(driver.getPageSource());Bilerek yoruma aldık herçalışştırdığımızda konsola bütün kaynak kodlarını vereceği için.

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değeri sayfalar arası geçiş için kullanır
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());//CF79BE5A582D00D6B128C74ADACDD8E0


    }

}
