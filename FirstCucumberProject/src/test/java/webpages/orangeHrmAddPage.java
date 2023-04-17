package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmAddPage {
	public  orangeHrmAddPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "div[class='orangehrm-header-container']>button")
	private WebElement clickonAdd;
	public WebElement getClickonAdd() throws InterruptedException {
		Thread.sleep(1000);
		return clickonAdd;
	}

}
