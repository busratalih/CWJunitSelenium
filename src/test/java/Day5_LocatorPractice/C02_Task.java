package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Task {


    //https://www.teknosa.com/ adresine gidiniz.
    // Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
    // Sonuç sayısını yazdırınız.
    // Çıkan ilk ürüne tıklayınız.
    // Sepete ekleyiniz.
    // Sepetime gite tıklayınız.
    // Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
    // Alışverişi tamamlayınız.
    // Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
    // Driver'ı kapatınız.

    WebDriver driver;

    @Before
    public void setup(){
        //Driver ile ilgili her tulu initial(baslangıc) islem burada yapılır
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        //test sonrasında driver kapatmak (varsa raporları dosyalamak ) için kullanılr
        //driver.quit();
    }


    @Test
    public void teknosaTest(){

        //Teknosa sitesine gidildi
        driver.get("https://www.teknosa.com/");

        //Arama alanı locate edilip istenen deger yazıldı
        WebElement aramaAlani= driver.findElement(By.name("s")); ////input[@name='s']
        aramaAlani.sendKeys("oppo" + Keys.ENTER);

        //Sonuc sayısı yazdırıldı
        WebElement sonucSayisi= driver.findElement(By.className("plp-info"));
        System.out.println(sonucSayisi.getText());

        //İlk urune tıklanıp sepete eklendi
        WebElement ilkUrun=driver.findElement(By.className("prd-link"));
        ilkUrun.click();

        //Sepete ekle butonuna tıklandi
        WebElement sepeteEkleButton=driver.findElement(By.xpath("(//button[@id='addToCartButton'])[1]"));
        sepeteEkleButton.click();

        //Sepete git butonuna tıklandı
        WebElement sepeteGitButton = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
        sepeteGitButton.click();

        //Sipariş özeti text i yazdırıldı
        WebElement siparisOzet=driver.findElement(By.xpath("(//div[@class='cart-sum-body'])"));
        System.out.println(siparisOzet.getText());

        //Alısveriş tamamla butonuna basıldı
        WebElement alisverisTamamlaButton = driver.findElement(By.partialLinkText("Alışverişi Tamamla"));
        alisverisTamamlaButton.click();

        //Teknosaya hosgeldiniz text  yazdırıldı
        WebElement hosgeldiniz = driver.findElement(By.xpath("//div[@class='lrp-title']"));
        System.out.println(hosgeldiniz.getText());


    }


}
