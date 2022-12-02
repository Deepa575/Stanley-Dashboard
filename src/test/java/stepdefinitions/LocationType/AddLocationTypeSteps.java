package stepdefinitions.LocationType;

import com.driver.WebdriverInitializer;
import com.pages.SignIn.HomePage;
import com.pages.SignIn.LocationType_Page;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLocationTypeSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	private LocationType_Page loctype = new LocationType_Page(WebdriverInitializer.getDriver());
	
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

	@Then("Verify Submit button is Enabled for Add Location Type")
	public void verify_submit_button_is_enabled_for_add_location_type() {
		loctype.isSubmitButtonEnabled();
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
	    loctype.clickOnSubmitBtn();
	}

	@Then("Verify Toaster Meassage for Add Location Type {string}")
	public void verify_toaster_meassage_for_add_location_type(String ExpMsg) throws InterruptedException {
		loctype.verifyToasterMsg(ExpMsg);;	    
	}
}
