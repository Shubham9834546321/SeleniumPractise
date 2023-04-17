package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmUpdate {
	public  orangeHrmUpdate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement update;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement clickOnSave;
	@FindBy(css="ul[class='oxd-main-menu']>*:nth-child(2)")
	private WebElement ClickOnPim;
	public WebElement getUpdate() throws InterruptedException {
		Thread.sleep(1000);
		return update;
	}
	public WebElement getClickOnSave() throws InterruptedException {
		Thread.sleep(1000);
		return clickOnSave;
	}
	public WebElement getClickOnPim() throws InterruptedException {
		Thread.sleep(1000);
		return ClickOnPim;
	}

}
