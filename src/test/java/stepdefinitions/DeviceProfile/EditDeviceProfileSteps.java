package stepdefinitions.DeviceProfile;

import com.driver.WebdriverInitializer;
import com.pages.DeviceProfile.EditDeviceProfilePage;
import com.pages.Home.HomePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditDeviceProfileSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	private EditDeviceProfilePage edp = new EditDeviceProfilePage(WebdriverInitializer.getDriver());
	
	
	@Given("Go to Device Profile Page")
	public void go_to_device_profile_page() {
	    lgn.enterUsername("superadmin");
	    lgn.enterPassword("stanley@123");
	    lgn.clickOnSignIn();
	    hp.clickOnAdminBtn();
	    hp.clickOnDeviceProfileLink();
	}

	@When("User Edits Device Profile {string} {string} {string} {string} {string} {string} {string}")
	public void user_edits_device_profile(String devProfID, String devProfName, String version, String doorType, String from, String to, String expMsg) throws InterruptedException {
		edp.editDeviceProfile(devProfID, devProfName, version, doorType, from, to, expMsg);
	}

}
