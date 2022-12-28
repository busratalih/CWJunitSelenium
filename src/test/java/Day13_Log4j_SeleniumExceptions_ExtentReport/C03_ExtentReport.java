package Day13_Log4j_SeleniumExceptions_ExtentReport;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTestReport;

public class C03_ExtentReport extends BaseTestReport {

    @Test
    public void test(){

        // Testi yapacak olan her turlu mesajı geçip kaldıgını belirtecek extentTest objemizi olusturuyoruz

        extentTest=extentReports.createTest("My test", "Bu bir acıklamadır");

        extentTest.info("Amazon a gidiliyor");
        driver.get("https://www.amazon.com.tr/");

        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        extentTest.info("log4j");

        extentTest.pass("Testimiz gecerli");

        extentTest.fail("Testimiz gecersiz");

        extentTest.skip("Testimiz skip edildi");



    }
}
