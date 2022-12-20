package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_Dropdown {


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
    public void selectByIndex(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        //Dropdown locate edildi
        WebElement drpdown=driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine dönüştürüldü
        Select select= new Select(drpdown);

        select.selectByIndex(1); //ALGERİA

        //selectByIndex methodu 0 ile baslar
    }




    @Test
    public void selectByValue(){

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        //Dropdown locate edildi
        WebElement drpdown=driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine dönüştürüldü
        Select select= new Select(drpdown);

        select.selectByValue("TURKEY");

        // selectByValue() metodu option elementlerinin value attribute unun degerine gore secim yapar.

    }



    @Test
    public void selectByVisibleText(){

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        //Dropdown locate edildi
        WebElement drpdown=driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine dönüştürüldü
        Select select= new Select(drpdown);

        select.selectByVisibleText("NEPAL");



    }


    @Test
    public void multipleSelect(){

        driver.get("https://output.jsbin.com/osebed/2");

        //Dropdown locate ediliyor
        Select select=new Select(driver.findElement(By.id("fruits")));

        System.out.println(select.isMultiple());

        select.selectByValue("apple");

        select.selectByIndex(3); //grape


    }

    @Test
    public void getOptions(){

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Select select=new Select(driver.findElement(By.name("country")));

        // getoptions() metodu select elementinin tum seceneklerini (optionlarini) bir liste icerisinde bize verir
        List<WebElement> options=select.getOptions();

        for (WebElement option : options){
            System.out.println(option.getText());
        }

    }

    @Test
    public void getFirstSelectedOption(){

        driver.get("https://output.jsbin.com/osebed/2");

        Select select= new Select(driver.findElement(By.id("fruits")));

        select.selectByIndex(3); //grape
        select.selectByIndex(2); //orange

        WebElement selectedOption=select.getFirstSelectedOption();
        System.out.println(selectedOption.getText());

        //getFirstSelectedOption() metodu secili olan ilk option elementini bize verir (sectiğimiz ilk option degil!)


    }





}
