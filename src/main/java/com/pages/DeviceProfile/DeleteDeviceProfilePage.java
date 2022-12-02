package com.pages.DeviceProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class DeleteDeviceProfilePage {

	private WebDriver driver;

	private By yes_btn = By.xpath("//button[text()='Yes']");
	private By toaster_msg = By.xpath("//*[@id='toast-container']/div/div");
	private By count_devprofIDs = By.xpath("//tbody/tr/td[1]");

	public DeleteDeviceProfilePage(WebDriver driver) { 
		
		this.driver=driver;	
	}

	public void deleteDevprofID(String devprofID, String ExpMsg) throws InterruptedException {
		int size = driver.findElements(count_devprofIDs).size();
		int i;
		for (i = 1; i <= size; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver
					.findElement(By.xpath("//*[@id=\"device_profile_table\"]/tbody/tr[" + i + "]/td[1]/span"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			if (Element.getText().equals(devprofID)) {
				driver.findElement(By.xpath("//span[text()=' " + devprofID
						+ "']/parent::td//following-sibling::td/descendant::i[@title='Delete']")).click();
				Thread.sleep(2000);
				driver.findElement(yes_btn).click();
				Thread.sleep(2000);
				String ActMsg = driver.findElement(toaster_msg).getText();
				Assert.assertEquals(ActMsg, ExpMsg);
				Reporter.log("Device Profile Deleted Successfully & Toaster message Verified", true);
				Thread.sleep(2000);
				break;
			}
		}
		if (i > size) {
			Reporter.log("Entered Device Profile ID does NOT exists in Table", true);
		}

	}
}
