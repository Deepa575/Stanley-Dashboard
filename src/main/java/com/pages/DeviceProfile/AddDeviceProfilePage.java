package com.pages.DeviceProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddDeviceProfilePage {

	private WebDriver driver;

	private By deviceprofile_Txt = By.xpath("//input[@placeholder='Device Profile']");
	private By version_txt = By.xpath("//input[@placeholder='Version']");
	private By doortype_DD = By.xpath("//select[@formcontrolname='door_type']");
	private By from_txt = By.xpath("//input[@placeholder='From']");
	private By to_txt = By.xpath("//input[@placeholder='To']");
	private By data_cmd_grp_json = By.xpath("//input[@formcontrolname='data_command_group_json']");
	private By boot_cmd_grp_json = By.xpath("//input[@formcontrolname='boot_command_group_json']");
	private By submit_btn = By.xpath("//button[text()='Submit']");
	private By toaster_msg = By.xpath("//*[@id='toast-container']/div/div");

	public AddDeviceProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterDeviceProfileName(String DeviceProfileName) {
		driver.findElement(deviceprofile_Txt).sendKeys(DeviceProfileName);
	}

	public void enterVersion(String version) {
		driver.findElement(version_txt).sendKeys(version);
	}

	public void selectDoorType(String doorType) {
		driver.findElement(doortype_DD).click();
		driver.findElement(By.xpath("//option[contains(text(),'" + doorType + "')]")).click();
	}

	public void enterRangeFrom(String rangeFrom) {
		driver.findElement(from_txt).sendKeys(rangeFrom);
	}

	public void enterRangeTo(String rangeTo) {
		driver.findElement(to_txt).sendKeys(rangeTo);
	}

	public void uploadDataCmdGrpJson(String data_cmd_grp_json_path) {
		driver.findElement(data_cmd_grp_json).sendKeys(data_cmd_grp_json_path);
	}

	public void uploadBootCmdGrpJson(String boot_cmd_grp_json_path) {
		driver.findElement(boot_cmd_grp_json).sendKeys(boot_cmd_grp_json_path);
	}

	public void isSubmitBtnEnabled() {
		driver.findElement(submit_btn).isEnabled();
	}

	public void clickOnSubmitBtn() {
		driver.findElement(submit_btn).click();
	}

	public void verifyToasterMsg(String ExpMsg) throws InterruptedException {
		String ActMsg = driver.findElement(toaster_msg).getText();
		Assert.assertEquals(ActMsg, ExpMsg);
		Thread.sleep(5000);
	}
}
