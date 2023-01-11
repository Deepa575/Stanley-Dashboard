package com.pages.LocationType;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

public class AddLocationTypePage {

	private WebDriver driver;

	// Add Location Type

	private By Add_Loc_Type_Btn = By.xpath("//button[text()='Add LocationType ']");
	private By Loc_txtbox = By.xpath("//*[text()='Location Type *']//following::input");
	private By Desc_txtbox = By.xpath("//*[text()='Description *']//following::textarea");
	private By phyLoc_Drpdwn = By.xpath("//*[text()='Physical Location Type *']//following::select");
	private By Cust_Drpdwn = By.xpath("//div/div[4]/div/vl-select/ng-select/div/span");
	private By Submit_Btn = By.xpath("//button[text()='Submit']");
	private By toaster_msg = By.xpath("//*[@id='toast-container']/div/div");

	public AddLocationTypePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnAddLocationTypeBtn() {
		try {
			driver.findElement(Add_Loc_Type_Btn).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(Add_Loc_Type_Btn));
		}
	}

	public void Add_Loc_Sidepage(String location_Type, String description, String physical_Location, String customers)
			throws InterruptedException {
		if (location_Type.length() > 0) {
			driver.findElement(Loc_txtbox).sendKeys(location_Type);
		}
		if (description.length() > 0) {
			driver.findElement(Desc_txtbox).sendKeys(description);
		}
		if (physical_Location.length() > 0) {
			driver.findElement(phyLoc_Drpdwn).click();
			driver.findElement(By.xpath("//option[text()='" + physical_Location + "']")).click();
		}
		int i=00;
		if (customers.length() > 0) {
			driver.findElement(Cust_Drpdwn).click();
			
			try {
				driver.findElement(By.xpath("//div/span[text()='"+customers+"']")).click();
				Thread.sleep(2000);
			}
			catch(ElementClickInterceptedException e) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div/span[text()='\"+customers+\"']")));
				Thread.sleep(2000);
			}
		}
		
	}

	public void clickOnSubmitBtn(String ExpMsg) throws InterruptedException {
		if (driver.findElement(Submit_Btn).isEnabled()) {
			driver.findElement(Submit_Btn).click();
			Thread.sleep(2000);
			String ActMsg = driver.findElement(toaster_msg).getText();
			Assert.assertEquals(ActMsg, ExpMsg);
			Thread.sleep(5000);
		} else {
			Assert.assertEquals("Submit Button is Disabled. Need to fill Mandatory fields", ExpMsg);
		}
	}
}
