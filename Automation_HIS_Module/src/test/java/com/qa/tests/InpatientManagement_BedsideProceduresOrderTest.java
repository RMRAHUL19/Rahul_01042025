package com.qa.tests;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.InpatientManagement_bedsideproceduresorderpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

import in.esic.uipackageHIS.LoginPage;
import in.esic.uipackageHIS.StaffLoginPage;

public class InpatientManagement_BedsideProceduresOrderTest extends BaseTest {
      

	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
    public InpatientManagement_BedsideProceduresOrderTest(){
		
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

	  @Test(priority = 3)
	  public void BedsideProceduresOrder() throws InterruptedException, AWTException {

		
		
		
		 InpatientManagement_bedsideproceduresorderpages order= PageFactory.initElements(driver, InpatientManagement_bedsideproceduresorderpages.class);
		 order.bedsideproceduresorderwordpress("Catheterisation Procedure");
		
		
	    }
	
	
	}

