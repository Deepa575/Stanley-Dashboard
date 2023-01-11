package stepdefinitions.DeviceProfile;

import com.driver.WebdriverInitializer;
import com.pages.DeviceProfile.AddDeviceProfilePage;
import com.pages.DeviceProfile.VerifyDeviceProfilePage;
import com.pages.Home.HomePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDeviceProfileSteps {

	private SignInPage lp = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	private VerifyDeviceProfilePage dp = new VerifyDeviceProfilePage(WebdriverInitializer.getDriver());
	private AddDeviceProfilePage add_dp = new AddDeviceProfilePage(WebdriverInitializer.getDriver());

	@Given("Go to Add Device Profile window")
	public void go_to_add_device_profile_window() {
		lp.enterUsername("superadmin");
		lp.enterPassword("stanley@123");
		lp.clickOnSignIn();
		hp.clickOnAdminBtn();
		hp.clickOnDeviceProfileLink();
		dp.clickOnAddDeviceprofileBtn();
	}

	@When("Enter Device Profile Name {string}")
	public void enter_device_profile_name(String DeviceProfileName) throws InterruptedException {
		add_dp.enterDeviceProfileName(DeviceProfileName);
		Thread.sleep(1000);
	}

	@When("Enter Version {string}")
	public void enter_version(String Version) throws InterruptedException {
		add_dp.enterVersion(Version);
		Thread.sleep(1000);
	}

	@When("Select Door Type {string}")
	public void select_door_type(String DoorType) throws InterruptedException {
		add_dp.selectDoorType(DoorType);
		Thread.sleep(1000);
	}

	@When("Enter Firmware Range From {string}")
	public void enter_firmware_range_from(String RangeFrom) throws InterruptedException {
		add_dp.enterRangeFrom(RangeFrom);
		Thread.sleep(1000);
	}

	@When("Enter Firmware Range TO {string}")
	public void enter_firmware_range_to(String RangeTo) throws InterruptedException {
		add_dp.enterRangeTo(RangeTo);
		Thread.sleep(1000);
	}

	@When("Upload Data Command Group JSON {string}")
	public void upload_data_command_group_json(String data_cmd_grp_json_path) throws InterruptedException {
		add_dp.uploadDataCmdGrpJson(data_cmd_grp_json_path);
		Thread.sleep(1000);
	}

	@When("Upload Boot Command Group JSON {string}")
	public void upload_boot_command_group_json(String boot_cmd_grp_json_path) throws InterruptedException {
		add_dp.uploadBootCmdGrpJson(boot_cmd_grp_json_path);
		Thread.sleep(1000);
	}

	@When("Click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		add_dp.clickOnSubmitBtn();
	}

	@Then("Verify Toaster Message for Add Device Profile {string}")
	public void verify_toaster_message_for_add_device_profile(String ExpMsg) throws InterruptedException {
		add_dp.verifyToasterMessage(ExpMsg);
	}

}
