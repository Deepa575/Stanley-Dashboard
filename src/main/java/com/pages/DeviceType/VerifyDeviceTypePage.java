package com.pages.DeviceType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyDeviceTypePage {

	private WebDriver driver;
	private By DeviceType_heading = By.xpath("//span[text()='Device Type']");
	private By addDeviceType_btn = By.xpath("//button[text()='Add Device Type ']");
	private By Sorting_icon = By.xpath("//th[2]/i");
	private By NoOfRows = By.xpath("//tbody/tr");
	private By NoOfColumns = By.xpath("//th");

	public VerifyDeviceTypePage(WebDriver driver) {

		this.driver = driver;
	}

	public void verifyDeviceTypeTxt() {
		driver.findElement(DeviceType_heading).isDisplayed();
	}

	public void verifyAddDeviceTypeBtn() {
		driver.findElement(addDeviceType_btn).isDisplayed();
	}

	public int getNoOfRowsInDeviceTypeTable() {
		int NoOfRws = driver.findElements(NoOfRows).size();
		return NoOfRws;
	}

	public int getNoOfColumnsInDeviceTypeTable() {
		int NoOfCols = driver.findElements(NoOfColumns).size();
		return NoOfCols;
	}

	public void verifycolumns() {
		for (int i = 0; i <= getNoOfColumnsInDeviceTypeTable(); i++) {
			driver.findElement(By.xpath("//th[" + i + "]")).isDisplayed();
		}
	}

	public void verifyTable() {
		for (int i = 0; i <= getNoOfRowsInDeviceTypeTable(); i++) {

			for (int j = 0; j <= getNoOfColumnsInDeviceTypeTable(); j++) {
				driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).isDisplayed();
			}
		}
	}

	public void clickOnSorting_icon() {
		driver.findElement(Sorting_icon).click();
	}
}
