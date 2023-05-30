package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //java uygulamalarında system özelliklerini ayarlamak için setProperty methodu ile kullanırız
        //setProperty methodu ile classımıza driverın fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty ile "Key" değerini girerek "value" ya ulaşabilirim
        WebDriver driver = new ChromeDriver();
        //ChromeDriver türünde yeni bir obje oluşturduk
        driver.get("https://techproeducation.com");// get() metodu ile String olarak girilren url'e gideriz
    }

}
