package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.DischargeSummaryPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class DischargeSummaryTest extends BaseTest {

	public DischargeSummaryTest() {

	}

	



  Loginpage loginpage; HomePage homepage; SelectHospitalLocationPage
  selecthospitallocationpage; HISHomePage hishomepage; DischargeSummaryPage
  dischargesummarypage;
  
  @Test(priority = 0) 
  public void doLoginTest() {
  
  loginpage = new Loginpage(driver);
  
  homepage = loginpage.doLogin(prop.getProperty("uidd"),
  prop.getProperty("pwdd"));
  
  }
  
  @Test(priority = 1) 
  public void doNavigateToSelectHospitalLocationTest() {
  
  selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation(); }
  
  @Test(priority = 2) 
  public void doNavigateToHISHomeTest() {
  
  hishomepage =
  selecthospitallocationpage.doNavigateToHISHome(prop.getProperty(
  "locationName"), prop.getProperty("facilityName")); }
  
  @Test(priority = 3)
  public void doNavigateTogetDischargeSummaryLinkTest() {
  
  dischargesummarypage = hishomepage.doNavigateToDischargeSummaryLink(); }
  
  @Test(priority = 4) 
  public void doDischargeSummaryPageTest() {
  
  dischargesummarypage.doDischargeSummaryPage(prop.getProperty("AdmissionNo"));
  
  
  }
  }
