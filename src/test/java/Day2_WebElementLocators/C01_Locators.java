package Day2_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {


    WebDriver driver;


    @Before
    public void setup(){
        //Driver olsturuldu
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Linkedin sistemine gidildi
        driver.get("https://www.linkedin.com/");
        //drıver ımızı maximize ettik
        driver.manage().window().maximize();

        //sayfanın yuklenmesi beklenti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @After
    public void tearDown(){
        //driver ımız kapatıldı
        //driver.quit();
    }



    @Test
    public void idLocator(){
        //id locator-> "session_key"
        WebElement email =driver.findElement(By.id("session_key"));
        email.sendKeys("Clarusway selenium dersinden selamlar");


    }

    @Test
    public void nameLocator(){
        // name locator -> session_password

        WebElement password=driver.findElement(By.name("session_password"));

        password.sendKeys("Sifre");
    }

    @Test
    public void classLocator(){
        // class locator-> input__input
        WebElement email=driver.findElement(By.className("input__input"));
        email.sendKeys("Class Locator Test");
    }

    @Test
    public void tagLocator(){

        // tag locator-> input
        List<WebElement> emailList=driver.findElements(By.tagName("input"));

        //2. elementimiz email text alanımız. Bu yuzden bu elemanı email degiskenine assign ettik
        WebElement email=emailList.get(1);
        email.sendKeys("Tag Locator Test");
    }

    @Test
    public void LinkTextLocator(){
        //Link text "Şifrenizi mi unuttunuz?

        WebElement forgotPwd=driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
        forgotPwd.click();
    }


    @Test
    public void partialLinkTextLocator(){
        //Link text "Şifrenizi mi unuttunuz?

        WebElement forgotPwd=driver.findElement(By.partialLinkText("Şif"));
        forgotPwd.click();
    }

    @Test
    public void absoluteXpath(){

        ///html/body/main/section[1]/div/div/form/div[2]/div[1]/input-> absolute xpath
        WebElement email=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/button"));
        email.sendKeys("Busra absolute xpath konusunu gayet basarılı tamamladı.");
    }

    @Test
    public void relativeXpath(){
        // xpath locator //input[@name='session_key']
        WebElement email=driver.findElement(By.xpath("//input[@name='session_key']"));
        email.sendKeys("Busra relative xpath konusunu gayet basarılı tamamladı.");

    }

    @Test
    public void multipleAttributeXpath(){
        // xpath locator //input[@class='input__input'][@name='session_key']]
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input'][@name='session_key']"));
        email.sendKeys("Busra multipleAttribute xpath konusunu gayet basarılı tamamladı.");

    }


    @Test
    public void andOrXpath(){
        // xpath locator //input[@class='input__input' and @name='session_key']]
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input' and @name='session_key']"));
        email.sendKeys("Busra and&or xpath konusunu gayet basarılı tamamladı.");

    }

    @Test
    public void containsXpath(){
        // xpath locator //input[contains(@name, 'key')]]
        WebElement email=driver.findElement(By.xpath("//input[contains(@name, 'key')]"));
        email.sendKeys("Busra contains xpath konusunu gayet basarılı tamamladı.");

    }








}
