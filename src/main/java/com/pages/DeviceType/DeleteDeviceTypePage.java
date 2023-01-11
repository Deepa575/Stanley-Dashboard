package com.pages.DeviceType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class DeleteDeviceTypePage {

	private WebDriver driver;
	private boolean msg = false;
	private boolean toaster = false;

	private By menuButton = By.xpath("//*[@id='fit-window']/div[2]/div/app-header/div[1]/div[1]/div/div[2]/i");
	private By countDeviceType = By.xpath("//*[@id='device_type_table']/tbody/tr/td[2]/span");
	private By yesButton = By.xpath("//app-delete/div/div[2]/div/button[2]");
	private By toasterMsg = By.xpath("");

	public DeleteDeviceTypePage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnMenuButton() {
		driver.findElement(menuButton).click();
	}

	public void deleteDeviceType(String deviceType) throws InterruptedException {
		int size = driver.findElements(countDeviceType).size();
		int i;
		for (i = 1; i <= size; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver
					.findElement(By.xpath("//*[@id='device_type_table']/tbody/tr[" + i + "]/td[2]/span"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			if (Element.getText().equals(deviceType)) {
				driver.findElement(By.xpath("//*[@id='device_type_table']/tbody/tr[" + i + "]/td[4]/div/button[2]/i"))
						.click();
				Thread.sleep(2000);
				driver.findElement(yesButton).click();
				Thread.sleep(2000);
				msg = true;
				break;
			}
		}
		if (i > size) {
			Reporter.log("Entered Device Type does NOT exists in Table", true);
		}

	}

	public void verifyToasterMsg(String ExpectedMsg) throws InterruptedException {
		if (msg == true) {
			String ActMsg = driver.findElement(toasterMsg).getText();
			Assert.assertEquals(ActMsg, ExpectedMsg);
			Reporter.log("Toaster message Verified", true);
			Thread.sleep(2000);
			toaster = true;
		}
	}
	
	public void verifyDeviceTypeIsDeletedFromTable(String deviceType) throws InterruptedException {
		if(toaster==true) {
			int size1 = driver.findElements(countDeviceType).size();
			int j;
			for (j = 1; j <= size1; j++) {
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement Element = driver
						.findElement(By.xpath("//*[@id='device_type_table']/tbody/tr[" + j + "]/td[2]/span"));
				js1.executeScript("arguments[0].scrollIntoView();", Element);
				if (Element.getText().equals(deviceType)) {
					driver.findElement(By.xpath("//*[@id='device_type_table']/tbody/tr[" + j + "]/td[4]/div/button[2]/i"))
							.click();
					Thread.sleep(2000);
					driver.findElement(yesButton).click();
					Thread.sleep(2000);
					msg = true;
					break;
				}
			}
		}
	}

}
