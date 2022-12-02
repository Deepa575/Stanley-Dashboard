package stepdefinitions.LocationType;

import com.driver.WebdriverInitializer;
import com.pages.SignIn.EditLocationTypePage;
import com.pages.SignIn.HomePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLocationTypeSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	private EditLocationTypePage edtLocType = new EditLocationTypePage(WebdriverInitializer.getDriver());
	
	
	@Given("User is on Location Type page")
	public void user_is_on_location_type_page() throws InterruptedException {
	    lgn.enterUsername("superadmin");
	    lgn.enterPassword("stanley@123");
	    lgn.clickOnSignIn();
	    hp.clickOnAdminBtn();
	    hp.clickOnLocationTypeLink();
	}
	
	@When("User Edits Location Type {string} {string} {string} {string} {string} {string}")
	public void user_edits_location_type_exp_msg(String locationTypeID, String locType, String description, String phyLocType, String cust, String expMsg) throws InterruptedException {
		edtLocType.editLocationType(locationTypeID, locType, description, phyLocType, cust, expMsg);
	}
}
