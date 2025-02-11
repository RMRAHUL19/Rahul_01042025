package com.qa.tests;


import java.awt.AWTException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.pages.InpatientManagement_alotbedpages;

import in.esic.uipackageHIS.LoginPage;
import in.esic.uipackageHIS.StaffLoginPage;


public class InpatientManagement_AlotBedTest {
	
WebDriver driver;
	
	public InpatientManagement_AlotBedTest(){
		
	}

	@Test
	public void AlotBed() throws InterruptedException, AWTException {

		
   //  System.setProperty("webdriver.firefox.marionette", "C:\\Users\\taran\\Selenium new\\geckodriver.exe");
	driver= new FirefoxDriver();
	
  	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\taran\\Selenium new\\chromedriver.exe");
	// WebDriver driver = new ChromeDriver();
	     
	     
		driver.get("https://gateway.esic.in/");
	    driver.manage().window().maximize();
	    
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  //  driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.verifyHomepage("applone", "Admin@2022");
		
		
		StaffLoginPage stafflogin = PageFactory.initElements(driver, StaffLoginPage.class);
		stafflogin.StaffLoginWordpress("Female medical ward");  
		
		InpatientManagement_alotbedpages menu= PageFactory.initElements(driver, InpatientManagement_alotbedpages.class);
		menu.InpatientManagementmenuwordpress("FMW35");
		
	}
	
	@AfterTest
	public void endtest(){
		
		driver.quit();
		
	}	
		


}
