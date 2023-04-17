package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmFirstAndLastNmePage {
	public  orangeHrmFirstAndLastNmePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "input[name='firstName']")
	private WebElement enter_Name;

	@FindBy(css = "input[name='lastName']")
	private WebElement enter_Lastname;
	@FindBy(css = "button[type='submit']")
	private WebElement save_btn;
	public WebElement getEnter_Name() throws InterruptedException {
		Thread.sleep(1000);
		return enter_Name;
	}
	public WebElement getEnter_Lastname() throws InterruptedException {
		Thread.sleep(1000);
		return enter_Lastname;
	}
	public WebElement getSave_btn() throws InterruptedException {
		Thread.sleep(1000);
		return save_btn;
	}

}
