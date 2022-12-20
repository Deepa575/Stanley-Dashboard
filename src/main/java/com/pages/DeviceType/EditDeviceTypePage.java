package com.pages.DeviceType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditDeviceTypePage {

	private WebDriver driver;

	public EditDeviceTypePage(WebDriver driver) {
		this.driver = driver;
	}

	private By admin_Btn = By.xpath("//button[text()=' Administration ']");
	private By deviceType_link = By.xpath("//a[text()=' Device Type']");
	private By Device_type_search = By.xpath("//*[text()='Device Type *']//following-sibling::input");
	private By description_search = By.xpath("//*[text()='Description *']//following-sibling::textarea");
	private By submit = By.xpath("//*[text()=' Submit ']");
	private By toaster = By.xpath("//*[@role='alert']");

	public void click_devicetype(String edit_text) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(admin_Btn).click();
		driver.findElement(deviceType_link).click();
		driver.findElement(By.xpath("//td//span[text()=' " + edit_text + "']//following::td[2]//div//div[1]//i"))
				.click();
	}

	public void Edit_devices_text(String device_type, String Description) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (device_type.length() > 0) {
			driver.findElement(Device_type_search).clear();
			driver.findElement(Device_type_search).sendKeys(device_type);
		}
		if (Description.length() > 0) {
			driver.findElement(description_search).clear();
			driver.findElement(description_search).sendKeys(Description);
		}
		driver.findElement(submit).isDisplayed();
		driver.findElement(submit).click();
	}

	public void verify_edited_device_type(String toaster_message) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(toaster).isDisplayed();
		String message = driver.findElement(toaster).getText();
		Assert.assertEquals(message, toaster_message);
	}

	public void verify_table(String device_type, String Description) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (device_type.length() > 0) {
			System.out.println("-----");
			String devive_name = driver.findElement(By.xpath("//td//span[text()=' " + device_type + "']")).getText();
			Assert.assertEquals(devive_name, device_type);

		}
		if (Description.length() > 0) {
			String description_name = driver.findElement(By.xpath("//td//span[text()='" + Description + "']"))
					.getText();
			Assert.assertEquals(description_name, Description);
		}
	}
}
