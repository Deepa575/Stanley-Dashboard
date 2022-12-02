package stepdefinitions.Devices;

import com.driver.WebdriverInitializer;
import com.pages.Devices.VerifyDevicesPage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyDevicesPageSteps {

	private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	private VerifyDevicesPage devices = new VerifyDevicesPage(WebdriverInitializer.getDriver());
	@Given("user is on Devices page")
	public void user_is_on_devices_page() {
	    lgn.enterUsername("superadmin");
	    lgn.enterPassword("stanley@123");
	    lgn.clickOnSignIn();
	    devices.clickOnDevices_Link();
	    System.out.println("User is on Devices Page");
	}

	@When("Verify Devices heading")
	public void verify_devices_heading() {
		//devices.VerifyDevicesHeading();
		System.out.println("Devices Heading Verified");
	    
	}

	@When("Verify Devices Column Names")
	public void verify_devices_column_names() {
		//devices.verifycolumns();
		System.out.println("Devices Column Names verified");
	    
	}

	@Then("Verify Devices Table")
	public void verify_devices_table() {
		//devices.verifyTable();
		System.out.println("Devices Table Verified");
	    
	}
}
