package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchID {
	public  searchID(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement searchid;

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement Clicksearchid;

	public WebElement getSearchid() throws InterruptedException {
		Thread.sleep(2000);
		return searchid;
	}

	public WebElement getClicksearchid() {
		return Clicksearchid;
	}
	

}
