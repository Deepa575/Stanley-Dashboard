package com.pages.DeviceProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class EditDeviceProfilePage {

	private WebDriver driver;

	private By countOfDeviceProfileIDs = By.xpath("//tbody/tr/td[1]");
	private By editDevProfNameTxtbox = By.xpath("//*[text()='Device Profile Name * ']//following-sibling::input");
	private By editVersionTxtbox = By.xpath("//*[text()='Version *']//following::input");
	private By editDoorTypeDD = By.xpath("//*[text()='Door Type *']//following-sibling::select");
	private By editFromTxtbox = By.xpath("//*[text()='From *']//following::input[1]");
	private By editToTxtbox = By.xpath("//*[text()='To *']//following::input");
	private By Submit_btn = By.xpath("//button[text()='Submit']");
	private By ToasterMsg = By.xpath("//*[@id='toast-container']//following-sibling::div");

	public EditDeviceProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	public void editDeviceProfile(String devprofID, String devProfName, String version, String doorType, String from,
			String to, String ExpMsg) throws InterruptedException {
		int size = driver.findElements(countOfDeviceProfileIDs).size();
		int i;
		for (i = 1; i <= size; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			if (Element.getText().equals(devprofID)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()=' " + devprofID
						+ "']/parent::td//following-sibling::td/descendant::i[@title='Edit']")).click();

				Thread.sleep(2000);
				if (devProfName.length() >= 0) {
					driver.findElement(editDevProfNameTxtbox).clear();
					driver.findElement(editDevProfNameTxtbox).sendKeys(devProfName);
				}
				Thread.sleep(2000);

				if (version.length() >= 0) {
					driver.findElement(editVersionTxtbox).clear();
					driver.findElement(editVersionTxtbox).sendKeys(version);
				}
				Thread.sleep(2000);

				if (doorType.length() > 0) {

					driver.findElement(editDoorTypeDD).click();
					driver.findElement(By.xpath("//option[text()='" + doorType + "']")).click();
				}
				Thread.sleep(2000);

				if (from.length() > 0) {
					driver.findElement(editFromTxtbox).clear();
					driver.findElement(editFromTxtbox).sendKeys(from);
				}
				
				if (to.length() > 0) {
					driver.findElement(editToTxtbox).clear();
					driver.findElement(editToTxtbox).sendKeys(to);
				}
				Thread.sleep(2000);
				driver.findElement(Submit_btn).click();
				Thread.sleep(3000);

				String ActMsg = driver.findElement(ToasterMsg).getText();
				Assert.assertEquals(ActMsg, ExpMsg);
				Reporter.log("Device Profile Edited Successfully & Toaster message Verified", true);
				Thread.sleep(2000);
				break;

			}
		}
	}
}
