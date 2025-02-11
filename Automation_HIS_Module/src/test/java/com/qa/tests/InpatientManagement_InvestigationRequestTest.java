package com.qa.tests;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.InpatientManagement_investigationrequestpages;

import in.esic.uipackageHIS.LoginPage;
import in.esic.uipackageHIS.StaffLoginPage;

public class InpatientManagement_InvestigationRequestTest {
  
	
	WebDriver driver;
	  
    public InpatientManagement_InvestigationRequestTest(){
		
	   }
	
	  @BeforeTest
	  public void Beforemethod(){
		
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\taran\\Selenium new\\geckodriver.exe");
		driver= new FirefoxDriver();
		
	  	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\taran\\Selenium new\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		     
		     
		driver.get("https://gateway.esic.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//  driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			
		
	}	

	  @Test
	  public void InvestigationRequest() throws InterruptedException, AWTException {

		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.verifyHomepage("applone", "Admin@2022");
		
		
		StaffLoginPage stafflogin = PageFactory.initElements(driver, StaffLoginPage.class);
		stafflogin.StaffLoginWordpress("Male Medical Ward"); 
		
		
		InpatientManagement_investigationrequestpages request= PageFactory.initElements(driver, InpatientManagement_investigationrequestpages.class);
		request.investigationrequestwordpress("1199900090");
		
		
	    }
	
	
	@AfterTest
	public void endtest(){
		
		//driver.quit();
		
	}	
}


