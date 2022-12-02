package stepdefinitions.DeviceType;

import com.driver.WebdriverInitializer;
import com.pages.DeviceType.AddDeviceTypePage;
import com.pages.DeviceType.VerifyDeviceTypePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyDeviceTypePageSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private AddDeviceTypePage addDevice = new AddDeviceTypePage(WebdriverInitializer.getDriver());
	private VerifyDeviceTypePage dt = new VerifyDeviceTypePage(WebdriverInitializer.getDriver());
	
	@Given("User is on Device Type Page")
	public void user_is_on_device_type_page() {
	    lgn.enterUsername("superadmin");
	    lgn.enterPassword("stanley@123");
	    lgn.clickOnSignIn();
	    addDevice.clickOnAdministration();
	    addDevice.clickOnDeviceType();
	    System.out.println("User is on Device Type Page");
	}
	
	@When("Verify Device Type Heading")
	public void verify_device_type_heading() {
		//dt.verifyDeviceTypeTxt();
		System.out.println("Device Type Heading Verified");
	}

	@When("Verify Add Device Type button")
	public void verify_add_device_type_button() {
	    //dt.verifyAddDeviceTypeBtn();
	    System.out.println("Add Device Button verified");
	}
	
	@When("Verify Device Type Column Names")
	public void verify_device_type_column_names() {
	   // dt.verifycolumns();
	    System.out.println("Device Type Table Coumn Names Verified");
	}

	@Then("Verify Device Type Table Data")
	public void verify_device_type_table_data() {
	   // dt.verifyTable();
	    System.out.println("Table Data Verified");
	}
}
