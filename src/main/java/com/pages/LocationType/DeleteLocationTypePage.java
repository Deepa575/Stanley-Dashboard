package com.pages.LocationType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class DeleteLocationTypePage {

	private WebDriver driver;

	private By yesBtn = By.xpath("//button[text()='Yes']");
	private By toasterMsg = By.xpath("//*[@id='toast-container']/div/div");
	private By countOfLocTypeIDs = By.xpath("//tbody/tr/td[4]");
	private By nextBtn = By.xpath("//a[text()=' Next ']");

	public DeleteLocationTypePage(WebDriver driver) {

		this.driver = driver;
	}

	public void deleteLocTypeID(String LocTypeID, String ExpMsg) throws InterruptedException {
		int size = driver.findElements(countOfLocTypeIDs).size();
		int i;
		for (i = 1; i <= size; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(By.xpath("//*[@id=\"location_type_table\"]/tbody/tr["+i+"]/td[4]/span"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			if (Element.getText().equals(LocTypeID)) {
				driver.findElement(By.xpath("//span[text()=' " + LocTypeID
						+ " ']/parent::td//following-sibling::td/descendant::i[@title='Delete']")).click();
				Thread.sleep(2000);
				driver.findElement(yesBtn).click();
				Thread.sleep(2000);
				String ActMsg = driver.findElement(toasterMsg).getText();
				Assert.assertEquals(ActMsg, ExpMsg);
				Reporter.log("Location Type Deleted Successfully & Toaster message Verified", true);
				Thread.sleep(2000);
				break;
			}
		}
		if (i > 20) {
			if (driver.findElement(nextBtn).isDisplayed()) {
				if (driver.findElement(nextBtn).isEnabled()) {
					driver.findElement(nextBtn).click();
					int size1 = driver.findElements(countOfLocTypeIDs).size();
					int j;
					for (j = 1; j <= size1; j++) {
						JavascriptExecutor js = (JavascriptExecutor) driver;
						WebElement Element = driver.findElement(By.xpath("//*[@id=\"location_type_table\"]/tbody/tr["+i+"]/td[4]/span"));
						js.executeScript("arguments[0].scrollIntoView();", Element);
						if (Element.getText().equals(LocTypeID)) {
							driver.findElement(By.xpath("//span[text()=' " + LocTypeID
									+ " ']/parent::td//following-sibling::td/descendant::i[@title='Delete']")).click();
							Thread.sleep(2000);
							driver.findElement(yesBtn).click();
							Thread.sleep(2000);
							String ActMsg = driver.findElement(toasterMsg).getText();
							Assert.assertEquals(ActMsg, ExpMsg);
							Reporter.log("Location Type Deleted Successfully & Toaster message Verified", true);
							Thread.sleep(2000);
							break;
						}
					}
					if (j > size1) {
						Reporter.log("Entered Location Type ID does NOT exists in Table", true);
					}

				}
			} 
		}else if(i<20)
			Reporter.log("Entered Location Type ID does NOT exists in Table", true);
		}

	}
