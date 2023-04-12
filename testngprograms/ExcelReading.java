package testngprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
  @Test
  public void readxl() throws IOException {
	  FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppTest.xlsx");
Workbook workbook=new XSSFWorkbook(fis);
Sheet sheet=workbook.getSheet("Sheet1");
Row row=sheet.getRow(2);
//int count=sheet.getLastRowNum();
//Cell cell=row.getCell(2);

int cellcount=row.getLastCellNum();
//System.out.println(cellcount);
for (int i = 0; i < cellcount; i++) {
	// System.out.println("Cell data: "+row.getCell(i).getStringCellValue());
	Cell cell = row.getCell(i);
	switch (cell.getCellType()) {
	case (Cell.CELL_TYPE_STRING):
		System.out.println("Cell Data: " + cell.getStringCellValue());
		break;
	case (Cell.CELL_TYPE_NUMERIC):
		System.out.println("Cell Data: " + cell.getNumericCellValue());
		break;
	case (Cell.CELL_TYPE_BOOLEAN):
		System.out.println("Cell Data: " + cell.getBooleanCellValue());
		break;
	case (Cell.CELL_TYPE_BLANK):
		break;
	default:
		System.out.println("Invalid cell details");
		break;
	}
}
  }
}
