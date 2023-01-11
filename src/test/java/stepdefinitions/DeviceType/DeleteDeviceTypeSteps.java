package stepdefinitions.DeviceType;

import com.driver.WebdriverInitializer;
import com.pages.DeviceType.AddDeviceTypePage;
import com.pages.DeviceType.DeleteDeviceTypePage;
import com.pages.Home.HomePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteDeviceTypeSteps {
	
	private SignInPage lp = new SignInPage(WebdriverInitializer.getDriver());
	private HomePage hp = new HomePage(WebdriverInitializer.getDriver());
	private AddDeviceTypePage adt = new AddDeviceTypePage(WebdriverInitializer.getDriver());
	private DeleteDeviceTypePage ddt = new DeleteDeviceTypePage(WebdriverInitializer.getDriver());
	

	@Given("Go to Device Type Page")
	public void go_to_device_type_page(){
	    lp.enterUsername("superadmin");
	    lp.enterPassword("stanley@123");
	    lp.clickOnSignIn();
	    ddt.clickOnMenuButton();
	    hp.clickOnAdminBtn();
		adt.clickOnDeviceType();  
	}

	@When("Delete desired Device Type {string}")
	public void delete_desired_device_type(String DeviceType) throws InterruptedException {
	    ddt.deleteDeviceType(DeviceType);
	}
	
	@Then("Verify Toaster Message for Delete Device Type {string}")
	public void verify_toaster_message_for_delete_device_type(String ExpMsg) throws InterruptedException {
	    ddt.verifyToasterMsg(ExpMsg);
	}
	
	@Then("Verify Device Type is Deleted from Device Type Table{string}")
	public void verify_device_type_is_deleted_from_device_type_table(String deviceType) {
	    
	}

}
