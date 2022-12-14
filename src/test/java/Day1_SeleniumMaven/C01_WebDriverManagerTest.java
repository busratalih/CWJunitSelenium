package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {

        // Set Path.
        // Create chrome driver.
        // Maximize the window.
        // Open google home page https://www.google.com/
        // Verify that you are Google in the title.

    public static void main(String[] args) {

        //System.setProperty() nin yerine bu method
        //Webdriver manager classını kkullanarak chromedriver binary imizi indirdik
        WebDriverManager.chromedriver().setup();

        //Driver objemizi olusturduk
        WebDriver driver=new ChromeDriver();

        // driver ımızı maksimize ettkik
        driver.manage().window().maximize();

        //google anasayfamızı actık
        driver.get("https://www.google.com/");


        //title mızı aldık
        String title=driver.getTitle();

        //title mızı dogruladık
        if (title.equals("Google")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //driver ımızı kapattık
        driver.quit();









    }



}
