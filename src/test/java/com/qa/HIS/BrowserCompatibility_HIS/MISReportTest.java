package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MISReportPages;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MISReportTest extends CrossBrowser{
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MISReportPages MRP;
	String ReportName;
	util utilobj=new util();
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),browser);
	}
	
	
	@Test(priority = 3)
	public void doNavigateMISReportLinkTest() {

		MRP = hishomepage.donavigatetoMISReportPageLINK();
	}


	  @Test(priority = 4)
	  @Parameters("browser")
	  public void MIS_TC_01(String browser) throws InterruptedException {
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOf(MRP.getAAAMobileAppReportPluseButton()));
	  MRP.getAAAMobileAppReportPluseButton().click(); 
	  for(int i=1;i<=1;i++) {
	  ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
	  System.out.println(ReportName);
	  if(ReportName.equals("List of Holidays")) {
	  Thread.sleep(500);
	  utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));
	  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	  Thread.sleep(1000); 
	  try {
		MRP.getYearTextBox().sendKeys("2022");
	} catch (Exception e) {
		e.printStackTrace();
	}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}

	  Thread.sleep(1000); 
	  MRP.getButtonPreview().click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	  Thread.sleep(1000); MRP.getAAAMobileAppReportPluseButton().click();
	  
	  } else {
	  
	  
	  Thread.sleep(500);
	  utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));
	  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	  Thread.sleep(1000);
	  MRP.getButtonPreview().click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	  Thread.sleep(1000);
	  MRP.getAAAMobileAppReportPluseButton().click(); }} }
	 
@Test(priority = 5)
@Parameters("browser")
public void MIS_TC_02(String browser) throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	MRP.getDispensryReprtPluseButton().click();
	for(int i=12;i<=12;i++) {
		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
		System.out.println(ReportName);
		if(ReportName.equals("Diagnosis wise Census report")||ReportName.equals("MIS - BED Occupancy Report")||ReportName.equals("MIS-Inpatient Department wise procedure performed")||ReportName.equals("Monthly Report for Department wise OPD Attendance")) {
			Thread.sleep(500);
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
			MRP.getDispensryReprtPluseButton().click();
		}
		
		else if (ReportName.equals("Super Speciality Patient Referrals")) {
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
		utilobj.selectDropdown(MRP.getEmpanalStateDLL(), driver, "Delhi", browser);
		Thread.sleep(3000);
			utilobj.selectDropdown(MRP.getLocationDLL(),driver, "ESIC Hospital & Dental College,Rohini", browser);
			Thread.sleep(1000);
			utilobj.selectDropdown(MRP.getReportTypeDLL(), driver, "Consultative", browser);
			Thread.sleep(1000);
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
			MRP.getDispensryReprtPluseButton().click();
		}
		else {
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_cphpage_cphReport_ModalExtnd1_backgroundElement")));
			MRP.getDispensryReprtPluseButton().click();
		}
	}
}
	@Test(priority =6 )
	@Parameters("browser")
	public void MIS_TC_03(String browser) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MRP.getGroupPluseButton().click();
		for(int i=30;i<=30;i++) {
			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
			System.out.println(ReportName);
			if(ReportName.equals("Investigation Report DepartmentWise")) {
				Thread.sleep(500); 	
				utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				Thread.sleep(1000);
				try {
					MRP.getYearTextBox().sendKeys("2022");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Thread.sleep(1000);
				MRP.getButtonPreview().click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				Thread.sleep(1000);
				MRP.getGroupPluseButton().click();
			}
			else
			{
				Thread.sleep(500); 	
				utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				Thread.sleep(1000);
				try {
					MRP.getYearTextBox().sendKeys("2022");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
				} catch (Exception e) {
					e.printStackTrace();
				}
				MRP.getButtonPreview().click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_cphpage_cphReport_ModalExtnd1_backgroundElement")));
				MRP.getGroupPluseButton().click();
			}
		}
		
	}
	
	@Test(priority = 7)
	@Parameters("browser")
	public void MIS_TC_04(String browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		for(int i=39;i<=39;i++) {
		MRP.getHospitalReportPluseButton().click();
		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
		System.out.println(ReportName);
		if(ReportName.equals("Statistics on Death Occurring beyond 48 hours of Admission")||ReportName.equals("MIS - Daily Census")||ReportName.equals("Monthly Report for Department of Blood Bank-Blood type and Out of stock days")) {
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
		}
		else {
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_cphpage_cphReport_ModalExtnd1_backgroundElement")));

			Thread.sleep(1000);
		}
		
	}
}

