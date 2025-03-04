package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAPage8;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MATest8  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAPage8 MAPage8;
	String EntryNo;
	util utilobj=new util();
	

	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameADMINISTRATIVEMEDICALSERVICES"),Browser);
		
	}

	@Test(priority = 3)
	public void doNavigateToMALetterGenerationforHosptitaslLinks() {

		MAPage8 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks8();
	}

			
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

	}
			
			@Test(priority =5)
			public void TC_MA_Page_8_All_department_dropdown() throws InterruptedException {
			
				MAPage8.getDdlDepartment1().sendKeys("Paediatrics");
		        MAPage8.getDdlDepartment2().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment3().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment4().sendKeys("ICU");
				MAPage8.getDdlDepartment5().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment6().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment7().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment8().sendKeys("ICU");
				MAPage8.getDdlDepartment9().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment10().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment11().sendKeys("ICU");
				MAPage8.getDdlDepartment12().sendKeys("Radiology");
				MAPage8.getDdlDepartment13().sendKeys("Radiology");
				MAPage8.getDdlDepartment14().sendKeys("Radiology");
				MAPage8.getDdlDepartment15().sendKeys("Radiology");
				MAPage8.getDdlDepartment16().sendKeys("Laboratory");
				MAPage8.getDdlDepartment17().sendKeys("Laboratory");
				MAPage8.getDdlDepartment18().sendKeys("Laboratory");
				MAPage8.getDdlDepartment19().sendKeys("Laboratory");
				MAPage8.getDdlDepartment20().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment21().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment22().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment23().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment24().sendKeys("Paediatrics");
				MAPage8.getDdlDepartment25().sendKeys("Surgery");
				MAPage8.getDdlDepartment26().sendKeys("Surgery");
				MAPage8.getDdlDepartment27().sendKeys("Surgery");
				MAPage8.getDdlDepartment28().sendKeys("Surgery");
				MAPage8.getDdlDepartment29().sendKeys("Radiology");
				MAPage8.getDdlDepartment30().sendKeys("Radiology");

		}
			@Test(priority =7)
			public void TC_MA_Page_8_All_alphnumeric_50_characters_max() throws InterruptedException {
				
				String txt="129.47jhdgh.32bqwie bcqiy wbdiqb wdi qiwduqwi dnqw";
				
				MAPage8.getTxtMedicalEquip1().clear();
				MAPage8.getTxtMedicalEquip2().sendKeys(txt);
				MAPage8.getTxtMedicalEquip3().sendKeys(txt);
				MAPage8.getTxtMedicalEquip4().sendKeys(txt);
				MAPage8.getTxtMedicalEquip5().sendKeys(txt);
				MAPage8.getTxtMedicalEquip6().sendKeys(txt);
				MAPage8.getTxtMedicalEquip7().sendKeys(txt);
				MAPage8.getTxtMedicalEquip8().sendKeys(txt);
				MAPage8.getTxtMedicalEquip9().sendKeys(txt);
				MAPage8.getTxtMedicalEquip10().sendKeys(txt);
				MAPage8.getTxtMedicalEquip11().sendKeys(txt);
				MAPage8.getTxtMedicalEquip12().sendKeys(txt);
				MAPage8.getTxtMedicalEquip13().sendKeys(txt);
				MAPage8.getTxtMedicalEquip14().sendKeys(txt);
				MAPage8.getTxtMedicalEquip15().sendKeys(txt);
				MAPage8.getTxtMedicalEquip16().sendKeys(txt);
				MAPage8.getTxtMedicalEquip17().sendKeys(txt);
				MAPage8.getTxtMedicalEquip18().sendKeys(txt);
				MAPage8.getTxtMedicalEquip19().sendKeys(txt);
				MAPage8.getTxtMedicalEquip20().sendKeys(txt);
				MAPage8.getTxtMedicalEquip21().sendKeys(txt);
				MAPage8.getTxtMedicalEquip22().sendKeys(txt);
				MAPage8.getTxtMedicalEquip23().sendKeys(txt);
				MAPage8.getTxtMedicalEquip24().sendKeys(txt);
				MAPage8.getTxtMedicalEquip25().sendKeys(txt);
				MAPage8.getTxtMedicalEquip26().sendKeys(txt);
				MAPage8.getTxtMedicalEquip27().sendKeys(txt);
				MAPage8.getTxtMedicalEquip28().sendKeys(txt);
				MAPage8.getTxtMedicalEquip29().sendKeys(txt);
				MAPage8.getTxtMedicalEquip30().sendKeys(txt);
				assertEquals(MAPage8.getTxtMedicalEquip2().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip3().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip4().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip5().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip6().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip7().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip8().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip9().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip10().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip11().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip12().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip13().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip14().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip15().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip16().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip17().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip18().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip19().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip20().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip21().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip22().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip23().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip24().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip25().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip26().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip27().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip28().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip29().getAttribute("value"), txt);
				assertEquals(MAPage8.getTxtMedicalEquip30().getAttribute("value"), txt);


				
				
		}
			@Test(priority =8)
			public void TC_MA_Page_8_All_available_numeric() throws InterruptedException {
				
				String txt="87345734";
			
                MAPage8.getTxtAvailCount1().sendKeys(txt);
				MAPage8.getTxtAvailCount2().sendKeys(txt);
				MAPage8.getTxtAvailCount3().sendKeys(txt);
				MAPage8.getTxtAvailCount4().sendKeys(txt);
				MAPage8.getTxtAvailCount5().sendKeys(txt);
				MAPage8.getTxtAvailCount6().sendKeys(txt);
				MAPage8.getTxtAvailCount7().sendKeys(txt);
				MAPage8.getTxtAvailCount8().sendKeys(txt);
				MAPage8.getTxtAvailCount9().sendKeys(txt);
				MAPage8.getTxtAvailCount10().sendKeys(txt);
				MAPage8.getTxtAvailCount11().sendKeys(txt);
				MAPage8.getTxtAvailCount12().sendKeys(txt);
				MAPage8.getTxtAvailCount13().sendKeys(txt);
				MAPage8.getTxtAvailCount14().sendKeys(txt);
				MAPage8.getTxtAvailCount15().sendKeys(txt);
				MAPage8.getTxtAvailCount16().sendKeys(txt);
				MAPage8.getTxtAvailCount17().sendKeys(txt);
				MAPage8.getTxtAvailCount18().sendKeys(txt);
				MAPage8.getTxtAvailCount19().sendKeys(txt);
				MAPage8.getTxtAvailCount20().sendKeys(txt);
				MAPage8.getTxtAvailCount21().sendKeys(txt);
				MAPage8.getTxtAvailCount22().sendKeys(txt);
				MAPage8.getTxtAvailCount23().sendKeys(txt);
				MAPage8.getTxtAvailCount24().sendKeys(txt);
				MAPage8.getTxtAvailCount25().sendKeys(txt);
				MAPage8.getTxtAvailCount26().sendKeys(txt);
				MAPage8.getTxtAvailCount27().sendKeys(txt);
				MAPage8.getTxtAvailCount28().sendKeys(txt);
				MAPage8.getTxtAvailCount29().sendKeys(txt);
				MAPage8.getTxtAvailCount30().sendKeys(txt);
}
			@Test(priority =9)
			public void TC_MA_Page_8_All_functional_numeric() throws InterruptedException {
				
				String txt="87345734";

                MAPage8.getTxtFunctionalCount1().sendKeys(txt);
				MAPage8.getTxtFunctionalCount2().sendKeys(txt);
				MAPage8.getTxtFunctionalCount3().sendKeys(txt);
				MAPage8.getTxtFunctionalCount4().sendKeys(txt);
				MAPage8.getTxtFunctionalCount5().sendKeys(txt);
				MAPage8.getTxtFunctionalCount6().sendKeys(txt);
				MAPage8.getTxtFunctionalCount7().sendKeys(txt);
				MAPage8.getTxtFunctionalCount8().sendKeys(txt);
				MAPage8.getTxtFunctionalCount9().sendKeys(txt);
				MAPage8.getTxtFunctionalCount10().sendKeys(txt);
				MAPage8.getTxtFunctionalCount11().sendKeys(txt);
				MAPage8.getTxtFunctionalCount12().sendKeys(txt);
				MAPage8.getTxtFunctionalCount13().sendKeys(txt);
				MAPage8.getTxtFunctionalCount14().sendKeys(txt);
				MAPage8.getTxtFunctionalCount15().sendKeys(txt);
				MAPage8.getTxtFunctionalCount16().sendKeys(txt);
				MAPage8.getTxtFunctionalCount17().sendKeys(txt);
				MAPage8.getTxtFunctionalCount18().sendKeys(txt);
				MAPage8.getTxtFunctionalCount19().sendKeys(txt);
				MAPage8.getTxtFunctionalCount20().sendKeys(txt);
				MAPage8.getTxtFunctionalCount21().sendKeys(txt);
				MAPage8.getTxtFunctionalCount22().sendKeys(txt);
				MAPage8.getTxtFunctionalCount23().sendKeys(txt);
				MAPage8.getTxtFunctionalCount24().sendKeys(txt);
				MAPage8.getTxtFunctionalCount25().sendKeys(txt);
				MAPage8.getTxtFunctionalCount26().sendKeys(txt);
				MAPage8.getTxtFunctionalCount27().sendKeys(txt);
				MAPage8.getTxtFunctionalCount28().sendKeys(txt);
				MAPage8.getTxtFunctionalCount29().sendKeys(txt);
				MAPage8.getTxtFunctionalCount30().sendKeys(txt);
}
			@Test(priority =10)
			public void TC_MA_Page_8_All_non_functional_numeric() throws InterruptedException {
				
				String txt="87345734";

                MAPage8.getTxtNonFunctionalCount1().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount2().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount3().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount4().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount5().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount6().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount7().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount8().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount9().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount10().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount11().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount12().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount13().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount14().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount15().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount16().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount17().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount18().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount19().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount20().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount21().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount22().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount23().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount24().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount25().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount26().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount27().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount28().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount29().sendKeys(txt);
				MAPage8.getTxtNonFunctionalCount30().sendKeys(txt);
}

			@Test(priority =11)
			public void TC_MA_Page_8_All_AMCCMC_dropdown() throws InterruptedException {
				
				
				MAPage8.getDdlAMCStatus1().sendKeys("Yes");
		        MAPage8.getDdlAMCStatus2().sendKeys("Yes");
				MAPage8.getDdlAMCStatus3().sendKeys("Yes");
				MAPage8.getDdlAMCStatus4().sendKeys("Yes");
				MAPage8.getDdlAMCStatus5().sendKeys("Yes");
				MAPage8.getDdlAMCStatus6().sendKeys("Yes");
				MAPage8.getDdlAMCStatus7().sendKeys("Yes");
				MAPage8.getDdlAMCStatus8().sendKeys("Yes");
				MAPage8.getDdlAMCStatus9().sendKeys("Yes");
				MAPage8.getDdlAMCStatus10().sendKeys("Yes");
				MAPage8.getDdlAMCStatus11().sendKeys("Yes");
				MAPage8.getDdlAMCStatus12().sendKeys("Yes");
				MAPage8.getDdlAMCStatus13().sendKeys("Yes");
				MAPage8.getDdlAMCStatus14().sendKeys("Yes");
				MAPage8.getDdlAMCStatus15().sendKeys("Yes");
				MAPage8.getDdlAMCStatus16().sendKeys("No");
				MAPage8.getDdlAMCStatus17().sendKeys("No");
				MAPage8.getDdlAMCStatus18().sendKeys("No");
				MAPage8.getDdlAMCStatus19().sendKeys("No");
				MAPage8.getDdlAMCStatus20().sendKeys("No");
				MAPage8.getDdlAMCStatus21().sendKeys("No");
				MAPage8.getDdlAMCStatus22().sendKeys("No");
				MAPage8.getDdlAMCStatus23().sendKeys("No");
				MAPage8.getDdlAMCStatus24().sendKeys("No");
				MAPage8.getDdlAMCStatus25().sendKeys("No");
				MAPage8.getDdlAMCStatus26().sendKeys("No");
				MAPage8.getDdlAMCStatus27().sendKeys("No");
				MAPage8.getDdlAMCStatus28().sendKeys("No");
				MAPage8.getDdlAMCStatus29().sendKeys("No");
				MAPage8.getDdlAMCStatus30().sendKeys("No");
			}
			
			@Test(priority =12)
			public void TC_MA_Page_8_All_remarks() throws InterruptedException {
				
				String txt="129.47jhdgh'.;][32bq";
				   	MAPage8.getTxtMedicalEquipRemarks1().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks2().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks3().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks4().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks5().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks6().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks7().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks8().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks9().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks10().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks11().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks12().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks13().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks14().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks15().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks16().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks17().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks18().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks19().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks20().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks21().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks22().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks23().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks24().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks25().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks26().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks27().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks28().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks29().sendKeys(txt);
					MAPage8.getTxtMedicalEquipRemarks30().sendKeys(txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks1().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks2().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks3().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks4().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks5().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks6().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks7().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks8().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks9().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks10().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks11().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks12().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks13().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks14().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks15().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks16().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks17().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks18().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks19().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks20().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks21().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks22().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks23().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks24().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks25().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks26().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks27().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks28().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks29().getAttribute("value"), txt);
					assertEquals(MAPage8.getTxtMedicalEquipRemarks30().getAttribute("value"), txt);
					
					
}
			
			@Test(priority =13)

			public void TC_MA_mandatory_alert_check() throws InterruptedException, IOException {
				
					
					try {
						MAPage8.getbtnNext().click();
						MAPage8.getbtnNext().sendKeys(Keys.ENTER);
					    Alert alert = driver.switchTo().alert();
					    // You can get the text of the alert and handle it accordingly
					    System.out.println("Alert message: " + alert.getText());
					    assertEquals(alert.getText(), "Please enter  Medical Equipment 1.");

					    
					    // You can dismiss the alert using the dismiss() method
					    alert.dismiss();
					    // Or you can accept it using the accept() method
					    // alert.accept();
					    
					    // Continue with your test script
					} catch (UnhandledAlertException e) {
					    // Log the exception or handle it appropriately
					    e.printStackTrace();
					}}
				
			
			@Test(priority =14)
			public void TC_MA_mandatory_field_50_characters_max() throws InterruptedException {
				
				String txt="129.47jhdgh.32bqwie bcqiy wbdiqb wdi qiwduqwi dnqw";
			
				MAPage8.getTxtMedicalEquip1().sendKeys(txt);
				assertEquals(MAPage8.getTxtMedicalEquip1().getAttribute("value"), txt);

				
			}
			
			@Test(priority =15)
			public void TC_MA_Page_8_submit_for_approval_and_previous() throws InterruptedException {
				
				
				MAPage8.getbtnNext().click();
//				int currentMonth = Calendar.getInstance().get(Calendar.MONTH)-1;
//				
//				if (currentMonth < 0) {
//				    currentMonth = 11; // Set it to December (index 11)
//				}
//				
//				String[] monthsArray = {"January", "February", "March", "April", "May", "June",
//                        "July", "August", "September", "October", "November", "December"};
//				
//				String txt = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/div[1]/div[5]/div[1]/div[2]/p")).getAccessibleName();
//				assertEquals(txt, "Monthly Assesment for the "+monthsArray[currentMonth]+" has been generated and sent for approval");
				Thread.sleep(2000);
				utilobj.getScreenshot(driver, "Sent for Approval");
				
}
}


