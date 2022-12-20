package stepdefinitions.DeviceType;

import com.driver.WebdriverInitializer;
import com.pages.DeviceType.EditDeviceTypePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditDeviceTypeSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private EditDeviceTypePage st = new EditDeviceTypePage(WebdriverInitializer.getDriver());

	@Given("user click on Administrator {string}")
	public void user_click_on_administrator(String edit_text) {
		lgn.enterUsername("superadmin");
		lgn.enterPassword("stanley@123");
		lgn.clickOnSignIn();
	    st.click_devicetype(edit_text);
	}

	@When("user Edit devices {string} {string} {string}")
	public void user_edit_devices(String device_type, String Description, String toaster_message) {
	    st.Edit_devices_text(device_type, Description);
	    st.verify_edited_device_type(toaster_message);

	}

	@Then("verify devive type {string} {string}")
	public void verify_devive_type(String device_type, String Description) {
	    st.verify_table(device_type, Description);

	}
}
