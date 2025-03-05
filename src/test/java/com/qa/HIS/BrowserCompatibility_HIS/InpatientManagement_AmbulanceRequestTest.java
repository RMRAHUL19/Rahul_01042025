package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_AmbulanceRequestPage;
import com.qa.pages.InpatientManagement_vitalsentrypages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class InpatientManagement_AmbulanceRequestTest extends CrossBrowser {

	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	InpatientManagement_AmbulanceRequestPage IM_AR;
	public InpatientManagement_AmbulanceRequestTest(){
		
	}
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

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), "Male Medical Ward",Browser);
	}
	@Test(priority =3)
	public void donavigateambulanceRequest() {
		IM_AR=hishomepage.doNavigateToambulanceRequest();
		
	}
	@Test(priority =4)
	@Parameters("browser")
	public void Ambulance_Request_Screen_TC_01(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		IM_AR.getLocationsearchimagebutton().click();
		wait.until(ExpectedConditions.visibilityOf(IM_AR.getLocationsearchButton()));
		IM_AR.getLocationSearchtextbox().sendKeys("rohini, DL");
		IM_AR.getLocationsearchButton().click();
		wait.until(ExpectedConditions.visibilityOf(IM_AR.getLocationRadiobutton()));
		IM_AR.getLocationRadiobutton().click();
		IM_AR.getLocationSelectButton().click();
		wait.until(ExpectedConditions.invisibilityOf(IM_AR.getLocationSelectButton()));
		
		IM_AR.getBedNameImageButton().click();
		wait.until(ExpectedConditions.visibilityOf(IM_AR.getBedAdmissionTextBox()));
		IM_AR.getBedAdmissionTextBox().sendKeys("IP0");
		IM_AR.getBedSearchButton().click();
		wait.until(ExpectedConditions.invisibilityOf(IM_AR.getImageProcess()));
		IM_AR.getBedRadioButton().click();
		IM_AR.getBedSelectButton().click();
		wait.until(ExpectedConditions.invisibilityOf(IM_AR.getBedSelectButton()));
		
		IM_AR.getPatientConditionTextBox().sendKeys("critical");
		IM_AR.getPatientAdressTextBox().sendKeys("Automation address");
		utilobj.selectDropdown(IM_AR.getStateDLL(), driver, "Chandigarh", Browser);
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		utilobj.selectDropdown(IM_AR.getDistrictDLL(), driver, "Chandigarh", Browser);
		Thread.sleep(4000);
		IM_AR.getPincodetextbox().sendKeys("787878");
		IM_AR.getRequireddate().click();
		Thread.sleep(4000);
		IM_AR.Requireddatecurrentdate().click();
		IM_AR.getRecivedddate().click();
		Thread.sleep(4000);
		IM_AR.getRecivedddatecurrentdate().click();
		Thread.sleep(4000);
		IM_AR.getRemarkstextbox().sendKeys("PM10735 Unable to assign ambulance to Patients through Ambulance Worklist");
		Thread.sleep(4000);
		IM_AR.getSaveButton().click();
		wait.until(ExpectedConditions.visibilityOf(IM_AR.getSuccusOkButton()));
	}
	@Test(priority =5)
	@Parameters("browser")
	public void Ambulance_Request_Screen_TC_01_a(String Browser) throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		IM_AR.getSuccusOkButton().click();
		Thread.sleep(4000);
		IM_AR.getChangeLocationLink().click();
		Thread.sleep(4000);
		//wait.until(ExpectedConditions.invisibilityOf(IM_AR.getImageProcess()));
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), "AMBULANCE DEPARTMENT",Browser);
		IM_AR=hishomepage.doNavigateToambulanceWorklist();
		Thread.sleep(4000);
		
	}
	@Test(priority =6)
	@Parameters("browser")
	public void Ambulance_Request_Screen_TC_02ANDAmbulance_Request_Screen_TC_03(String Browser) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		List<WebElement> list=driver.findElements(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div/table/tbody/tr/td[12]"));
		System.out.println(list.size());
		int index=list.size()+1;
		driver.findElement(By.id("ctl00_cphpage_gdvResults_ctl0"+index+"_lbAssignment")).click();
		//driver.findElement(By.id("ctl00_cphpage_gdvResults_ctl09_lbAssignment")).click();
		//IM_AR.getAssignmentLink().click();
		Thread.sleep(3000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		utilobj.selectDropdown(IM_AR.getAmbulanceDLL(), driver, "UP15", Browser);
		IM_AR.getDriverName().sendKeys("Karra Driver");
		IM_AR.getInitialKilometer().sendKeys("30");
		IM_AR.getFinalKilometer().sendKeys("60");
		int FromTime= Integer.parseInt(IM_AR.getFromTimeHour().getAttribute("value"));
		String Finalfromtime=Integer.toString(FromTime+2);
		IM_AR.getToTimeHour().sendKeys(Finalfromtime);
		IM_AR.getTextRemarks().sendKeys("test remarks");
		IM_AR.getsaveButton().click();
		//wait.until(ExpectedConditions.invisibilityOf(IM_AR.getSuccusOkButton()));
		//driver.switchTo().window(parent3);	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("MessageBoxInfo_ButtonOK"))));
	}
	
}