@Test(priority = 8)
@Parameters("browser")
public void MIS_TC_05(String browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	Thread.sleep(2000);
	utilobj.scroolDownintoview(driver, MRP.getIMP_mEUDReportsPluseButtonPluseButton());
	MRP.getIMP_mEUDReportsPluseButtonPluseButton().click();
	for(int i=82;i<=82;i++) {
		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
		System.out.println(ReportName);
		Thread.sleep(1000); 	
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		try {
			MRP.getYearTextBox().sendKeys("2022");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		utilobj.selectDropdown(MRP.getEmpanalStateDLL(), driver, "Delhi", browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(MRP.getNameCodeIMP_mEUDDLLDLL(), driver, "IMP/DL/11/39 - Final Test", browser);
		Thread.sleep(2000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		MRP.getIMP_mEUDReportsPluseButtonPluseButton().click();

	}
}
@Test(priority = 9)
@Parameters("browser")
public void MIS_TC_06(String browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	MRP.getInpatientAdmissionReportPluseButton().click();
	for(int i=85;i<=85;i++) {
		ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
		System.out.println(ReportName);
		if(ReportName.equals("MIS-Inpatient-Statistics-Monthly Day Wise")||ReportName.equals("MIS-Inpatient-Statistics-Monthly Week Wise")||ReportName.equals("MIS-Inpatient-Statistics-Quarterly Month Wise")||ReportName.equals("MIS-Inpatient-Statistics-Quarterly week wise")||ReportName.equals("MIS-Inpatient-Statistics-Yearly Month Wise")||ReportName.equals("MIS-Inpatient-Statistics-Yearly Quarter Wise")) {
			
		Thread.sleep(500); 	
		utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		try {
			MRP.getYearTextBox().sendKeys("2022");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		MRP.getInpatientAdmissionReportPluseButton().click();
	}
	
	else {
		Thread.sleep(500); 	
		utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		try {
			MRP.getYearTextBox().sendKeys("2022");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		MRP.getInpatientAdmissionReportPluseButton().click();
	}
}}
@Test(priority = 10)
@Parameters("browser")
public void MIS_TC_07(String browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	utilobj.scroolDownintoview(driver, MRP.getLGDReportPluseButton());
	MRP.getLGDReportPluseButton().click();
	for(int i=107;i<=107;i++) {
		Thread.sleep(500); 	
		utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		utilobj.selectDropdown(MRP.getLGDStateDLL(), driver, "Delhi", browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(MRP.getLGDDistrictDLL(), driver, "North West", browser);
		Thread.sleep(2000);
		utilobj.selectDropdown(MRP.getLGDSubDistrictDLL(), driver, "Rohini", browser);
		Thread.sleep(2000);
		try {
			MRP.getYearTextBox().sendKeys("2022");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		MRP.getLGDReportPluseButton().click();
	}
	
}
	@Test(priority = 11)
	@Parameters("browser")
	public void MIS_TC_08(String browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MRP.getMasterDataPluseButton().click();
		for(int i=114;i<=114;i++) {
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			Thread.sleep(1000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
			MRP.getMasterDataPluseButton().click();
			
		}
		
		
	}
	@Test(priority = 12)
	@Parameters("browser")
	public void MIS_TC_09(String browser) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MRP.getMobileAppReportsPluseButton().click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst124")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		try {
			MRP.getYearTextBox().sendKeys("2022");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		utilobj.JSEnterText(MRP.getFromDateTextBox(), driver, "18-May-2022");
		
		Thread.sleep(1000);
		utilobj.JSEnterText(MRP.geToDateTextBox(), driver, "19-May-2022");
		
		Thread.sleep(1000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		
	}
	
	@Test(priority = 13)
	@Parameters("browser")
	public void MIS_TC_10(String browser) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MRP.getMonthlyStateReportsPluseButton().click();
		for(int i=126;i<=126;i++) {
		ReportName=	driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
		if(ReportName.equals("OPD specialization wise and service wise cost to patient")) {
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(2000);
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(2000);
		MRP.getMonthlyStateReportsPluseButton().click();
		}
else {
	Thread.sleep(500); 	
	utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
	driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	try {
		MRP.getYearTextBox().sendKeys("2022");
	} catch (Exception e) {
		e.printStackTrace();
	}
	try {
		utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
	} catch (Exception e) {
		e.printStackTrace();
	}
	Thread.sleep(2000);
	MRP.getButtonPreview().click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	Thread.sleep(2000);
	MRP.getMonthlyStateReportsPluseButton().click();
}}
		
	}
	
	@Test(priority = 14)
	@Parameters("browser")
	public void MIS_TC_11(String browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MRP.getOTReportsReportsPluseButton().click();
		for(int i=134;i<=134;i++) {
			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			Thread.sleep(2000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(2000);
			MRP.getOTReportsReportsPluseButton().click();
		}
		
	}
	
	@Test(priority = 15)
	@Parameters("browser")
	public void MIS_TC_12(String browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MRP.getReferencePluseButton().click();
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst138")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		try {
			MRP.getYearTextBox().sendKeys("2022");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		
	}
	@Test(priority = 16)
	@Parameters("browser")
	public void MIS_TC_13(String browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		MRP.getStatitsticsReportPluseButton().click();
		for(int i=140;i<=140;i++) {
			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
			if(ReportName.equals("OccupancyRegister-Xrays")) {
				Thread.sleep(500); 	
				utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				try {
					MRP.getYearTextBox().sendKeys("2022");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Thread.sleep(1000);
				MRP.getButtonPreview().click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				MRP.getStatitsticsReportPluseButton().click();
			}
			else {
				Thread.sleep(500); 	
				utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				Thread.sleep(2000);
				try {
					MRP.getYearTextBox().sendKeys("2022");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Thread.sleep(1000);
				MRP.getButtonPreview().click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
				Thread.sleep(2000);
				MRP.getStatitsticsReportPluseButton().click();
			}
			
		}
	}
	@Test(priority = 17)
	@Parameters("browser")
	public void MIS_TC_14(String browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		utilobj.scroolDownintoview(driver, MRP.getStoreReportPluseButton());
		MRP.getStoreReportPluseButton().click();
		for(int i=165;i<=165;i++) {
			ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
			Thread.sleep(500); 	
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
			driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(1000);
			try {
				MRP.getYearTextBox().sendKeys("2022");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(1000);
			MRP.getButtonPreview().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
			Thread.sleep(2000);
			MRP.getStoreReportPluseButton().click();
		}
	}
@Test(priority = 18)
@Parameters("browser")
public void MIS_TC_15(String browser) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(4));
	wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
	utilobj.scroolDownintoview(driver, MRP.getSuperSpecialityPatientRefferelReportPluseButton());
	MRP.getSuperSpecialityPatientRefferelReportPluseButton().click();
	for(int i=177;i<=177;i++) {
		Thread.sleep(500); 	
		utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		try {
			MRP.getYearTextBox().sendKeys("2022");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			utilobj.selectDropdown(driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_ddlmonth")), driver, "JAN", browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		utilobj.selectDropdown(MRP.getEmpanalStateDLL(), driver, "Delhi", browser);
		Thread.sleep(3000);
		utilobj.selectDropdown(MRP.getLocationNameDLL(), driver, "ESIC Hospital & Dental College,Rohini", browser);
		Thread.sleep(3000);
		MRP.getButtonPreview().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
		Thread.sleep(1000);
		MRP.getSuperSpecialityPatientRefferelReportPluseButton().click();
		
	}
	
}

 /* @Test(priority = 19)
  
  @Parameters("browser") 
  public void MIS_TC_16(String browser) throws InterruptedException { 
	  WebDriverWait wait=new WebDriverWait(driver,
  Duration.ofMinutes(4));
	  for(int i=173;i<=205;i++) {
  ReportName=driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).getAttribute("title");
  if(ReportName.equals("Duty Roster Report")||ReportName.equals("Month wise / Location wise OD case count")||ReportName.equals("OPD Break up patient wise service wise Report")||ReportName.equals("")) {
  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).
  click();
  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
  Thread.sleep(1000);
  MRP.getYearTextBox().sendKeys("2022");
  Thread.sleep(1000); 
  MRP.getButtonPreview1().click();
  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss())); }
  else if (ReportName.equals("2 Dispensary Reports")) {
  Thread.sleep(500); 	
  utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)));  	
  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).click();
  Thread.sleep(1000); 
  utilobj.selectDropdown(MRP.getReportNameDLL(),driver, "Dispensary Wise IP/Family Count Report", browser);
  Thread.sleep(2000);
  MRP.getDispanseryFromDateTextBox().sendKeys("19-May-2022");
  Thread.sleep(1000); 
  MRP.getDispanseryToDateTextBox().sendKeys("24-May-2022");
  Thread.sleep(1000); 
  utilobj.selectDropdown(MRP.getDispanseryStateDll(),driver, "Delhi", browser); 
  Thread.sleep(1000);
  utilobj.selectDropdown(MRP.getDispanseryLocationTypeDll(), driver,"ESIC Dispensary", browser); 
  Thread.sleep(1000);
  utilobj.selectDropdown(MRP.getDispanseryLocationNameDll(), driver,"Rohini Sec-V, DL (ESIC Disp.)", browser);
  Thread.sleep(2000);
  MRP.getButtonPreview1().click(); Thread.sleep(2000);
  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
  
  
  
  
  
  } else {
  driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst"+i)).
  click();
  
  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss()));
  Thread.sleep(1000); MRP.getButtonPreview1().click();
  wait.until(ExpectedConditions.invisibilityOf(MRP.getPageUpdatePrograss())); }
  
  } }
 */
}

