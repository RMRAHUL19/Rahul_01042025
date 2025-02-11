package com.qa.pages;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.*;

public class TestNGRegistrationInsuredPerson {

	WebDriver driver;
	
	public TestNGRegistrationInsuredPerson(){
		
	}

	@Test
	public void InsuredPersonRegistrationbyStaff() throws InterruptedException, AWTException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\taran\\Selenium new\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	  // System.setProperty("webdriver.chrome.driver", "C:\\Users\\taran\\Selenium new\\chromedriver.exe");
	 //  WebDriver driver = new ChromeDriver();
		driver.get("https://gateway.esic.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
		LoginPageS loginpage = PageFactory.initElements(driver, LoginPageS.class);
		loginpage.verifyHomepage("insltwo", "Esic@2021");
		
		
		StaffLoginPage stafflogin = PageFactory.initElements(driver, StaffLoginPage.class);
		stafflogin.StaffLoginWordpress();  
		
		driver.close();

	}

/*	@BeforeTest
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taran\\Selenium new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     	driver.get("https://gateway.esic.in");
     	driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       
	}
	
		
	@AfterTest
   public void afterMethod() {
		
		driver.close();
	}*/
}
