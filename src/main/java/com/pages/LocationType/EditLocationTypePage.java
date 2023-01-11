package com.pages.LocationType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class EditLocationTypePage {

	private WebDriver driver;

	private By countOfLocationTypeIDs = By.xpath("//tbody/tr/td[4]");
	private By Edit_LocType_Txtbox = By.xpath("//*[text()='Location Type *']//following-sibling::input");
	private By Edit_Descr_Textbox = By.xpath("//*[text()='Description *']//following::textarea");
	private By Edit_Phy_Location = By.xpath("//*[text()='Physical Location Type *']//following-sibling::select");
	private By Edit_Customer = By.xpath("//div/div[4]/div/vl-select/ng-select/div/span");
	private By Submit_btn = By.xpath("//button[text()='Submit']");
	private By ToasterMsg = By.xpath("//*[@id='toast-container']//following-sibling::div");
	private By nextBtn = By.xpath("//a[text()=' Next ']");

	public EditLocationTypePage(WebDriver driver) {

		this.driver = driver;
	}

	public void editLocationType(String oldLocType, String newlocType, String description, String phyLocType,
			String customer, String ExpMsg) throws InterruptedException {
		int size = driver.findElements(countOfLocationTypeIDs).size();
		int i;
		boolean flag = true;
		for (i = 1; i <= size; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			if (Element.getText().equals(oldLocType)) {
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement edit = driver.findElement(By.xpath("//span[text()='" + oldLocType
						+ "']/parent::td//following-sibling::td/descendant::i[@title='Edit']"));
				js1.executeScript("arguments[0].click();", edit);
				Thread.sleep(2000);
				if (newlocType.length() >= 0) {
					driver.findElement(Edit_LocType_Txtbox).clear();
					driver.findElement(Edit_LocType_Txtbox).sendKeys(newlocType);
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
					driver.findElement(By.xpath("//div/span[text()='"+customer+"']")).click();
				}
				Thread.sleep(2000);
				if (driver.findElement(Submit_btn).isEnabled()) {
					driver.findElement(Submit_btn).click();
					Thread.sleep(2000);
					String ActMsg = driver.findElement(ToasterMsg).getText();
					Assert.assertEquals(ActMsg, ExpMsg);
					Thread.sleep(1000);
					Reporter.log("Toaster message Verified", true);
					driver.navigate().refresh();
					int size2 = driver.findElements(countOfLocationTypeIDs).size();
					int k;
					for (k = 1; k <= size2; k++) {
						JavascriptExecutor js2 = (JavascriptExecutor) driver;
						WebElement Element1 = driver.findElement(By.xpath("//tbody/tr[" + k + "]/td[2]"));
						js2.executeScript("arguments[0].scrollIntoView();", Element1);
						if(Element1.getText().equals(newlocType)) {
							Assert.assertEquals(Element.getText(),newlocType);
							Reporter.log("Location Type Edited Successfully", true);
							flag = false;
							break;
						}
					}
				} else {
					Assert.assertEquals("Submit Button is Disabled. Need to fill Mandatory fields", ExpMsg);
				}
			}
		}
		if (i > 20) {
			if (driver.findElement(nextBtn).isDisplayed()) {
				if (driver.findElement(nextBtn).isEnabled()) {
					driver.findElement(nextBtn).click();
					int size1 = driver.findElements(countOfLocationTypeIDs).size();
					int j;
					for (j = 1; j <= size1; j++) {
						JavascriptExecutor js = (JavascriptExecutor) driver;
						WebElement Element = driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[2]"));
						js.executeScript("arguments[0].scrollIntoView();", Element);
						if (Element.getText().equals(oldLocType)) {
							JavascriptExecutor js1 = (JavascriptExecutor) driver;
							WebElement edit = driver.findElement(By.xpath("//span[text()='" + oldLocType
									+ "']/parent::td//following-sibling::td/descendant::i[@title='Edit']"));
							js1.executeScript("arguments[0].click();", edit);
							Thread.sleep(2000);
							if (newlocType.length() >= 0) {
								driver.findElement(Edit_LocType_Txtbox).clear();
								driver.findElement(Edit_LocType_Txtbox).sendKeys(newlocType);
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
								driver.findElement(By.xpath("//div/span[text()='\"+customer+\"']")).click();
							}
							Thread.sleep(2000);
							if (driver.findElement(Submit_btn).isEnabled()) {
								driver.findElement(Submit_btn).click();
								Thread.sleep(2000);
								String ActMsg = driver.findElement(ToasterMsg).getText();
								Assert.assertEquals(ActMsg, ExpMsg);
								Thread.sleep(1000);
								Reporter.log("Toaster message Verified", true);
								driver.navigate().refresh();
								int size2 = driver.findElements(countOfLocationTypeIDs).size();
								int k;
								for (k = 1; k <= size2; k++) {
									JavascriptExecutor js2 = (JavascriptExecutor) driver;
									WebElement Element1 = driver.findElement(By.xpath("//tbody/tr[" + k + "]/td[2]"));
									js2.executeScript("arguments[0].scrollIntoView();", Element1);
									if(Element1.getText().equals(newlocType)) {
										Assert.assertEquals(Element.getText(),newlocType);
										Reporter.log("Location Type Edited Successfully", true);
										flag=false;
										break;
									}
								}
							} else {
								Assert.assertEquals("Submit Button is Disabled. Need to fill Mandatory fields", ExpMsg);
							}

						}
					}
					if (j > size1) {
						Assert.assertEquals("Entered Location Type does NOT exists in Table", ExpMsg);
					}
				}
			}
		} else if (size <= 20 & flag == true) {
			Assert.assertEquals("Entered Location Type does NOT exists in Table", ExpMsg);
		}
	}
}