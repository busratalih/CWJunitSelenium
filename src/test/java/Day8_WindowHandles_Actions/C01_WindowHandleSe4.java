package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {

    /*
    Go to URL: https://testproject.io/
    Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
    https://blog.testproject.io/
     */

    @Override
    public void tearDown() {

    }

    @Test
    public void newWindow(){

        //Ana sekmemizde url yi ziyaret ediyoruz
        driver.get("https://testproject.io/");

        //Yeni pencere olusturulup pencereye switch ediyoruz
        driver.switchTo().newWindow(WindowType.WINDOW);

        //Yeni penceremizde url mizi ziyaret ediyoruz
        driver.get("https://blog.testproject.io/");


    }


    @Test
    public void mewTab(){

        driver.get("https://testproject.io/");

        //Yeni bir sekme olusturuldu
        WebDriver newTab =driver.switchTo().newWindow(WindowType.TAB);

        //Yeni sekmeden amazona gidildi
        newTab.get("https://www.amazon.com/");

        //Aktif Tab n Title ı yazdırıldı-> Aktif tab imiz=yeni olusturulan tab
        System.out.println(driver.getTitle());


    }


    @Test
    public void handleWindows(){

        //Ana sekmemizde amazon açılıyor
        driver.get("https://www.amazon.com/");

        String homePageHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);

        //Yeni sekmemizde amazon tr yi açtık
        driver.get("https://www.amazon.com.tr/");

        //Yeni pencere olusturduk
        driver.switchTo().newWindow(WindowType.WINDOW);

        //Yeni pencerede Googl ı actık
        driver.get("https://www.google.com/");

        Set<String> handles=driver.getWindowHandles();
        Iterator<String> i =handles.iterator();

        while (i.hasNext()){

            String currentTab=i.next();
            driver.switchTo().window(currentTab);

            System.out.println(driver.getTitle());

            //1.Yol
         //  if (!driver.getWindowHandle().equals(homePageHandle)){
         //      driver.close();
         //  }

            //2.Yol
            if (!driver.getTitle().contains("Spend")){
                driver.close();
            }



        }




    }



}
