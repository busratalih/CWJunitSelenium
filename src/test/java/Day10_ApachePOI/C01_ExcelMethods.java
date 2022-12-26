package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExcelMethods {


    public static void main(String[] args) throws IOException {

        //Excel dosyamızın pathini aldık
        String path="src\\test\\java\\resources\\excelfile.xlsx";

        //Dosyamızı actık
        FileInputStream fileInputStream=new FileInputStream(path);

        //Actıgımız dosyayı workbook una cevirdik
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        // workbook umuzdan sheetimize geciş yaptık
        Sheet sheet=workbook.getSheetAt(0);

        //Sheetimizden istediğimiz satırı aldık. Index 0 dan baslar
        Row row1= sheet.getRow(0);

        //satırımızdan istediğimiz hucreyi aldık. Index 0 dan baslar
        Cell cell1=row1.getCell(0);

        System.out.println("Cell1=" + cell1.toString().toLowerCase());













    }
}
