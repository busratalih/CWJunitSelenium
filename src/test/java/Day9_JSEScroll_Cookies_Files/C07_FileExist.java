package Day9_JSEScroll_Cookies_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C07_FileExist {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir")); // projemizin rootunun yolunu verir

        String projectRoot=System.getProperty("user.dir");// Bulmak istediğimiz file proje içerisinde oldugundan proje yolunu aldık

        String filePath="\\src\\test\\java\\resources\\fileExist.jpg";//Bulmak istediğimiz dosyanin proje klasorunden sonraki yolunu aldik (Copy path from content root)


        filePath=projectRoot + filePath; //Almis oldugumuz 2 yolu birlestirip absolute path imizi elde ettik

        System.out.println(Files.exists(Paths.get(filePath))); // Bu path de bir dosya olup olmadigini dogruladik

        if (Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu"); // Varsa bulundu yazdirdik
        }else {
            System.out.println("Dosya bulunamadı"); // Yoksa bulunamadi yazdirdik
        }


    }


}
