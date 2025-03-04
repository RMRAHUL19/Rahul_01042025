package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.GatePassPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


@SuppressWarnings("unused")
public class GatePasstest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	GatePassPage GatePassPage;
	String EntryNo;
	util utilobj=new util();
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

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
	
	
	@SuppressWarnings("hiding")
	@Test(priority = 3)
	public <GatePassPage> void doNavigateToGatePassLink() {

//		GatePassPage = hishomepage.doNavigateToGatePassLink();
	}

			
	@Test(priority =4)
	public void TC_Store_GatePass_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";


	}
	
	@Test(priority =5)
	public void TC_Store_GatePass_005() throws InterruptedException {
		Thread.sleep(2000);
		GatePassPage.getimgSupplierSelectButton().click();
		
	}
	
	@Test(priority =6)
	public void TC_GatePass_006() throws InterruptedException, IOException {
		String Supplier="test";
		
		GatePassPage.gettxttxtCriteria().sendKeys(Supplier);
		Thread.sleep(2000);
		
		
	}
	
	
	@Test(priority =8)
	public void TC_Store_GatePass_008() throws InterruptedException {
		Thread.sleep(2000);
		GatePassPage.gethisDataSearchCtrlSelectButton().click();
		
	}
	
	@Test(priority =9)
		public void TC_Store_GatePass_009() throws InterruptedException {
			Thread.sleep(2000);
			GatePassPage.getrdbTempSelectButton().click();
			
		}
	@Test(priority =10)
	public void TC_Store_GatePass_010() throws InterruptedException {
		Thread.sleep(2000);
		GatePassPage.getbtnSelectSelectButton().click();
		
		
		
	}
	
	@Test(priority =11)
	public void TC_GatePass_011() throws InterruptedException, IOException {
		String ItemName="test";
		
		GatePassPage.gettxttxtItem().sendKeys(ItemName);
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority =12)
	public void TC_GatePass_012() throws InterruptedException, IOException {
		String Quantity="10";
		
		GatePassPage.gettxttxtQty().sendKeys(Quantity);
		Thread.sleep(2000);
		
		
	}
	
	
	@Test(priority =13)
	public void TC_GatePass_013() throws InterruptedException, IOException {
		String Remarks="done";
		
		GatePassPage.gettxttxtRemarks().sendKeys(Remarks);
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority =14)
	public void TC_Store_GatePass_014() throws InterruptedException {
		Thread.sleep(2000);
		GatePassPage.gettxtbtnSaveSelect().click();
		Thread.sleep(2000);
		GatePassPage.gettxtbtnSaveSelect().click();
		
		
		
	}
	
	
	

	

	

}

	
	

