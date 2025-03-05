package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OrderPacksPage;
import com.qa.pages.OrderPacksPage2;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class OrderPacksTest2 extends CrossBrowser {

	public OrderPacksTest2() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OrderPacksPage2   orderpackspage2;
	OrderPacksPage   orderpackspage;
	boolean InvestigationSearch;
	String OrderPackName;
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}
	
	@Test(priority = 3)
	public void doNavigateToOrderPacksTest()  {
		
		orderpackspage = hishomepage.doNavigateToOrderPacks();
	}
	
	
@Test(priority =4)
public void TC_MA_004() throws InterruptedException, IOException {
String path=System.getProperty("user.dir")+"\\ExcelTestdata";

}
	
	@Test(priority=5)
	@Parameters("browser")
	public void CLM_Order_Packs_TC_05(String Browser) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(orderpackspage.getOrderPacks()));
		orderpackspage.getOrderPacks().click();
		
		utilobj.SwitchToChildWindow(driver, "Order Pack");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Random F=new Random();
		int Num=F.nextInt(2000);
		OrderPackName=prop.getProperty("OrderPacks");
		System.out.println(OrderPackName);
		Thread.sleep(2000);
		orderpackspage2.gettxtOrderPacks().sendKeys(OrderPackName);
		Thread.sleep(2000);
		orderpackspage.getSearchBtnInvestigation().click();
		Thread.sleep(2000);
		orderpackspage2.getcheckselect().click();
		Thread.sleep(2000);
		orderpackspage.getSelectBtnInvestigation().click();
		utilobj.SwitchToChildWindow(driver, "OrderPacks");
		
		Thread.sleep(2000);
		
	}

		
	/*Investigations*/
		
	@Test(priority=6)
	@Parameters("browser")
		public void CLM_Order_Packs_TC_06(String Browser) throws InterruptedException{
			
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);
		
		Thread.sleep(1000);
		orderpackspage.getInvestigations().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	

		utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, prop.getProperty("TestName"));
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getWindowCheckBox(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
	
		Thread.sleep(1000);
		utilobj.ChildWindow(driver);
		Thread.sleep(10000);

		 
	
		InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
		if(InvestigationSearch==true) {
		orderpackspage.getTestName().sendKeys(prop.getProperty("TestName"));
		orderpackspage. getSearchBtn().click();
		orderpackspage.getChkBox().click();
		orderpackspage.getSelectBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.invisibilityOf(orderpackspage.getSelectBtn()));
	}
		
	else {
		 Thread.sleep(4000);
		 System.out.println("modelpopup is not display");
	}
		utilobj.JSEnterText(orderpackspage.getQuantity(), driver, "1"); 
		Thread.sleep(2000);
		orderpackspage.getTickMark().click();
	
	
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(orderpackspage2.getUpdateBtn()));
		orderpackspage2.getUpdateBtn().click();
	
		Thread.sleep(1000);
		orderpackspage.getpopup().click();
	
	
	
	}



	/*Medications*/
	
	@Test(priority=7)
	@Parameters("browser")
	public void CLM_Order_Packs_TC_07(String Browser) throws InterruptedException{
		
		Thread.sleep(100);
		orderpackspage.getMedications().click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(orderpackspage.getOrderPacks()));
		orderpackspage.getOrderPacks().click();
		
		utilobj.SwitchToChildWindow(driver, "Order Pack");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Random F=new Random();
		int Num=F.nextInt(2000);
		OrderPackName=prop.getProperty("OrderPacks");
		System.out.println(OrderPackName);
		Thread.sleep(2000);
		orderpackspage2.gettxtOrderPacks().sendKeys(OrderPackName);
		Thread.sleep(2000);
		orderpackspage.getSearchBtnInvestigation().click();
		Thread.sleep(2000);
		orderpackspage2.getcheckselect().click();
		Thread.sleep(2000);
		orderpackspage.getSelectBtnInvestigation().click();
		utilobj.SwitchToChildWindow(driver, "OrderPacks");
		
		Thread.sleep(2000);
		
	}

	
	@Test(priority=8)
	@Parameters("browser")
		public void CLM_Order_Packs_TC_08(String Browser) throws InterruptedException{
		
	
		String parent4 = driver.getWindowHandle();
		utilobj.Window(driver);

		orderpackspage.getDrugSearchBtn().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		

		utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, "abaca");
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getWindowDrugChkBx(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
		
		Thread.sleep(1000);
		driver.switchTo().window(parent4);
		Thread.sleep(2000);
		
		InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
		if(InvestigationSearch==true) {
		orderpackspage.getDrugName().sendKeys("abaca");
		Thread.sleep(1000);
		orderpackspage.getDrugNameSearchBtn().click();
		Thread.sleep(1000);
		orderpackspage.getDrugNameChkBx().click();
		Thread.sleep(1000);
		orderpackspage.getDrugSelectBtn().click();
		Thread.sleep(2000);
		orderpackspage.getDoseQty().clear();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(2));
		wait.until(ExpectedConditions.invisibilityOf(orderpackspage.getSelectBtn()));
		}
		
		else { 
		}
		
		orderpackspage.getpopup().click();
		
		 Thread.sleep(2000);
		 orderpackspage.getDoseQty().clear();
		 Thread.sleep(2000);
		 orderpackspage.getDoseQty().sendKeys("1");
		 Thread.sleep(2000);
		 utilobj.selectDropdown(orderpackspage.getDoseType(), driver, prop.getProperty("DoseType"), Browser);
		 Thread.sleep(2000);
		 utilobj.selectDropdown(orderpackspage.getFrequency(), driver, prop.getProperty("Frequency"), Browser);
		
		 Thread.sleep(2000);
		 orderpackspage.getDuration().sendKeys("3");
		 Thread.sleep(4000);
		 utilobj.selectDropdown(orderpackspage.getAdmin_Route(), driver,"ORAL / BY MOUTH", Browser);
		 orderpackspage.getAdmin_Route().sendKeys(prop.getProperty("Admin_Route"));
		 Thread.sleep(2000);
		 orderpackspage.getTotal_Strength().sendKeys("3");
		 Thread.sleep(2000);
		 utilobj.selectDropdown(orderpackspage.getTotal_Strength_drpdwn(), driver,prop.getProperty("DoseType"), Browser);
		 orderpackspage.getTotal_Strength_drpdwn().sendKeys(prop.getProperty("DoseType"));
		 Thread.sleep(2000);
		 orderpackspage. getRemarks().sendKeys("Test");
		 Thread.sleep(2000);
		 orderpackspage.getMedication_Tick().click();
		 Thread.sleep(2000);
		 orderpackspage.getSaveBtn().click();
		 Thread.sleep(2000);
		 orderpackspage.getpopup().click();
}
	
	/*Health interventions*/
	
	@Test(priority = 9)
	public void CLM_Order_Packs_TC_09() throws InterruptedException {
		
		
	   Thread.sleep(500);
		orderpackspage.getHealthIntervensions().click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(orderpackspage.getOrderPacks()));
		orderpackspage.getOrderPacks().click();
		
		utilobj.SwitchToChildWindow(driver, "Order Pack");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Random F=new Random();
		int Num=F.nextInt(2000);
		OrderPackName=prop.getProperty("OrderPacks");
		System.out.println(OrderPackName);
		Thread.sleep(2000);
		orderpackspage2.gettxtOrderPacks().sendKeys(OrderPackName);
		Thread.sleep(2000);
		orderpackspage.getSearchBtnInvestigation().click();
		Thread.sleep(2000);
		orderpackspage2.getcheckselect().click();
		Thread.sleep(2000);
		orderpackspage.getSelectBtnInvestigation().click();
		utilobj.SwitchToChildWindow(driver, "OrderPacks");
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 10)
	public void CLM_Order_Packs_TC_010() throws InterruptedException {
		
		
			String parent5 = driver.getWindowHandle();
		utilobj.Window(driver);

		orderpackspage.getProcedures().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		
		
		
		utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, "test");
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getWindowHealthInterventions(), driver);
		Thread.sleep(2000);
		utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "OrderPacks");
		
		InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
		if(InvestigationSearch==true) {
		orderpackspage.getTestName().sendKeys("test");
		Thread.sleep(1000);
		orderpackspage.getSearchBtn().click();
		Thread.sleep(1000);
		orderpackspage.getHealthInterventionsTestName().click();
		Thread.sleep(1000);
		orderpackspage.getSelectBtn().click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(2));
		wait.until(ExpectedConditions.invisibilityOf(orderpackspage.getSelectBtn()));
		
		}
		
		else {
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(1000);
		
		
	}
	
		@Test(priority = 11)
		public void CLM_Order_Packs_TC_011() throws InterruptedException {
		
		Thread.sleep(500);
		
		String txt ="1";
		orderpackspage.getHealthTnterventionsQty().sendKeys(txt);
		
		Thread.sleep(1000);
		orderpackspage.getHealthInterventions_Tick().click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(orderpackspage2.getUpdateBtn()));
		orderpackspage2.getUpdateBtn().click();
		Thread.sleep(1000);
		orderpackspage.getpopup().click();
		
	}

	/*Diagnosis*/

	@Test(priority = 12)
		public void CLM_Order_Packs_TC_012() throws InterruptedException {
		
		
	 	Thread.sleep(500);
		orderpackspage.getDiagnosis().click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(orderpackspage.getOrderPacks()));
		orderpackspage.getOrderPacks().click();
		
		utilobj.SwitchToChildWindow(driver, "Order Pack");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Random F=new Random();
		int Num=F.nextInt(2000);
		OrderPackName=prop.getProperty("OrderPacks");
		System.out.println(OrderPackName);
		Thread.sleep(2000);
		orderpackspage2.gettxtOrderPacks().sendKeys(OrderPackName);
		Thread.sleep(2000);
		orderpackspage.getSearchBtnInvestigation().click();
		Thread.sleep(2000);
		orderpackspage2.getcheckselect().click();
		Thread.sleep(2000);
		orderpackspage.getSelectBtnInvestigation().click();
		utilobj.SwitchToChildWindow(driver, "OrderPacks");
		
		Thread.sleep(2000);
}
		
		@Test(priority = 13)
		public void CLM_Order_Packs_TC_013() throws InterruptedException {
	 
			
		
		Thread.sleep(2000);
		orderpackspage.getDiagnosis_Search().sendKeys(prop.getProperty("Diagnosis_Search"));
		Thread.sleep(2000);
		orderpackspage.getCovid().click();
		Thread.sleep(2000);
		orderpackspage.getDiagnosis_Tick().click();
	    Thread.sleep(2000);
		orderpackspage.getpopup().click();
		

		
	}
		

		@Test(priority = 14)
		public void CLM_Order_Packs_TC_14() throws InterruptedException {
		Thread.sleep(2000);
		orderpackspage.getSaveBtn().click();
		Thread.sleep(2000);
		orderpackspage.getpopup().click();
	
}
}
