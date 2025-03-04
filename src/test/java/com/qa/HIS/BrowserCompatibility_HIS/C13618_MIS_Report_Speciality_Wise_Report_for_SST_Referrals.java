package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

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

public class C13618_MIS_Report_Speciality_Wise_Report_for_SST_Referrals extends CrossBrowser{
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MISReportPages MRP;
	String ReportName;
	util utilobj=new util();
	int i,j;
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	}
	
	
	@Test(priority = 3)
	public void doNavigateMISReportLinkTest() {

		MRP = hishomepage.donavigatetoMISReportPageLINK();
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void HIS_Management_Information_System_MIS_Reports_Specility_wise_Reports_for_SST_Referral_3(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[15]/tbody/tr/td[1]/a/img"))));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[15]/tbody/tr/td[1]/a/img")).click();
		//MRP.getSuperSpecialityPatientRefferelReportPluseButton().click();
		driver.findElement(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst177")).click();
				wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("/html/body/div[2]/div[1]/img"))));
				Thread.sleep(1000);	
				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_btnPreview")).click();
				//MRP.getButtonPreview().click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("/html/body/div[2]/div[1]/img"))));
				Thread.sleep(5000);	
				driver.findElement(By.id("ctl00_ctl00_cphpage_cphReport_btnPreview")).click();
				}
			
			
	
}
