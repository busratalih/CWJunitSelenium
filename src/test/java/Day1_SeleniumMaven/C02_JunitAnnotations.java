package Day1_SeleniumMaven;

import org.junit.*;

public class C02_JunitAnnotations {

    /*

    1. Test
    2. Test
    3. Test
    4. Test (gelistirme arsamasında bu yuzden rapora dahşl olmasın

    Her testimizden once ve sonra calısması gereken kod bloklarımız (methodlarımız) mevcut
    Tum testlerin oncesınde ve sonrasında calısması gereken methodlarımız mevcut

    1. @Test -> Marks a method as a TEST CASE.
    2. @Before : Runs before EACH @Test annotation.
    3. @After : Runs after EACH @Test annotation.
    4. @BeforeClass : Runs before each class only once.
    5. @AfterClass : Runs after each class only once.
    6. @Ignore : Skipping a test case.

     */

    @Test
    public void test01(){
        System.out.println("1. Test yapılıyor...");
    }

    @Test
    public void test02(){
        System.out.println("2. Test yapılıyor...");
    }

    @Test
    public void test03(){
        System.out.println("3. Test yapılıyor...");
    }


    @Test
    @Ignore
    public void test04(){
        System.out.println("4. Test gelistirme asamasında...");
    }

    @Before
    public void beforeEach(){
        System.out.println("Method oncesı kod blogu calıstı");
    }

    @After
    public void afterEach(){
        System.out.println("Method sonrası kod blogu calıstı");
    }

    @BeforeClass
    public static void beforeAll(){
        System.out.println("Methodlarin oncesindeki kod blogu calisti");
    }

    @AfterClass
    public static void afterAll(){
        System.out.println("Methodlarin sonrasindaki kod blogu calisti");
    }

}
