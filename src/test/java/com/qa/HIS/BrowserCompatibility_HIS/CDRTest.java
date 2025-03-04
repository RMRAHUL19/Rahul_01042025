package com.qa.HIS.BrowserCompatibility_HIS;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import com.aventstack.extentreports.ExtentReports;
import com.qa.pages.CDRPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;
@SuppressWarnings("unused")
public class CDRTest extends CrossBrowser { 

	public CDRTest() {
		// TODO Auto-generated constructor stub
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CDRPage cdrpage;
	String Status;
	util utilobj=new util();
	

	
@Test(priority =1)

public void doLoginTest() throws IOException {


	loginpage = new Loginpage(driver);
	

	homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));
	
}

	@Test(priority =2)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	@Test(priority =3)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome("ESIC TEST HOSPITAL DL", "ADMINISTRATIVE SERVICES",Browser);
		
	}
@Test(priority =4)
public void doNavigateToCDRTest() {

	cdrpage = hishomepage.doNavigateToCDRLink();
	
	
	
}

@Test(priority =5)
public void CDR_Patient_Folder_TC_03() throws InterruptedException {
	
	
	cdrpage.gettxtIPNumber().sendKeys("1111111111");
	Thread.sleep(1000);
	cdrpage.getSearchBtnUhid().click();
	

}

@Test(priority =6)

public void CDR_Patient_Folder_TC_04() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	Thread.sleep(2000);
	cdrpage.getSelectBtn().click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

}
@Test(priority = 7)
public void CDR_Patient_Folder_TC_05() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

	cdrpage.getmgBtnDetails().click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	cdrpage.gettvCompleteDetailst2().click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

}
@Test(priority = 8)
public void CDR_Patient_Folder_TC_06() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

	cdrpage.gettvCompleteDetailst2().click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

}
@Test(priority = 9)
public void CDR_Patient_Folder_TC_09() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

	for(int i=0;i<=7;i++) {
		Thread.sleep(2000);
		System.out.println("prescription");
		Thread.sleep(2000);
		try {
			driver.findElement(By.id("ctl00_cphpage_RepClinicals_ctl0"+i+"_btn")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		Thread.sleep(2000);
		if(driver.findElement(By.id("ctl00_cphpage_btnmsgOk")).isDisplayed()==true)
		{
			driver.findElement(By.id("ctl00_cphpage_btnmsgOk")).click();
		}
	}
	
	
	
}
@Test(priority =10)
@Parameters("browser")
public void CDR_Patient_Folder_TC_07(String Browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

	Thread.sleep(2000);

	
	cdrpage.getSpecilazitionRadiobutton().click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	utilobj.selectDropdown(cdrpage.getSpecilazitionDDL(), driver, "General Medicine",Browser);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getSpecilazitionDDL(), driver, "Casualty / Emergency",Browser);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getSpecilazitionDDL(), driver, "General Surgery",Browser);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getSpecilazitionDDL(), driver, "General Medicine",Browser);
	Thread.sleep(1000);
	driver.findElement(By.id("ctl00_cphpage_btnSearch")).click();
	
}

@Test(priority = 11)
@Parameters("browser")
public void CDR_Patient_Folder_TC_08(String Browser) throws Exception {
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

	
	Thread.sleep(2000);
	utilobj.JSClick(cdrpage.getDiagnoseRadiobutton(), driver);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getDiagnoseDDL(), driver, "Cough",Browser);
	Thread.sleep(1000);
	utilobj.selectDropdown(cdrpage.getDiagnoseDDL(), driver, "Low back pain",Browser);
	Thread.sleep(1000);	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	driver.findElement(By.id("ctl00_cphpage_btnSearch")).click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
	utilobj.JSClick(cdrpage.getEpisodeWiseradiobutton(), driver);
//	String currentURL = driver.getCurrentUrl();
//	System.out.println(currentURL);
//	
//	Assert.assertEquals(currentURL, "NoTitle");

	

}



}





