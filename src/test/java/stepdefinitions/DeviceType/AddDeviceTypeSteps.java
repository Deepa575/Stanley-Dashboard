package stepdefinitions.DeviceType;

import org.testng.Reporter;

import com.driver.WebdriverInitializer;
import com.pages.DeviceType.AddDeviceTypePage;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDeviceTypeSteps {

	 private AddDeviceTypePage addDevice = new AddDeviceTypePage(WebdriverInitializer.getDriver());
	    private SignInPage lgn = new SignInPage(WebdriverInitializer.getDriver());
	    @Given("Go To Add DeviceType Page")
	    public void Go_To_Add_DeviceType_Page(){
	        lgn.enterUsername("superadmin");
	        lgn.enterPassword("stanley@123");
	        lgn.clickOnSignIn();
	        addDevice.clickOnAdministration();
	        addDevice.clickOnDeviceType();
	        addDevice.clickOnAddDeviceType();
	    	Reporter.log("User is on Add Device Type page", true);
	    }

	    @When("Enter Details Into Devicetype and Description {string} {string}")
	    public void enter_Details_Into_Devicetype_and_Description(String deviceType , String description){
	       addDevice.enterDeviceTypeDetails(deviceType,description);
	    }

	    @When("Click On Submit")
	    public void click_On_Submit(){
	        addDevice.clickOnSubmit();
	    }
	    @Then("Verify Toaster Message {string}")
	    public void verify_Toaster_Message(String expectedMessage) throws InterruptedException {
	        addDevice.verifyToasterMessage(expectedMessage);
	        Reporter.log("Toaster Message Verified", true);
	    }
}
