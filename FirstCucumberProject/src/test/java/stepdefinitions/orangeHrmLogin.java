package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.clickOnPim;
import webpages.orangeHrmAddPage;
import webpages.orangeHrmDashboardpage;
import webpages.orangeHrmEdit;
import webpages.orangeHrmFirstAndLastNmePage;
import webpages.orangeHrmHomePage;
import webpages.orangeHrmUpdate;
import webpages.searchID;

public class orangeHrmLogin extends SeleniumUtility {
	orangeHrmHomePage getorangeHrmHomePage;
	orangeHrmDashboardpage clickOnPIM;
	orangeHrmAddPage clickAdd;
	orangeHrmFirstAndLastNmePage addName;
	clickOnPim pimClick;
	orangeHrmEdit clickOnEdit;
	WebDriver driver;
	searchID search;
	orangeHrmUpdate updateName;

	@Given("^user are already in orange HRM login page$")
	public void user_are_already_in_orange_hrm_login_page() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		getorangeHrmHomePage = new orangeHrmHomePage(driver);
	}

	@And("^login with using a valid username as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_using_a_valid_username_as_something_and_password_something(String username,
			String password) {
		typeInput(getorangeHrmHomePage.getUsernameField(), username);
		typeInput(getorangeHrmHomePage.getPasswordField(), password);
		clickOnElement(getorangeHrmHomePage.getLoginButton());
	}

	@And("^from the dashboard page click on Pim link$")
	public void from_the_dashboard_page_click_on_pim_link() throws InterruptedException {
		clickOnPIM = new orangeHrmDashboardpage(driver);
		clickOnElement(clickOnPIM.getClickOnPim());

	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws InterruptedException {
		clickAdd=new orangeHrmAddPage(driver);
		clickOnElement(clickAdd.getClickonAdd());

	}

	   @And("^enter firstName as \"([^\"]*)\",lastName as \"([^\"]*)\", click on save button$")
	    public void enter_firstname_as_somethinglastname_as_something_click_on_save_button(String strArg1, String strArg2) throws InterruptedException {
		   addName=new orangeHrmFirstAndLastNmePage(driver);
		   typeInput(addName.getEnter_Name(), strArg1);
		   typeInput(addName.getEnter_Lastname(), strArg2);
		   clickOnElement(addName.getSave_btn());
	    }
	@And("^click on pim link$")
	public void click_on_pim_link() throws InterruptedException {
		pimClick=new clickOnPim(driver);	
		clickOnElement(pimClick.getClickOnPim());
		
}
	  @And("^search created employee as \"([^\"]*)\"$")
	    public void search_created_employee_as_something(String searchid) throws InterruptedException   {
		  search=new searchID(driver);
		  typeInput(search.getSearchid(), searchid);
		  clickOnElement(search.getClicksearchid());
		  
	  }

	    @When("^user select the checkbox and click on edit button$")
	    public void user_select_the_checkbox_and_click_on_edit_button() throws InterruptedException  {
	    	clickOnEdit=new orangeHrmEdit(driver);
	    	clickOnElement(clickOnEdit.getClickOnEdit());
	         }

	    @And("^enter midle name as a \"([^\"]*)\",click on save button$")
	    public void enter_midle_name_as_a_somethingclick_on_save_button(String strArg1) throws Throwable {
	    	updateName=new orangeHrmUpdate(driver);
	    	typeInput(updateName.getUpdate(), strArg1);
	    	clickOnElement(updateName.getClickOnSave());
	    }

	    @And("^click on pim and search id as a \"([^\"]*)\"$")
	    public void click_on_pim_and_search_id_as_a_something(String strArg1) throws InterruptedException  {
	    	pimClick=new clickOnPim(driver);
	    	search=new searchID(driver);
	    	clickOnElement(pimClick.getClickOnPim());
	    	typeInput(search.getSearchid(), strArg1);
	    	clickOnElement(search.getClicksearchid());
	        
	    }
	    @When("^user click on delete button$")
	    public void user_click_on_delete_button()  {
	    	pimClick=new clickOnPim(driver);
	    	clickOnElement(pimClick.getClickOnDeleteBtn());
	        
	    }

	    @And("^again click on popup detele button$")
	    public void again_click_on_popup_detele_button()  {
	    	pimClick=new clickOnPim(driver);
	    	clickOnElement(pimClick.getDoubleClickOnDeleteBtn());
	       
	    }



}
