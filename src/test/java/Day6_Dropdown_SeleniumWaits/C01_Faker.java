package Day6_Dropdown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01_Faker {

    //Faker degerler uretmek için Faker Class ından bir obje uretir ve var olan methodları kullanırız


    @Test
    public void fakerExample(){

        //Faker objesini olusturuyoruz
        Faker faker=new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().fullAddress());

    }
}
