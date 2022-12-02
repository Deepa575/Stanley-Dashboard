package stepdefinitions.LocationType;

import com.driver.WebdriverInitializer;
import com.pages.LocationType.DeleteLocationTypePage;


import io.cucumber.java.en.When;

public class DeleteLocationTypeSteps {

	private DeleteLocationTypePage dlt = new DeleteLocationTypePage(WebdriverInitializer.getDriver());
	
	@When("Delete desired Location Type ID {string} {string}")
	public void delete_desired_location_type_id(String locTypeID, String ExpMsg) throws InterruptedException {
	    dlt.deleteLocTypeID(locTypeID, ExpMsg);
	}
}
