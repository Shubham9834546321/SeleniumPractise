package testngprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class UpdateExcel {
  @Test
  public void Update() throws IOException {
	  FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppTest.xlsx");
 Workbook workbook=new XSSFWorkbook(fis);
Sheet sheet=workbook.getSheet("Sheet1");
Row row=sheet.getRow(1);
Cell cell=row.createCell(4);
cell.setCellValue("Shubh");
FileOutputStream fos=new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\testData\\\\AppTest.xlsx");

workbook.write(fos);
fos.close();
  
  }  
}
