package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class actiTimeTestCase extends SeleniumUtility{
  @Test
  public void AddTask() throws InterruptedException {
	  setUp("chrome", "https://demo.actitime.com");
	  WebElement username=SeleniumUtility.driver.findElement(By.id("username"));
	  typeInput(username, "admin");
	  WebElement password=SeleniumUtility.driver.findElement(By.name("pwd"));
	  typeInput(password, "manager");
	  WebElement login=SeleniumUtility.driver.findElement(By.id("loginButton"));
	  clickOnElement(login);
	  WebElement CLickOnTask=SeleniumUtility.driver.findElement(By.cssSelector("a[class='content tasks']"));
	  CLickOnTask.click();
	  WebElement CLickOnAddNewButton=SeleniumUtility.driver.findElement(By.cssSelector("div[class='addNewContainer']"));
	  CLickOnAddNewButton.click();
	  WebElement CLickOnNewTask=SeleniumUtility.driver.findElement(By.cssSelector("div[class='item createNewTasks']"));
	  CLickOnNewTask.click();
	  Thread.sleep(3000);
	  SeleniumUtility.driver.findElement(By.xpath("//div[@id='createTasksPopup_content']/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]")).click();//dropdown
	  Thread.sleep(3000);
	  SeleniumUtility.driver.findElement(By.cssSelector("tr[class='selectCustomerRow']>td>div>div>div>div>div>div>div")).click();
	  Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("Shubh");
	  Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("Health Domain");
	  SeleniumUtility.driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).sendKeys("Tester");
	  Thread.sleep(3000);
	  SeleniumUtility.driver.findElement(By.cssSelector("div[class='components_button withPlusIcon']>div")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(dependsOnMethods= {"AddTask"})	  
  public void Delete() throws InterruptedException {
		  SeleniumUtility.driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div")).click();
		  Thread.sleep(2000);
		  SeleniumUtility.driver.findElement(By.cssSelector("div[class='bulkOperationsPanel']>*:nth-child(6)")).click();
		  SeleniumUtility.driver.findElement(By.cssSelector("div[class='dialogWithPointerWrapper deleteDialog']>div>div>div>*:nth-child(6)>div>div")).click();
			
	  }

	  
  }

