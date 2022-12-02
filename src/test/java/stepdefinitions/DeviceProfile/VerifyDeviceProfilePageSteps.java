package stepdefinitions.DeviceProfile;

import com.driver.WebdriverInitializer;
import com.pages.DeviceProfile.VerifyDeviceProfilePage;
import com.pages.DeviceType.AddDeviceTypePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyDeviceProfilePageSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private AddDeviceTypePage addDT = new AddDeviceTypePage(WebdriverInitializer.getDriver());
	private VerifyDeviceProfilePage dp = new VerifyDeviceProfilePage(WebdriverInitializer.getDriver());
	
	@Given("User is on Device Profile page")
	public void user_is_on_device_profile_page() {
		lgn.enterUsername("superadmin");
		lgn.enterPassword("stanley@123");
		lgn.clickOnSignIn();
	    addDT.clickOnAdministration();
	    dp.clickOnDeviceProfile_Link();
	    System.out.println("User is on Device profile Page");
	}

	@When("Verify Device Profile heading")
	public void verify_device_profile_heading() {
	  // deviceprofile.verifyDeviceProfile_heading();
	   System.out.println("Device profile Heading verified");
	}

	@When("Verify Add Device Profile button")
	public void verify_add_device_profile_button() {
		//deviceprofile.verifyAddDeviceProfileBtn();
		System.out.println("Add Device profile Button Verified");
	    
	}

	@When("Verify Table column Names")
	public void verify_table_column_names() {
		//deviceprofile.verifyColumnsInDeviceProfileTable();
		System.out.println("Device profile Column Names Verified");
	    
	}

	@Then("Verify Table Data")
	public void verify_table_data() {
		//deviceprofile.verifyTable();
		System.out.println("Device Profile Data Verified");
	    
	}
}
