package com.pages.DeviceProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyDeviceProfilePage {

	private WebDriver driver;
	private By DeviceProfile_link = By.xpath("//a[text()=' Device Profile']");
	private By DeviceProfile_heading = By.xpath("//span[text()='Device Profile']");
	private By AddDeviceProfile_btn = By.xpath("//button[text()='Add Device Profile ']");
	private By NoOfColumns = By.xpath("//th");
	private By NoOfRows = By.xpath("//tbody/tr");

	public VerifyDeviceProfilePage(WebDriver driver) {

			this.driver = driver;
		}

	public void clickOnDeviceProfile_Link() {
		driver.findElement(DeviceProfile_link).click();
	}

	public void verifyDeviceProfile_heading() {
		driver.findElement(DeviceProfile_heading).isDisplayed();
	}

	public void verifyAddDeviceProfileBtn() {
		driver.findElement(AddDeviceProfile_btn).isDisplayed();

	}

	public void clickOnAddDeviceprofileBtn() {
		driver.findElement(AddDeviceProfile_btn).click();
	}

	public int getNoOfColumnsInDeviceProfileTable() {
		int NoOfColmns = driver.findElements(NoOfColumns).size();
		return NoOfColmns;
	}

	public void verifyColumnsInDeviceProfileTable() {
		for (int i = 0; i <= getNoOfColumnsInDeviceProfileTable(); i++) {
			driver.findElement(By.xpath("//th[" + i + "]")).isDisplayed();
		}
	}

	public int getNoOfRowsInDeviceProfileTable() {
		int NoOfColmns = driver.findElements(NoOfRows).size();
		return NoOfColmns;
	}

	public void verifyTable() {
		for (int i = 0; i <= getNoOfRowsInDeviceProfileTable(); i++) {

			for (int j = 0; j <= getNoOfColumnsInDeviceProfileTable(); j++) {
				driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).isDisplayed();
			}
		}
	}
}
