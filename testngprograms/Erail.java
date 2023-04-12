package testngprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Erail extends SeleniumUtility {
  @Test
  public void SwitchChildWindow() throws InterruptedException {
	  setUp("chrome", "https://erail.in/");
	  String homepage=driver.getWindowHandle();
	  System.out.println(homepage);
        WebElement element=SeleniumUtility.driver.findElement(By.xpath("//a[@href='https://www.ecatering.irctc.co.in/']"));
		element.click();
		Set<String>AllWindow=driver.getWindowHandles();
//		List<String>WindowIdList=new ArrayList(AllWindow);
//		String ParentWinId=WindowIdList.get(0);
//				String childWinId=WindowIdList.get(1);
//		
		System.out.println(AllWindow);
		AllWindow.remove( homepage);
		Iterator<String> itr = AllWindow.iterator();
	
		String childWinId = itr.next();
		driver.switchTo().window(childWinId);
		driver.findElement(By.xpath("//input[@class='form-input pl-12  h-16 pl-12 pr-4 text-lg shadow-6dp']")).click();
      WebElement pass=driver.findElement(By.xpath("//input[@class='form-input pl-12  text-sm']"));
	typeInput(pass, "12627");
	driver.findElement(By.xpath("//button[@class='body-3 h-10 w-full px-4 text-left leading-relaxed text-gray-60 ']")).click();
	
 
WebElement calender=driver.findElement(By.xpath("//input[@class='form-input custom-date-picker h-11.5 pl-12 text-sm']"));
calender.click();
calender.sendKeys(Keys.ARROW_DOWN);
calender.sendKeys(Keys.ARROW_DOWN);
calender.sendKeys(Keys.ARROW_DOWN);
calender.sendKeys(Keys.ARROW_DOWN);
calender.sendKeys(Keys.ARROW_DOWN);
calender.sendKeys(Keys.ENTER);
Thread.sleep(2000);



	WebElement station=driver.findElement(By.xpath("//select[@class='form-input h-11.5 appearance-none pl-12 text-sm']"));
	clickOnElement(station);
	Thread.sleep(2000);
	//station.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	for (int i = 0; i < 27; i++) {
		station.sendKeys(Keys.ARROW_DOWN);
	}
	station.sendKeys(Keys.ENTER);

	  

	WebElement submit=driver.findElement(By.xpath("//button[@class='btn-primary w-full']"));
	clickOnElement(submit);


	List<WebElement> AllRes=driver.findElements(By.xpath("//div[@class='w-2/3 pl-6 flex flex-col gap-4 pt-10 pb-24']/div/div/div/div[2]/div/h5"));
for(int i=0;i<AllRes.size();i++) {
	WebElement restaurant=AllRes.get(i);
	System.out.println(restaurant.getText());
	

	
}

driver.switchTo().window(homepage);
  }
	
@Test(priority=1)
public void  SwitchParentdWindow() {
WebElement cityFrom=driver.findElement(By.cssSelector("#txtStationFrom"));
	typeInput(cityFrom, "pune");
	driver.findElement(By.xpath("//div[@title='Hadapsar (Pune)']")).click();
	WebElement cityTO=driver.findElement(By.cssSelector("#txtStationTo"));
	typeInput(cityTO, "bangalore");
	driver.findElement(By.xpath("//div[@title='Bangalore East']")).click();
	driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
	driver.findElement(By.xpath("//table[@class='WithBorder']/tbody/tr/td[2]/table/tbody/tr[4]/td[4]")).click();
	List<WebElement> AllTrain=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[2]/td[2]"));
	for(int i=0;i<AllTrain.size();i++) {
		WebElement Trains=AllTrain.get(i);
		System.out.println( Trains.getText());
		

	}


}
}




