package stepdefinitions.SignIn;

import com.driver.WebdriverInitializer;
import com.pages.SignIn.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignInSteps {

    private SignInPage lp = new SignInPage(WebdriverInitializer.getDriver());

    @Given("Enter the Username and Password {string} {string}")
    public void enter_the_username_and_password(String Username, String Password) {
    	lp.enterUsername(Username);
    	lp.enterPassword(Password);
    }

    @When("click on Sign In")
    public void click_on_signin() {
    	lp.clickOnSignIn();
    }

    @Then("verify the home page")
    public void verify_the_home_page() {
       lp.verifyTheSignIn();
    }

}
