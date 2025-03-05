package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PM10758_DirectIssuePage;
import com.qa.pages.SelectHospitalLocationPage;

import com.qa.util.util;

public class PM10758_DirectIssueTest extends CrossBrowser {
	public PM10758_DirectIssueTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	PM10758_DirectIssuePage DIP;
	util utilobj=new util();
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));	

	}
	 
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"),Browser);
	}
	@Test(priority =3)
	public void TC_Store_003() throws InterruptedException, AWTException {
		DIP=hishomepage.donavigateToDirectIssue();
		
	}
	@Test(priority =4)
	public void TC_Store_004() throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		
		Thread.sleep(2000);
		DIP.getIPTextBox().sendKeys("1100099900");
	Thread.sleep(2000);
	DIP.getLiveListLink().click();
//	DIP.getStoreUhidImgSerch().click();
	wait.until(ExpectedConditions.visibilityOf(DIP.getBeneficiaryRadioButton()));
	DIP.getBeneficiaryRadioButton().click();
	DIP.getLiveListSelectButton().click();
	wait.until(ExpectedConditions.invisibilityOf(DIP.getBlackOverlay()));
	Thread.sleep(2000);
	DIP.getDirectIssueCheckIssue().click();
	Thread.sleep(2000);
	String parent3 = driver.getWindowHandle();
	Thread.sleep(1000);
	utilobj.Window(driver);
	
	DIP.getItemSearchImageButton().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(1000);
	DIP.getItemScreen_itemsearchTxtbox().sendKeys("paracetamol");
	Thread.sleep(1000);
	DIP.getItemScreen_itemsearchButton().click();
	Thread.sleep(1000);
	DIP.getItemScreen_itemCheckbox().click();
	Thread.sleep(1000);
	DIP.getItemScreen_SelectButton().click();
	Thread.sleep(1000);
	driver.switchTo().window(parent3);
	Thread.sleep(2000);
	DIP.getStoreIssueQuantityTextBox().clear();
	Thread.sleep(4000);
	DIP.getStoreIssueQuantityTextBox().sendKeys("3");
	Thread.sleep(2000);
	DIP.getStoreUhidIssueSaveButton().click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
	//DIP.getStoreUhidIssueSaveButton().click();
	}
}
