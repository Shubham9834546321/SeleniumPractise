package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmDashboardpage {
	public  orangeHrmDashboardpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="ul[class='oxd-main-menu']>*:nth-child(2)")
	private WebElement ClickOnPim;
	public WebElement getClickOnPim() throws InterruptedException {
		Thread.sleep(2000);
		return ClickOnPim;
	}
	
	

}
