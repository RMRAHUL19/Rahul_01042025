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
import com.qa.pages.ShelfPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


@SuppressWarnings("unused")
public class ShelfTest  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	ShelfPage Shelfpage;
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
	
	
	@Test(priority = 3)
	public <Shelfpage> void doNavigateToShelfLink() {

//		Shelfpage = hishomepage.doNavigateToShelfLink();
	}

			
	@Test(priority =4)
	public void TC_Store_Shelf_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";


	}
	
	@Test(priority =5)
	public void TC_Store_Shelf_005() throws InterruptedException {
		Thread.sleep(2000);
		Shelfpage.getimgSearchRackSelectButton().click();
		
	}
	
	@Test(priority =6)
	public void TC_Shelf_006() throws InterruptedException, IOException {
		String RackName="Rack";
		
		Shelfpage.gettxthisSearchCriteria().sendKeys(RackName);
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority =7)
		public void TC_Store_Shelf_007() throws InterruptedException {
			Thread.sleep(2000);
			Shelfpage.gethisSearchCriteriaSelectButton().click();
			
		}
	@Test(priority =8)
	public void TC_Store_Shelf_008() throws InterruptedException {
		Thread.sleep(2000);
		Shelfpage.getbtnSearchSelectButton().click();
		
	}
	
	@Test(priority =9)
	public void TC_Store_Shelf_009() throws InterruptedException {
		Thread.sleep(2000);
		Shelfpage.gethisSearchResultGridEnryRadiobutton().click();
		
	}
	
	@Test(priority =10)
	public void TC_Store_Shelf_010() throws InterruptedException {
		Thread.sleep(2000);
		Shelfpage.getbtnSelectSelectButton().click();
		
	}
	
	@Test(priority =11)
	public void TC_Shelf_011() throws InterruptedException, IOException {
		String ShelfName="shelf83";
		
		Shelfpage.gettxttxtShelfName().sendKeys(ShelfName);
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority =12)
	public void TC_Store_Rack_012() throws InterruptedException, IOException {
		String ShelfName=util.RandomAlphanumericString.generateRandomAlphanumericString();
		Shelfpage.gettxttxtShelfName().sendKeys(ShelfName);
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority =13)
	public void TC_Store_Shelf_013() throws InterruptedException {
		Thread.sleep(2000);
		Shelfpage.getbtnSaveSelectButton().click();
		
	}
		


}

	
	

