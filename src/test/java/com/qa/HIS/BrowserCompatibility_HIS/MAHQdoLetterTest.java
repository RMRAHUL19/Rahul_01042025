package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.itextpdf.io.IOException;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAHQdoLetterPage;
import com.qa.pages.MAPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MAHQdoLetterTest extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAHQdoLetterPage MAHQdoletterPage;
	String EntryNo;
	String parent3= null ;
	util utilobj=new util();
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("HQuidd"), prop.getProperty("StagingPass"));

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
	public void donavigatetoMAHQLetter() {

		MAHQdoletterPage = hishomepage.donavigatetoMAHQLetter();
	}

	@Test(priority =4)
	public void clickdoletter() throws InterruptedException {
		MAHQdoletterPage.getdoletter().click();
		
	}
	
	
	@Test(priority =5)
	public void checkmandotaryfield() throws InterruptedException, IOException {
		
		
		
	Thread.sleep(1000);
		MAHQdoletterPage.getbtnPreview().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		utilobj.selectDropdown(MAHQdoletterPage.getddlStateFuture(), driver, "Delhi", "Firefox");
		Thread.sleep(2000);
		utilobj.selectDropdown(MAHQdoletterPage.getddlmonth(), driver, "JAN", "Firefox");
		Thread.sleep(2000);
		MAHQdoletterPage.getbtnPreview().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		}
	
	@Test(priority =6)
	public void checkfuturedate() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		utilobj.selectDropdown(MAHQdoletterPage.getddlHospitalFuture(), driver, "ESIC Ayush Hospital - Narela, DL (ESIC Hosp.)", "Firefox");
		Thread.sleep(2000);
		utilobj.selectDropdown(MAHQdoletterPage.getddlmonth(), driver, "NOV", "Firefox");
		Thread.sleep(2000);
		utilobj.selectDropdown(MAHQdoletterPage.getddlyear(), driver, "2024", "Firefox");
		Thread.sleep(2000);
		MAHQdoletterPage.getbtnPreview().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}		 
	@Test(priority =7)
	public void clickonpreviewButton() throws InterruptedException {
		
		 parent3 = driver.getWindowHandle();
		
		utilobj.selectDropdown(MAHQdoletterPage.getddlStateFuture(), driver, "Delhi", "Firefox");
		Thread.sleep(1000);
		
		utilobj.selectDropdown(MAHQdoletterPage.getddlHospitalFuture(), driver, "ESIC Ayush Hospital - Narela, DL (ESIC Hosp.)", "Firefox");
		Thread.sleep(1000);
		utilobj.selectDropdown(MAHQdoletterPage.getddlyear(), driver, "2024", "Firefox");
	
		
		utilobj.selectDropdown(MAHQdoletterPage.getddlmonth(), driver, "JAN", "Firefox");
		Thread.sleep(2000);
		MAHQdoletterPage.getbtnPreview().click();
		Thread.sleep(1000);
		
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(MAHQdoletterPage.getbtnNext()));
		MAHQdoletterPage.getbtnNext().click();
		Thread.sleep(3000);
		MAHQdoletterPage.getbtnLast().click();
		
		Thread.sleep(2000);
		
        wait.until(ExpectedConditions.visibilityOf(MAHQdoletterPage.getbtnPrev()));
		MAHQdoletterPage.getbtnPrev().click();
		Thread.sleep(2000);
		MAHQdoletterPage.getbtnFirst().click();
		Thread.sleep(1000);
		
		
	}
	@Test(priority =8)
		public void printbtn() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(MAHQdoletterPage.getbtnPrint()));
		
		MAHQdoletterPage.getbtnPrint().click();
		Thread.sleep(3000);
		utilobj.SwitchToChildWindow(driver, "Print the Report");
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitexport")));
		MAHQdoletterPage.getbtnOk().click();
		
		

	}
}
	
	
		
		
	



