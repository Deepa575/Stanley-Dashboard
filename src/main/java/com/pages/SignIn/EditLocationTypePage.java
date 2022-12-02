package com.pages.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

public class EditLocationTypePage {

	private WebDriver driver;

	private By countOfLocationTypeIDs = By.xpath("//tbody/tr/td[4]");
	// Edit Location Type
	private By Edit_LocType_Txtbox = By.xpath("//*[text()='Location Type *']//following-sibling::input");
	private By Edit_Descr_Textbox = By.xpath("//*[text()='Description *']//following::textarea");
	private By Edit_Phy_Location = By.xpath("//*[text()='Physical Location Type *']//following-sibling::select");
	private By Edit_Customer = By.xpath("//*[text()='Customers *']//following-sibling::select");
	private By Submit_btn = By.xpath("//button[text()='Submit']");
	private By ToasterMsg = By.xpath("//*[@id='toast-container']//following-sibling::div");
	// private By Failure_Toaster_Msg = By.xpath("//*[text()=' Duplicate Value
	// Entered ']");
	private By nextBtn = By.xpath("//a[text()=' Next ']");

	public EditLocationTypePage(WebDriver driver) {

		this.driver = driver;
	}

	public void editLocationType(String LocationTypeID, String locationType, String description, String phyLocType,
			String customer, String ExpMsg) throws InterruptedException {
		int size = driver.findElements(countOfLocationTypeIDs).size();
		// System.out.println(size);
		int i;
		for (i = 1; i <= size; i++) {
			Thread.sleep(1000);
			// String id = ;
			// System.out.println(id);
			if (driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[4]")).getText().equals(LocationTypeID)) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()=' " + LocationTypeID
						+ " ']/parent::td//following-sibling::td/descendant::i[@title='Edit']")).click();

				Thread.sleep(2000);
				if (locationType.length() >= 0) {
					driver.findElement(Edit_LocType_Txtbox).clear();
					driver.findElement(Edit_LocType_Txtbox).sendKeys(locationType);
				}
				Thread.sleep(2000);

				if (description.length() >= 0) {
					driver.findElement(Edit_Descr_Textbox).clear();
					driver.findElement(Edit_Descr_Textbox).sendKeys(description);
				}
				Thread.sleep(2000);

				if (phyLocType.length() > 0) {

					driver.findElement(Edit_Phy_Location).click();
					driver.findElement(By.xpath("//option[text()='" + phyLocType + "']")).click();
				}
				Thread.sleep(2000);

				if (customer.length() > 0) {
					driver.findElement(Edit_Customer).click();
					driver.findElement(By.xpath("//option[text()='" + customer + "']")).click();
				}
				Thread.sleep(2000);
				driver.findElement(Submit_btn).click();
				Thread.sleep(3000);

				String ActMsg = driver.findElement(ToasterMsg).getText();
				Assert.assertEquals(ActMsg, ExpMsg);
				Reporter.log("Location Type Edited Successfully & Toaster message Verified", true);
				Thread.sleep(2000);
				break;

			}
		}
		if (i > size && driver.findElement(nextBtn).isEnabled()) {
			driver.findElement(nextBtn).click();
			Thread.sleep(2000);
			int size1 = driver.findElements(countOfLocationTypeIDs).size();
			int j;
			for (j = 1; j <= size1; j++) {
				if (driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[4]")).getText().equals(LocationTypeID)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//span[text()=' " + LocationTypeID
							+ " ']/parent::td//following-sibling::td/descendant::i[@title='Edit']")).click();

					Thread.sleep(3000);
					if (locationType.length() >= 0) {
						driver.findElement(Edit_LocType_Txtbox).clear();
						driver.findElement(Edit_LocType_Txtbox).sendKeys(locationType);
					}
					Thread.sleep(3000);

					if (description.length() >= 0) {
						driver.findElement(Edit_Descr_Textbox).clear();
						driver.findElement(Edit_Descr_Textbox).sendKeys(description);
					}
					Thread.sleep(3000);

					if (phyLocType.length() > 0) {

						driver.findElement(Edit_Phy_Location).click();
						driver.findElement(By.xpath("//option[text()='" + phyLocType + "']")).click();
					}
					Thread.sleep(3000);

					if (customer.length() > 0) {
						driver.findElement(Edit_Customer).click();
						driver.findElement(By.xpath("//option[text()='" + customer + "']")).click();
					}
					Thread.sleep(3000);
					driver.findElement(Submit_btn).click();
					Thread.sleep(3000);

					String ActMsg = driver.findElement(ToasterMsg).getText();
					Assert.assertEquals(ActMsg, ExpMsg);
					Reporter.log("Location Type Edited Successfully & Toaster message Verified", true);
					Thread.sleep(2000);
					break;

				}
			}
			if (j > size1) {
				Reporter.log("Entered Location Type ID does NOT exists in Table", true);
			}
		}

	}

//		public void Edit_LocType_Sidepage() throws InterruptedException {

	// WebElement e1
	// =driver.findElement(By.xpath("//span[text()='"+iD+"']/parent::td//following-sibling::td/descendant::i[@title='Edit']"));
//			if(e1.isDisplayed())
//			{
//				e1.click();
//			}
//			else
//			{
//				Actions action= new Actions(driver);
//		        action.moveToElement(e1);
//		        action.perform();
//		        e1.click();
//			}
//			
//			}

	// public void Toaster_Message(String toaster_message) {
	// String msg= driver.findElement(Toaster_Msg).getText();
	// System.out.println(""+msg);

	// String
	// actual=driver.findElement(By.xpath("//*[@id='toast-container']//following-sibling::div[text()='"+msg+"']")).getText();

//			Assert.assertEquals(toaster_message, msg);

	// Assert.assertEquals(toaster_message, act,
	// "Expected : " + act + " But found : " + toaster_message);

}
