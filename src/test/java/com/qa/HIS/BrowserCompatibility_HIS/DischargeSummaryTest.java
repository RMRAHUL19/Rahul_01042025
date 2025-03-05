package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.DischargeSummaryPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class DischargeSummaryTest extends CrossBrowser {

	public DischargeSummaryTest() {

	}
	util utilobj = new util();
  Loginpage loginpage;
  HomePage homepage;
  SelectHospitalLocationPage selecthospitallocationpage;
  HISHomePage hishomepage; 
  DischargeSummaryPage DSP;
  
  @Test(priority = 0) 
  public void doLoginTest() {
  
  loginpage = new Loginpage(driver);
  
  homepage = loginpage.doLogin(prop.getProperty("uidd"),
  prop.getProperty("StagingPass"));
  
  }
  
  @Test(priority = 1) 
  public void doNavigateToSelectHospitalLocationTest() {
  
  selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation(); }
  
  @Test(priority = 2) 
  @Parameters("browser")
  public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {
  
  hishomepage =  selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
  }
  
  @Test(priority = 3)
  public void doNavigateTogetDischargeSummaryLinkTest() {
  
  DSP = hishomepage.doNavigateToDischargeSummaryLink();
  }
  
  @Test(priority = 4) 
  public void CLM_Discharge_Summary_TC_7() {
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
	  wait.until(ExpectedConditions.visibilityOf(DSP.getSaveBtn()));
	  DSP.getSaveBtn().click();
	  wait.until(ExpectedConditions.visibilityOf(DSP.getOkPopup()));
	  String Message=DSP.getpopupMessageText().getText();
	  System.out.println(Message);
	  DSP.getOkPopup().click();
  assertEquals(Message, "Enter Admission Number");
  }
  @Test(priority = 5)
 @Parameters("browser")
  public void CLM_Discharge_Summary_TC_6(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		Thread.sleep(1000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		DSP.getAdmissionSearchBtn().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	Thread.sleep(2000);
		
	DSP.getAdmissionSearchTextBox().click();
	Thread.sleep(2000);
	DSP.getAdmissionSearchTextBox().sendKeys("IP0");
	Thread.sleep(1000);
	DSP.getSearchBtn().click();
	
		wait.until(ExpectedConditions.visibilityOf(DSP.getChkBox()));
	DSP.getChkBox().click();
	Thread.sleep(1000);
	DSP.getSelectBtn().click();



	  
  }
  @Test(priority = 6)
  @Parameters("browser")
  public void CLM_Discharge_Summary_TC_10(String Browser) throws InterruptedException, AWTException {
//		Thread.sleep(2000);
//		 DSP.getSaveBtn().click();
//		Thread.sleep(3000);
//		 DSP.getOkPopup().click();
		Thread.sleep(2000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		
		
		DSP.getClinicalSummary().click();
		Thread.sleep(2000);	
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);	
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		DSP.getClinicalSummaryEditBtn().click();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		DSP.getDoneBtn().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		DSP.getDiagnosis().click();
		Thread.sleep(1000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		DSP.gettxtdiagnosis().sendKeys("Test");
		Thread.sleep(1000);
		DSP.getDoneBtn().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(1000);
		DSP.getSaveBtn().click();
		Thread.sleep(2000);
		DSP.getOkPopup().click();
		Thread.sleep(1000);
		DSP.getprintBtn().click();
		Thread.sleep(2000);	
		utilobj.ChildWindow(driver);
		Thread.sleep(2000);	
		utilobj.selectDropdown( DSP.gettemplateScreenBtnDDl(), driver, "Discharge Summary",Browser);
		Thread.sleep(1000);
		DSP.gettemplateScreenOK().click();
		Thread.sleep(4000);
		String parent4 = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.id("btnPrint")).click();
		Thread.sleep(4000);
		driver.switchTo().window(parent4);
		Thread.sleep(1000);
		driver.findElement(By.id("btnBillPrint")).click();
		Thread.sleep(4000);
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
	  	Thread.sleep(2000);
		utilobj.Window(driver);
		
			  }
		  }
