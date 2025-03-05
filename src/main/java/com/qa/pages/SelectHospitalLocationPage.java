package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ReadDataFile;
import com.qa.util.util;

@SuppressWarnings("unused")
public class SelectHospitalLocationPage extends BasePage {
	
	util utilobj = new util();
	ReadDataFile readdata = new ReadDataFile();
	
	public SelectHospitalLocationPage(WebDriver driver) {
		super(driver);

	
	}
	
	/* Location */
	private By Location = By.id("ctl00_cphpage_ddlHospital");
	                             
	/* Facility */
	private By facility = By.id("ctl00_cphpage_ddlFacility");
	
	/* Submit */
	private By submit = By.id("ctl00_cphpage_btnSubmit");

	
	public WebElement getLocation() {
		return getElement(Location);
	}

	
	public WebElement getFacility() {
		return getElement(facility);
	}

	
	public WebElement getSubmit() {
		return getElement(submit);
	}
	
	public HISHomePage doNavigateToHISHome(String LocationName, String FacilityName,String Browser) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(getLocation()));
		System.out.println(Browser);


if(Browser.equalsIgnoreCase("Chrome")|| Browser.equalsIgnoreCase("Opera")  ) {
	getLocation().sendKeys(LocationName);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(getFacility()));
	getFacility().sendKeys(FacilityName);
	wait.until(ExpectedConditions.elementToBeClickable(getSubmit()));
	Thread.sleep(1000);
}
else if(Browser.equalsIgnoreCase("Firefox")|| Browser.equalsIgnoreCase("Edge"))
{  
	utilobj.selectDropdown(getLocation(), driver, LocationName,Browser);
	
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(getFacility()));
	utilobj.selectDropdown(getFacility(), driver, FacilityName,Browser);
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(getSubmit()));
	Thread.sleep(1000);

	
}
else {
	System.out.println("do nothing");
}
		
		
		getSubmit().click();
		Thread.sleep(1000);
		
		return new HISHomePage(driver);
		
	}
	

}
