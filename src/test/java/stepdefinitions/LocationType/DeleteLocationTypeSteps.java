package stepdefinitions.LocationType;

import com.driver.WebdriverInitializer;
import com.pages.LocationType.DeleteLocationTypePage;


import io.cucumber.java.en.When;

public class DeleteLocationTypeSteps {

	private DeleteLocationTypePage dlt = new DeleteLocationTypePage(WebdriverInitializer.getDriver());
	
	@When("Delete desired Location Type {string} {string}")
	public void delete_desired_location_type(String locType, String ExpMsg) throws InterruptedException {
	    dlt.deleteLocType(locType, ExpMsg);
	}
}
