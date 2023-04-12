package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class ExcelAssignment extends SeleniumUtility {
	String AppURL;
	String UserName;
	String Password;
	String ExpectedTitle;
	String Result;
	String ActualTitle;
@BeforeTest
	public void VitigerLogin() {
		AppURL = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 2);
		ExpectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 3);
		//Result = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 5);
		//ActualTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 4);
		}
@Test
	public void Vitiger1() {
		WebDriver driver = setUp("chrome", AppURL);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 4,
				getCurrentTitleOfApplication());
          if (getCurrentTitleOfApplication().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 5, "PASS");

		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 1, 5, "FAIL");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard");
}
@Test(priority = 1)
	public void vitiger2() throws InterruptedException {
		Thread.sleep(2000);
		AppURL = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 2);
		ExpectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 3);
		ActualTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 4);
		Result = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 5);
		WebDriver driver = setUp("chrome", AppURL);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 4,
				getCurrentTitleOfApplication());
       if (getCurrentTitleOfApplication().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 5, "PASS");

		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 2, 5, "FAIL");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard");
		}
@Test(priority = 2)
	public void Actitime1() throws InterruptedException {
        AppURL = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 2);
		ExpectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 3);
		ActualTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 4);
		Result = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 5);
		WebDriver driver = setUp("chrome", AppURL);
        Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(UserName);
        driver.findElement(By.name("pwd")).sendKeys(Password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 4,
				getCurrentTitleOfApplication());
             if (getCurrentTitleOfApplication().trim().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 5, "PASS");
         } else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 3, 5, "FAIL");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Enter Time-Track");
		Thread.sleep(2000);
		}
@Test(priority = 4)
	public void Actitime2() throws InterruptedException {
		Thread.sleep(2000);
         AppURL = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 2);
		ExpectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 3);
		//ActualTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 4);
	//	Result = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 5);
		WebDriver driver = setUp("chrome", AppURL);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		driver.findElement(By.id("loginButton")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 4,
				getCurrentTitleOfApplication());
if (getCurrentTitleOfApplication().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 5, "PASS");
} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 4, 5, "FAIL");
}
Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Enter Time-Track");
		Thread.sleep(2000);
	}
@Test(priority = 3)
public void OrangeHrm1() {
         AppURL = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 2);
		ExpectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 3);
		ActualTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 4);
		Result = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 5);
		WebDriver driver = setUp("chrome", AppURL);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 4,
				getCurrentTitleOfApplication());
if (getCurrentTitleOfApplication().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 5, "PASS");
} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 5, 5, "FAIL");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "OrangeHRM");
}
@Test(priority = 5)
public void OrangeHrm2() {
AppURL = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 0);
		UserName = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 1);
		Password = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 2);
		ExpectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 3);
		ActualTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 4);
		Result = ExcelUtility.getCellValue(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 5);
		WebDriver driver = setUp("chrome", AppURL);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 4,
				getCurrentTitleOfApplication());
if (getCurrentTitleOfApplication().equals(ExpectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 5, "PASS");
} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\testData\\AppTest.xlsx", "TC", 6, 5, "FAIL");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "OrangeHRM");

	}
}
