package stepdefinitions.LocationType;

import com.driver.WebdriverInitializer;
import com.pages.Home.HomePage;
import com.pages.LocationType.AddLocationTypePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLocationTypeSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	private AddLocationTypePage loctype = new AddLocationTypePage(WebdriverInitializer.getDriver());
	
	@Given("User is on the Location Type Page")
	public void user_is_on_the_location_type_page() throws InterruptedException {
		lgn.enterUsername("superadmin");
		lgn.enterPassword("stanley@123");
		lgn.clickOnSignIn();
		hp.clickOnAdminBtn();
		hp.clickOnLocationTypeLink();
	}

	@When("User Click on Add Location Type button")
	public void user_click_on_add_location_type_button() throws InterruptedException {
		loctype.clickOnAddLocationTypeBtn();	   
	}
		
	@When("User Enters {string} {string} {string} {string}")
	public void user_enters(String Location_Type, String Description, String Physical_Location_Type, String Customers) throws InterruptedException {
	    
		loctype.Add_Loc_Sidepage(Location_Type,Description,Physical_Location_Type,Customers);
	    
	}

	@Then("Click on Submit button {string}")
	public void click_on_submit_button(String ExpMsg) throws InterruptedException {
	    loctype.clickOnSubmitBtn(ExpMsg);
	}
}
