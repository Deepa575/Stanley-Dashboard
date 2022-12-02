package com.pages.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	private By admin_Btn = By.xpath("//button[text()=' Administration ']");
	private By deviceprof_Link = By.xpath("//a[text()=' Device Profile']");
	private By loctype_Link = By.xpath("//a[text()=' Location Type']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAdminBtn() {
		driver.findElement(admin_Btn).click();
	}
	
	public void clickOnDeviceProfileLink() {
		driver.findElement(deviceprof_Link).click();
	}
	
	public void clickOnLocationTypeLink() {
		driver.findElement(loctype_Link).click();;
	}
}
