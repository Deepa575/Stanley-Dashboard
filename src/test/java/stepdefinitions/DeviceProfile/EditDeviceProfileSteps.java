package stepdefinitions.DeviceProfile;

import com.driver.WebdriverInitializer;
import com.pages.SignIn.HomePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditDeviceProfileSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	
	
	@Given("Go to Device Profile Page")
	public void go_to_device_profile_page() {
	    lgn.enterUsername("superadmin");
	    lgn.enterPassword("stanley@123");
	    lgn.clickOnSignIn();
	    hp.clickOnAdminBtn();
	    hp.clickOnDeviceProfileLink();
	}

	@When("Edit Device Profile Name {string}")
	public void edit_device_profile_name(String string) {
	  
	}

	@When("Edit Version {string}")
	public void edit_version(String string) {
	    
	}

	@When("Edit Door Type {string}")
	public void edit_door_type(String string) {
	   
	}

	@When("Edit Firmware Range From {string}")
	public void edit_firmware_range_from(String string) {
	 
	}

	@When("Edit Firmware Range To {string}")
	public void edit_firmware_range_to(String string) {
	  
	}
}
