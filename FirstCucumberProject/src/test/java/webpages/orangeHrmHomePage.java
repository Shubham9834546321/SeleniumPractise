package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmHomePage {
	public  orangeHrmHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameField;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordField;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}
public WebElement getLoginButton() {
		return loginButton;
	}

}
