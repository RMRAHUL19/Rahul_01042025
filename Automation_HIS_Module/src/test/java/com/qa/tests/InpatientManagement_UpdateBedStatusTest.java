package com.qa.tests;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.pages.InpatientManagement_UpdateBedpages;
import com.qa.pages.InpatientManagement_alotbedpages;

import in.esic.uipackageHIS.LoginPage;
import in.esic.uipackageHIS.StaffLoginPage;


public class InpatientManagement_UpdateBedStatusTest {
	
WebDriver driver;
	
	public InpatientManagement_UpdateBedStatusTest(){
		
	}

	@Test
	public void UpdateBed() throws InterruptedException, AWTException{

			
  	System.setProperty("webdriver.gecko.driver", "C:\\Users\\taran\\Selenium new\\geckodriver.exe");
 	driver= new FirefoxDriver();
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\taran\\Selenium new\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
	     
	     
		driver.get("https://gateway.esic.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.verifyHomepage("applone", "Admin@2022");
		
		
		StaffLoginPage stafflogin = PageFactory.initElements(driver, StaffLoginPage.class);
		stafflogin.StaffLoginWordpress("Female medical ward");  
		
		
		InpatientManagement_UpdateBedpages update= PageFactory.initElements(driver,InpatientManagement_UpdateBedpages.class);
		update.UpdateBedwordpress("FMWRBED001","Test Doctor");
	
		
		
//		driver.close();
//		
//		driver.quit();

	}

}
