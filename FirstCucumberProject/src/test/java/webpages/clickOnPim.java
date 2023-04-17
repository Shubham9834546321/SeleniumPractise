package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickOnPim {
	public  clickOnPim(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "ul[class='oxd-main-menu']>*:nth-child(2)")
	private WebElement ClickOnPim;
	@FindBy(css=".oxd-table-cell-actions>button")
	private WebElement ClickOnDeleteBtn;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	private WebElement DoubleClickOnDeleteBtn;

	

	public WebElement getClickOnPim() throws InterruptedException {
		Thread.sleep(1000);
		return ClickOnPim;
	}



	public WebElement getClickOnDeleteBtn() {
		return ClickOnDeleteBtn;
	}



	public WebElement getDoubleClickOnDeleteBtn() {
		return DoubleClickOnDeleteBtn;
	}

	}


