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

	public void deleteLocType(String LocType, String ExpMsg) throws InterruptedException {
		int size = driver.findElements(countOfLocTypeIDs).size();
		int i;
		int c=0;
		for (i = 1; i <= size; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver
					.findElement(By.xpath("//*[@id=\"location_type_table\"]/tbody/tr[" + i + "]/td[2]/span"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			if (Element.getText().equals(LocType)) {
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement delete = driver.findElement(By.xpath("//span[text()='" + LocType
						+ "']/parent::td//following-sibling::td/descendant::i[@title='Delete']"));
				js1.executeScript("arguments[0].click();", delete);
				Thread.sleep(1000);
				driver.findElement(yesBtn).click();
				Thread.sleep(2000);
				String ActMsg = driver.findElement(toasterMsg).getText();
				Assert.assertEquals(ActMsg, ExpMsg);
				Reporter.log("Location Type Deleted Successfully & Toaster message Verified", true);
				c=1;
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
						WebElement Element = driver.findElement(
								By.xpath("//*[@id=\"location_type_table\"]/tbody/tr[" + j + "]/td[2]/span"));
						js.executeScript("arguments[0].scrollIntoView();", Element);
						if (Element.getText().equals(LocType)) {
							JavascriptExecutor js1 = (JavascriptExecutor) driver;
							WebElement delete = driver.findElement(By.xpath("//span[text()='" + LocType
									+ "']/parent::td//following-sibling::td/descendant::i[@title='Delete']"));
							js1.executeScript("arguments[0].click();", delete);
							Thread.sleep(1000);
							driver.findElement(yesBtn).click();
							Thread.sleep(2000);
							String ActMsg = driver.findElement(toasterMsg).getText();
							Assert.assertEquals(ActMsg, ExpMsg);
							Reporter.log("Location Type Deleted Successfully & Toaster message Verified", true);
							break;
						}
					}
					if (j > size1) {
						Assert.assertEquals("Entered Location Type does NOT exists in Table", ExpMsg);
					}

				}
			}
		}else if(size<=20 & c==0) {
			Assert.assertEquals("Entered Location Type does NOT exists in Table", ExpMsg);
		}
	}
}
