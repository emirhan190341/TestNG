package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExcel {

    @Test
    public void readExcel() throws IOException {
        //store the path of the file in a string
        String path = "C:\\Users\\PC\\IdeaProjects\\TestNG-Framework\\src\\test\\java\\resources\\Kitap.xlsx";

        //Open the file
        FileInputStream fileInputStream = new FileInputStream(path);

        //Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //Open the first worksheet
        Sheet sheet = workbook.getSheetAt(0);

        //Go to first row
        Row firstRow = sheet.getRow(0);

        //Go to first cell on that first row and print
        Cell firstCell =firstRow.getCell(0  );//index of cell stars at 0
        System.out.println(firstCell);

        //Go to second cell on that first row and print
        sheet.getRow(0).getCell(1); //we can chain the methods

        //go to 2nd row first cell and assert if the data equal to usa
        Cell row2Cell1 = sheet.getRow(1).getCell(0);
        boolean isEqual = row2Cell1.toString().equals("USA");
        System.out.println(isEqual);
        Assert.assertTrue(isEqual);

        //go to 3rd row and 2nd cell-chain the row and cell
        Cell row3cell2 = sheet.getRow(2).getCell(1);
        System.out.println(row3cell2.toString());

        //find the number of row
        int lastRowNumber = sheet.getLastRowNum() + 1; //index starts at 0
        System.out.println(lastRowNumber);

        //find the number of used row
        int usedNumberRow= sheet.getPhysicalNumberOfRows();
        System.out.println(usedNumberRow); //index starts at 1

        //print country,capital key value pairs as map object

        Map<String,String> worldCapitlas = new HashMap<>();
        int countryColumn = 0;
        int capitalColumn = 1;

        for(int rowNumber = 1;rowNumber<lastRowNumber;rowNumber++){
            String countries = sheet.getRow(rowNumber).getCell(countryColumn).toString();
            String capitals = sheet.getRow(rowNumber).getCell(capitalColumn).toString();

            System.out.println("COUNTRIES" + countries);
            System.out.println("CAPITALS" + capitals);

            worldCapitlas.put(countries,capitals);

        }

        System.out.println(worldCapitlas);





    }
}
