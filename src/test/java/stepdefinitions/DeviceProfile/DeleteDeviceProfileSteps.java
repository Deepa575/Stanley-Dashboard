package stepdefinitions.DeviceProfile;

import com.driver.WebdriverInitializer;
import com.pages.DeviceProfile.DeleteDeviceProfilePage;
import com.pages.DeviceProfile.VerifyDeviceProfilePage;
import com.pages.SignIn.HomePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeleteDeviceProfileSteps {

	private SignInPage lp = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	private VerifyDeviceProfilePage dp = new VerifyDeviceProfilePage(WebdriverInitializer.getDriver());
	private DeleteDeviceProfilePage ddp = new DeleteDeviceProfilePage(WebdriverInitializer.getDriver());
	
	@Given("Go to Device Profile page")
	public void go_to_device_profile_page() {
	   lp.enterUsername("superadmin");
	   lp.enterPassword("stanley@123");
	   lp.clickOnSignIn();
	   hp.clickOnAdminBtn();
	   hp.clickOnDeviceProfileLink();
	}
	
	@When("Delete desired Device Profile ID {string} {string}")
	public void delete_desired_device_profile_id(String devprofID, String ExpMsg) throws InterruptedException {
		ddp.deleteDevprofID(devprofID, ExpMsg);
	}
}
