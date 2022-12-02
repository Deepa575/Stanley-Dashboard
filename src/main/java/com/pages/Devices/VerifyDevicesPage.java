package com.pages.Devices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyDevicesPage {

	private WebDriver driver;
	private By Devices_Link = By.xpath("//a[text()=' Devices']");
	private By Devices_heading = By.xpath("//span[text()='Devices']");
	private By NoOfColumns = By.xpath("//th");
	private By NoOfRows = By.xpath("//tbody/tr");

	public VerifyDevicesPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnDevices_Link() {
		driver.findElement(Devices_Link).click();
	}

	public void VerifyDevicesHeading() {
		driver.findElement(Devices_heading).isDisplayed();
	}

	public int getNoOfColumns() {
		int NoOfColmns = driver.findElements(NoOfColumns).size();
		return NoOfColmns;
	}

	public void verifycolumns() {
		for (int i = 0; i <= getNoOfColumns(); i++) {
			driver.findElement(By.xpath("//th[" + i + "]")).isDisplayed();
		}
	}

	public int getNoOfRows() {
		int NoOfRws = driver.findElements(NoOfRows).size();
		return NoOfRws;
	}

	public void verifyTable() {
		for (int i = 0; i <= getNoOfRows(); i++) {

			for (int j = 0; j <= getNoOfColumns(); j++) {
				driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).isDisplayed();
			}
		}
	}
}
