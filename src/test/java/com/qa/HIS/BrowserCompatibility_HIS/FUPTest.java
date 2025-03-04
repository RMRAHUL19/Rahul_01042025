package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.FUPPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class FUPTest extends CrossBrowser {

	public FUPTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	FUPPage   fuppage;
	
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
	public void doNavigateToFUPTest() throws InterruptedException {

		
		fuppage = hishomepage.doNavigateToFUP();
		
		
	}
	
	@Test(priority=4)
	@Parameters("browser")
	public void CLM_Frequently_Used_Packs_TC_04(String Browser) throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver,java.time.Duration.ofMinutes(2));
		//fuppage.doInvestigation("AFB",prop.getProperty("Quantity"),prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
//		Thread.sleep(4000);
//		wait.until(ExpectedConditions.visibilityOf(fuppage.getDeleteInvesigation()));
//		fuppage.getDeleteInvesigation().click();
//		Thread.sleep(3000);
//		fuppage.getUpdateBtn().click();
//		Thread.sleep(500);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
//		fuppage.getpopup().click();
		
		String parent3 = driver.getWindowHandle();
//
//		utilobj.Window(driver);

		fuppage.getInvestigations().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);

		//driver.close();
		Thread.sleep(1000);
		 driver.switchTo().window(parent3);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		Thread.sleep(2000);
		
		fuppage.getTestName().sendKeys("AFB");
	   Thread.sleep(2000);
	   fuppage.getSearchBtn().click();
		 Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		 wait.until(ExpectedConditions.visibilityOf(fuppage.getChkBox()));
		 fuppage.getChkBox().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		 Thread.sleep(500);
		 fuppage.getSelectBtn().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		 Thread.sleep(500);
		 fuppage.getQuantity().sendKeys("1");
		 Thread.sleep(5000);
		 fuppage.getTickMark().click();
		Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(fuppage.getUpdateBtn()));
		fuppage.getUpdateBtn().click();
		Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(fuppage.getpopup()));
	fuppage.getpopup().click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOf(fuppage.getDeleteInvesigation()));
	fuppage.getDeleteInvesigation().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	fuppage.getUpdateBtn().click();
	Thread.sleep(500);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	fuppage.getpopup().click();
	fuppage.getInvestigations().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(1000);

	//driver.close();
	Thread.sleep(1000);
	 driver.switchTo().window(parent3);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	Thread.sleep(2000);
	
	fuppage.getTestName().sendKeys("AFB");
   Thread.sleep(2000);
   fuppage.getSearchBtn().click();
   Thread.sleep(1000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	 wait.until(ExpectedConditions.visibilityOf(fuppage.getChkBox()));
	 fuppage.getChkBox().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	 Thread.sleep(500);
	 fuppage.getSelectBtn().click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	 Thread.sleep(500);
	 fuppage.getQuantity().sendKeys("1");
	 Thread.sleep(5000);
	 fuppage.getTickMark().click();
	Thread.sleep(5000);
	 wait.until(ExpectedConditions.elementToBeClickable(fuppage.getUpdateBtn()));
	fuppage.getUpdateBtn().click();
	Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(fuppage.getpopup()));
fuppage.getpopup().click();
Thread.sleep(4000);
		//medication Start
	Thread.sleep(4000);
	utilobj.JSClick(fuppage.getMedications(), driver);
	//getMedications().click();
	Thread.sleep(2000);
	
	fuppage.getDeleteMedication().click();
	Thread.sleep(3000);
	fuppage.getUpdateBtn().click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	Thread.sleep(500);
	fuppage.getpopup().click();
	
	
	String parent4 = driver.getWindowHandle();

	utilobj.Window(driver);

	fuppage.getDrugSearchBtn().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	Thread.sleep(1000);


	//driver.close();
	 driver.switchTo().window(parent4);
	
	Thread.sleep(4000);
	
	
	fuppage.getDrugName().sendKeys("abaca");
	Thread.sleep(2000);
	fuppage.getDrugNameSearchBtn().click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	Thread.sleep(500);
	fuppage.getDrugNameChkBx().click();
	Thread.sleep(500);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	fuppage.getDrugSelectBtn().click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	Thread.sleep(500);
	fuppage.getDoseQty().clear();
	Thread.sleep(500);
	fuppage.getDoseQty().sendKeys("1");
	Thread.sleep(500);
	utilobj.selectDropdown(fuppage.getDoseType(), driver, prop.getProperty("DoseType"), Browser);
	Thread.sleep(500);
	utilobj.selectDropdown(fuppage.getFrequency(), driver, prop.getProperty("Frequency"), Browser);
	Thread.sleep(500);
	fuppage.getDuration().sendKeys("3");
	 Thread.sleep(500);
	 utilobj.selectDropdown(fuppage.getAdmin_Route(), driver, prop.getProperty("Admin_Route"), Browser);
	 Thread.sleep(500);
	 fuppage.getTotal_Strength().sendKeys("3");
	 Thread.sleep(500);
	 utilobj.selectDropdown(fuppage.getTotal_Strength_drpdwn(), driver, prop.getProperty("DoseType"), Browser);
	 
	 Thread.sleep(500);
	 fuppage.getRemarks().sendKeys("Test");
	 Thread.sleep(500);
	 fuppage.getMedication_Tick().click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	 Thread.sleep(3000);
	 fuppage.getUpdateBtn().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popup_ok")));
	fuppage.getpopup().click();
	Thread.sleep(3000);
	}
@Test(priority = 5)
public void CLM_Frequently_Used_Packs_TC_05() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("__tab_ctl00_cphpage_tabSearch_tabPnlSearchResults")));
	utilobj.JSClick(driver.findElement(By.id("__tab_ctl00_cphpage_tabSearch_tabPnlSearchResults")),driver);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOf(fuppage.getEdit()));
	fuppage.getEdit().click();
	Thread.sleep(3000);
	fuppage.getTickMark().click();;
	Thread.sleep(2000);
	String Status=driver.findElement(By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_gdvInvestigations_ctl02_status")).getText();
	System.out.println(Status);
	Thread.sleep(2000);
	fuppage.getUpdateBtn().click();
		wait.until(ExpectedConditions.visibilityOf(fuppage.getpopup()));
		Thread.sleep(2000);
		fuppage.getpopup().click();
		Thread.sleep(2000);
	assertEquals(Status, "Updated");
}
@Test(priority = 6)
public void CLM_Frequently_Used_Packs_TC_07() throws InterruptedException {
	Thread.sleep(2000);
	fuppage.getUpdateBtn().click();
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
	wait.until(ExpectedConditions.visibilityOf(fuppage.getpopup()));
	String informationText=driver.findElement(By.id("popup_message")).getText();
	Thread.sleep(2000);
	System.out.println(informationText);
	Thread.sleep(2000);
	fuppage.getpopup().click();
	Thread.sleep(2000);
	assertEquals(informationText, "No item(s) to Add/Modify.");
	
	
}

}
