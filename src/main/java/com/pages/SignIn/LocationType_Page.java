package com.pages.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LocationType_Page {
	
	private WebDriver driver;
	
	//Add Location Type
	
	private By Add_Loc_Type_Btn = By.xpath("//button[text()='Add LocationType ']");
	private By Loc_txtbox = By.xpath("//*[text()='Location Type *']//following::input");
	private By Desc_txtbox= By.xpath("//*[text()='Description *']//following::textarea");
	private By phyLoc_Drpdwn = By.xpath("//*[text()='Physical Location Type *']//following::select");
	private By Cust_Drpdwn = By.xpath("//*[text()='Customers *']//following::select[@formcontrolname='customer']");
	private By Submit_Btn = By.xpath("//button[text()='Submit']");
	private By toaster_msg = By.xpath("//*[@id='toast-container']/div/div");
		

	public LocationType_Page(WebDriver driver) { 
		this.driver=driver;	
	}
	
	public void clickOnAddLocationTypeBtn(){
		driver.findElement(Add_Loc_Type_Btn).click();
	}

	public void Add_Loc_Sidepage(String location_Type, String description, String physical_Location, String customers) throws InterruptedException {
		driver.findElement(Loc_txtbox).sendKeys(location_Type);
		driver.findElement(Desc_txtbox).sendKeys(description);
		driver.findElement(phyLoc_Drpdwn).click();
		driver.findElement(By.xpath("//option[text()='"+physical_Location+"']")).click();
		driver.findElement(Cust_Drpdwn).click();
		driver.findElement(By.xpath("//option[text()='"+customers+"']")).click();
		Thread.sleep(2000);
	}
	
	public void isSubmitButtonEnabled()
	{
		driver.findElement(Submit_Btn).isEnabled();
	}

	public void clickOnSubmitBtn()
	{
		driver.findElement(Submit_Btn).click();
	}

	public void verifyToasterMsg(String ExpMsg) throws InterruptedException {
		Thread.sleep(1000);
		String ActMsg = driver.findElement(toaster_msg).getText();
		Assert.assertEquals(ActMsg, ExpMsg);
		Thread.sleep(3000);
	}
}

