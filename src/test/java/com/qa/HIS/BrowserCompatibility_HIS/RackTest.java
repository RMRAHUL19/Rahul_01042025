package com.qa.HIS.BrowserCompatibility_HIS;
			
			import java.io.IOException;
			import java.time.Duration;
			
			import org.openqa.selenium.By;
			import org.openqa.selenium.support.ui.ExpectedConditions;
			import org.openqa.selenium.support.ui.WebDriverWait;
			import org.testng.annotations.Parameters;
			import org.testng.annotations.Test;
			
			import com.qa.pages.HISHomePage;
			import com.qa.pages.HomePage;
			import com.qa.pages.Loginpage;
			import com.qa.pages.RackPage;
			import com.qa.pages.SelectHospitalLocationPage;
			import com.qa.util.util;
			
			@SuppressWarnings("unused")
			public class RackTest  extends CrossBrowser {
			
				
				Loginpage loginpage;
				HomePage homepage;
				SelectHospitalLocationPage selecthospitallocationpage;
				HISHomePage hishomepage;
				RackPage Rackpage;
				String EntryNo;
				util utilobj=new util();
				@Test(priority =0)
				public void doLoginTest() {
			
					loginpage = new Loginpage(driver);
			
					homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));
			
				}
				
				@Test(priority =1)
				public void doNavigateToSelectHospitalLocationTest() {
			
					selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
				}
				
				@Test(priority =2)
				@Parameters("browser")
				public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {
			
					hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"),Browser);
				}
				
				
				@Test(priority = 3)
				public void doNavigateToRackLink() {
			
					Rackpage = hishomepage.doNavigateToRackLink();
				}
			
						
				@Test(priority =4)
				public void TC_Store_Rack_001() throws InterruptedException, IOException {
					String path=System.getProperty("user.dir")+"\\ExcelTestdata";
			
			
					String Rackcode="12345676";
					
					String Rackname="Racktest";
					
					
					
					Thread.sleep(2000);
					Rackpage.getcode().sendKeys(Rackcode);
					
					Rackpage.getrackname().sendKeys(Rackname);
			
					Rackpage.getClearButton().click();
				}
				@Test(priority =5)
				public void TC_Store_Rack_004() throws InterruptedException, IOException {
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
					String Rackname=util.RandomAlphanumericString.generateRandomAlphanumericString();
					String Rackcode=util.RandomAlphanumericString.generateRandomAlphanumericString();
					Thread.sleep(1000);
					Rackpage.getcode().sendKeys(Rackcode);
					
					Rackpage.getrackname().sendKeys(Rackname);
			
					Rackpage.getbtnSave().click();
					Thread.sleep(2000);
					wait.until(ExpectedConditions.elementToBeClickable(Rackpage.getOkButton()));
					
					Rackpage.getOkButton().click();
					wait.until(ExpectedConditions.visibilityOf(Rackpage.getRackbtnSearch()));
				}
				
				@Test(priority =6)
				public void TC_Store_Rack_002() throws InterruptedException, IOException {
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
					String Rackname="rack";
					String Rackcode="12345678";
					Rackpage.getRackbtnSearch().click();
					Thread.sleep(2000);
					Rackpage.getRacksearchfield().sendKeys(Rackname);
					Thread.sleep(2000);
					Rackpage.getsearchpopupbtn().click();
					Thread.sleep(2000);
					Rackpage.getsearchdataentry1().click();
					Thread.sleep(2000);
					Rackpage.getsearchdataselect().click();
					wait.until(ExpectedConditions.visibilityOf(Rackpage.getcode()));
					Rackpage.getcode().clear();
					Rackpage.getcode().sendKeys(Rackcode);
					Rackpage.getModifyButton().click();
					Thread.sleep(2000);
					Rackpage.getOkButton().click();
					Thread.sleep(2000);
					
				}
				
				@Test(priority =7)
				public void TC_Store_Rack_003() throws InterruptedException, IOException {
					String Rackname="rack";
					String Rackcode="612371683";
					Rackpage.getRackbtnSearch().click();
					Thread.sleep(2000);
					Rackpage.getRacksearchfield().sendKeys(Rackname);
					Rackpage.getsearchpopupbtn().click();
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
					wait.until(ExpectedConditions.visibilityOf(Rackpage.getsearchdataentry1()));
					Rackpage.getsearchdataentry1().click();
					Thread.sleep(2000);
					Rackpage.getsearchdataselect().click();
					wait.until(ExpectedConditions.visibilityOf(Rackpage.getcode()));
					Rackpage.getcode().clear();
					Rackpage.getcode().sendKeys(Rackcode);
					utilobj.JSClick(Rackpage.getbtnSave(), driver);
					
				}
		
			}