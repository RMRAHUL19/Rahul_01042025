package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.Health_PassBook_Pages;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


public class Health_PassBook_Test extends BaseTest {
	public Health_PassBook_Test() {
		
	}
	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Health_PassBook_Pages HPBP;
	util utilobj=new util();
	@Test(priority =0,description ="Enter User Name and Pasword and click on Submit Button")
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}
	
	
	@Test(priority =1,description = "Navigate to Hospital Location Page")
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2,description = "select the Location And Facility(Administrative services)")
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
	}
	@Test(priority = 3)
	public void DoNatigatetoHealth_Pasbook() {
		HPBP=hishomepage.donavigatetoHealth_PassBook_Pages();
	}
	@Test(priority = 4,description = "To check the functionality of Live List TextBox")
	public void dotestCaseForFunctionalityofIP_No_TextBox() {
		HPBP.getIP_NO_textBox().sendKeys("1111111111");
		
	}
	@Test(priority = 5)
	public void dotestCaseForFunctionalityofLiveList_Link() throws InterruptedException {
		
		HPBP.getLiveList_Link().click();
		
	}
	@Test(priority = 6)
	public void dotestCaseForFunctionalityofSuperSpecialityButton() throws InterruptedException {
		
		HPBP.getLiveList_superSpecility_Button().click();
		Thread.sleep(1000);
		HPBP.getLiveList_btnSuperSpecClose().click();
		
	}
	
	@Test(priority = 7)
	public void dotestCaseForFunctionalityofLiveList_RadioButton() throws InterruptedException {
		
		HPBP.getLiveList_RadioButton().click();
		
		
	}
@Test(priority = 8)
public void dotestcaseForFunctionalityofLiveList_SelectButton() {
	HPBP.getLiveList_btnSelect().click();
}

@Test(priority = 9)

public void dotestcaseForFunctionalityofClearButton() throws InterruptedException {
//utilobj.JSClick(HPBP.getbtnbtnClear(), driver);
	Thread.sleep(1000);
	HPBP.getbtnbtnClear().click();
}
@Test(priority = 10)
public void ChecktheFunctionalityofPrintHealthPassbook() throws InterruptedException, AWTException {
	Thread.sleep(1000);
	HPBP.getIP_NO_textBox().sendKeys("1111111111");
	HPBP.getLiveList_Link().click();
	HPBP.getLiveList_superSpecility_Button().click();
	Thread.sleep(1000);
	HPBP.getLiveList_btnSuperSpecClose().click();
	HPBP.getLiveList_RadioButton().click();
	HPBP.getLiveList_btnSelect().click();
	Thread.sleep(1000);
	HPBP.getLiveList_btnPrintHealthPassbook().click();
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
}
}
