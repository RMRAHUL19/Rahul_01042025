package com.qa.tests;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_primarydoctorchangepages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

import in.esic.uipackageHIS.LoginPage;
import in.esic.uipackageHIS.StaffLoginPage;

public class InpatientManagement_PrimaryDoctorChangeTest extends BaseTest {
      
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;

     public InpatientManagement_PrimaryDoctorChangeTest(){
		
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
 	public void doNavigateToHISHomeTest() {

 		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), "Female medical ward");
 	}
 	
 	@Test(priority =3)
	  public void PrimaryDoctorChange() throws InterruptedException, AWTException {

		
//		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
//		loginpage.verifyHomepage("applone", "Wip@1234");
//		
//		
//		StaffLoginPage stafflogin = PageFactory.initElements(driver, StaffLoginPage.class);
//		stafflogin.StaffLoginWordpress("Female medical ward");  
		
		InpatientManagement_primarydoctorchangepages change= PageFactory.initElements(driver, InpatientManagement_primarydoctorchangepages.class);
		change.primarydoctorchangewordpress("test");
 		
	    }
	
	
	@AfterTest
	public void endtest(){
		
		//driver.quit();
		
	}	
}

