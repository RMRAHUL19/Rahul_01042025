package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.DoctorWorklistPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OpenVisitPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class OpenVisitTest extends CrossBrowser{
	public OpenVisitTest() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OpenVisitPage OCP;
	
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
	public void doNavigateToOpenVisitTest() {

		
		OCP=hishomepage.doNavigateToOpenVisitPageLink();
		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_5(String Browser) throws InterruptedException, AWTException {//clear
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_search().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_ucCommonSearch_PageUpdateProgress")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_TextBox().sendKeys("test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_Search().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_ucCommonSearch_PageUpdateProgress")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_RadioButton()));
		OCP.getOpenVisitUHID_RadioButton().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_SelectButton()));
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		utilobj.JSClick(OCP.getOpenVisitUHID_Clear(),driver);
		Thread.sleep(1000);
		
		
	}
	@Test(priority = 5)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_6(String Browser) throws AWTException, InterruptedException {//close MR
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		OCP.getOpenVisitUHID_search().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_ucCommonSearch_PageUpdateProgress")));
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_TextBox().sendKeys("test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_Search().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_ucCommonSearch_PageUpdateProgress")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_RadioButton()));
		OCP.getOpenVisitUHID_RadioButton().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_SelectButton()));
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_OK()));
		OCP.getOpenVisitUHID_OK().click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_CheckBox()));
		OCP.getOpenVisitUHID_CheckBox().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_closeMR().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		Thread.sleep(1000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}
	@Test(priority = 6)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_9(String Browser) throws AWTException, InterruptedException {//nagitive closed MR
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_search().click();
		Thread.sleep(1000);
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_TextBox().sendKeys("test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_Search().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_RadioButton()));
		OCP.getOpenVisitUHID_RadioButton().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_SelectButton()));
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_OK().click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		OCP.getOpenVisitUHID_CheckBox().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_closeMR()));
		try {
			OCP.getOpenVisitUHID_closeMR().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_closeMR()));
			wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_closeMR()));
			OCP.getOpenVisitUHID_closeMR().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));



		}
		
	}
	@Test(priority = 7)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_8(String Browser) throws AWTException, InterruptedException {//open MR
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		Thread.sleep(1000);
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		OCP.getOpenVisitUHID_search().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_TextBox().sendKeys("test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_search()));
		OCP.getOpenVisitUHID_Search().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_RadioButton()));
		OCP.getOpenVisitUHID_RadioButton().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_SelectButton()));
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_OK()));
		OCP.getOpenVisitUHID_OK().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_CheckBox().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_OpenMR()));
		try {
			OCP.getOpenVisitUHID_OpenMR().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			Thread.sleep(1000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_OpenMR()));
			wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_OpenMR()));
			OCP.getOpenVisitUHID_OpenMR().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			Thread.sleep(1000);


		}
		
		
	}
	@Test(priority = 8)
	@Parameters("browser")
	public void CLM_Open_Visits_TC_7(String Browser) throws InterruptedException, AWTException {//nagitive Scenario Open MR
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		Thread.sleep(1000);
		Robot rb1=new Robot();
		rb1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_search()));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			OCP.getOpenVisitUHID_search().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_search()));
			wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_search()));
			OCP.getOpenVisitUHID_search().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));


		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		utilobj.selectDropdown(OCP.getOpenVisitUHID_DLL(), driver, "Contains",Browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_TextBox().sendKeys("test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_search()));
		OCP.getOpenVisitUHID_Search().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_RadioButton()));
		OCP.getOpenVisitUHID_RadioButton().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_SelectButton()));
		OCP.getOpenVisitUHID_SelectButton().click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		OCP.getOpenVisitUHID_OK().click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		OCP.getOpenVisitUHID_CheckBox().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_OpenMR()));
		try {
			OCP.getOpenVisitUHID_OpenMR().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(OCP.getOpenVisitUHID_closeMR()));
			wait.until(ExpectedConditions.elementToBeClickable(OCP.getOpenVisitUHID_closeMR()));
			OCP.getOpenVisitUHID_OpenMR().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));



		}
		Thread.sleep(1000);
		Robot rb2=new Robot();
		rb2.keyPress(KeyEvent.VK_ENTER);
	}
	
}
