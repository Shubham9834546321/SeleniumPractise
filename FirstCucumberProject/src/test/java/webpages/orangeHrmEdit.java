package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmEdit {
	public  orangeHrmEdit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".oxd-table-cell-actions>*:last-child")
	private WebElement clickOnEdit;
	public WebElement getClickOnEdit() throws InterruptedException {
		Thread.sleep(2000);
		return clickOnEdit;
	}

}
