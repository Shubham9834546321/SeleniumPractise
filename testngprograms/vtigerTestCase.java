package testngprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class vtigerTestCase extends SeleniumUtility {
  @Test
  public void create() throws InterruptedException {
		setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php" );
		driver.findElement(By.id("username"));	
driver.findElement(By.id("password"));
driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.cssSelector("div[class='row app-navigator']")).click();
driver.findElement(By.xpath("//div[@id='MARKETING_modules_dropdownMenu']/div")).click();//marketing
driver.findElement(By.cssSelector("ul[class='dropdown-menu app-modules-dropdown mCustomScrollbar _mCS_1 mCS_no_scrollbar']>div>div>li>*:first-child")).click();//click on campaign
driver.findElement(By.cssSelector("#Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();//add campaign
driver.findElement(By.cssSelector("#Campaigns_editView_fieldName_campaignname")).sendKeys("Shubham");//add name
driver.findElement(By.cssSelector("span[class='input-group-addon']")).click();//click on date
driver.findElement(By.xpath("//div[@class='datepicker-days']/table//tr[3]//td[4]")).click();//select date
driver.findElement(By.cssSelector("button[type='submit']")).click();//click on save button
Thread.sleep(2000);
  }

@Test(dependsOnMethods= {"create"})
public void Edit() throws InterruptedException {
	  WebElement edit= driver.findElement(By.cssSelector("#Campaigns_detailView_basicAction_LBL_EDIT"));//click on edit
	  clickOnElement(edit);
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#Campaigns_editView_fieldName_sponsor")).sendKeys("Infosys");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
	  
	 }
@Test(dependsOnMethods= {"create","Edit"})
public void delete() throws InterruptedException {
	  Thread.sleep(2000);
	driver.findElement(By.cssSelector("i[class='caret']")).click();
	  Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Delete Campaign']")).click();//click on delete
	//driver.findElement(By.cssSelector("#Campaigns_detailView_moreAction_Apagar_Campanha")).click();
	driver.findElement(By.cssSelector("button[data-bb-handler='confirm']")).click();//click on yes
}

}

