package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class orangeHrmTestCase extends SeleniumUtility {
  @Test
  public void add() throws InterruptedException {
	  setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  WebElement username=SeleniumUtility.driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys("Admin");
	  WebElement pass=SeleniumUtility.driver.findElement(By.xpath("//input[@type='password']"));
	  pass.sendKeys("admin123");
	  SeleniumUtility.driver.findElement(By.xpath("//button[@type='submit']")).click();
	  SeleniumUtility.driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();
	  SeleniumUtility.driver.findElement(By.cssSelector("div[class='orangehrm-paper-container']>div>*:first-child")).click();//click on Add
	  SeleniumUtility.driver.findElement(By.name("firstName")).sendKeys("Shubham");//add first name
	  SeleniumUtility.driver.findElement(By.name("lastName")).sendKeys("Thool");//add last name
	  SeleniumUtility.driver.findElement(By.cssSelector("button[type='submit']")).click();
	  SeleniumUtility.driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();
	  Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Shubham");
	  Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.cssSelector(".oxd-table-cell-actions>*:last-child")).click();
	  Thread.sleep(2000);

  }
  @Test(dependsOnMethods= {"add"})
  public void Edit() throws InterruptedException {
	 
	  //update middle name
	  SeleniumUtility.driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Deepak");
	  Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	  SeleniumUtility.driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();
	  SeleniumUtility.driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Shubham");
	//click on search button

  }
  @Test(dependsOnMethods= {"add","Edit"})
  public void delete() throws InterruptedException {
	  SeleniumUtility.driver.findElement(By.xpath("//button[@type='submit']")).click();
	  SeleniumUtility.driver.findElement(By.cssSelector(".oxd-table-cell-actions>button")).click();//click on delete button
	  Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();

}
}