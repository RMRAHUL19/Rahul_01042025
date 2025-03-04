package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

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
import com.qa.pages.MAPage5;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MATest5  extends CrossBrowser {

	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	MAPage5 MAPage5;
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

		MAPage5 = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks5();
	}

			
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

	}
	
	@Test(priority =5)
	public void TC_MA_Page_5_11_dropdown() throws InterruptedException {
		utilobj.selectDropdown(MAPage5.getddlFacilityFunctional(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getddlFacilityFunctional(), driver, "No", "firefox");

		
	}
	@Test(priority =6)
	public void TC_MA_Page_5_11_float() throws InterruptedException {
		
		String txt="12347.1234";
		MAPage5.getPage5_txtPercentageBloodBank().clear();
		MAPage5.getPage5_txtPercentageBloodBank().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtPercentageBloodBank().getAttribute("value"), txt);

	
}

	@Test(priority =7)
	public void TC_MA_Page_5_11_numeric() throws InterruptedException {
		
		String txt="123471234";
	
		MAPage5.getPage5_txtBloodUnitsIssuedMonth().clear();
		MAPage5.gettxtBloodUnitsExpiredMonth().sendKeys(txt);
		MAPage5.getPage5_txtBloodDonationCamp().sendKeys(txt);
	}
	
	@Test(priority =8)
	public void TC_MA_Page_5_11_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtRemarksBloodBank().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtRemarksBloodBank().getAttribute("value"), txt);

}
	
	@Test(priority =9)
	public void TC_MA_Page_5_12_numeric() throws InterruptedException {
		
		String txt="123471234";
		MAPage5.getPage5_txtItemsCondemnedPresentMedical().sendKeys(txt);
		MAPage5.getPage5_txtItemsCondemnedPresentNonMedical().sendKeys(txt);
		MAPage5.getPage5_txtItemsCondemnedMedical().sendKeys(txt);
		MAPage5.getPage5_txtItemsCondemnedNonMedical().sendKeys(txt);
}
	
	
	@Test(priority =10)
	public void TC_MA_Page_5_12_datepicker() throws InterruptedException {
		
		MAPage5.getPage5_txtDateLastCondemnedMedical().click();
	    MAPage5.getPage5_calLastCondemnedMedical_day_2_3().click();
		
		MAPage5.getPage5_txtDateLastCondemnedNonMedical().click();
	    MAPage5.getPage5_calLastCondemnedNonMedical_day_2_3().click();
	    
	    MAPage5.getPage5_txtDateDisposalItemMedical().click();
	    MAPage5.getPage5_calDisposalItemMedical_day_2_3().click();
	    
	    MAPage5.getPage5_txtDateDisposalItemNonMedical().click();
	    MAPage5.getPage5_calDisposalItemNonMedical_day_2_3().click();
	    
	    MAPage5.getPage5_txtRecordWeeding().click();
	    MAPage5.getPage5_calRecordWeeding_day_2_3().click();
	}
	

	@Test(priority =11)
	public void TC_MA_Page_5_12_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		
		MAPage5.getPage5_txtRemarksCondemnation().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtRemarksCondemnation().getAttribute("value"), txt);


	}
	
	@Test(priority =12)
	public void TC_MA_Page_5_13_numeric() throws InterruptedException {
		
		String txt="123471234";
		MAPage5.getPage5_txtHouseKeepingPersonnelHired().sendKeys(txt);

}
	@Test(priority =13)
	public void TC_MA_Page_5_13_dropdown() throws InterruptedException {
		utilobj.selectDropdown(MAPage5.getPage5_ddlHouseKeepingBiometricAttendance(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlHouseKeepingPFDeduction(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlHouseKeepingMinWages(), driver, "No", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlHouseKeepingECS(), driver, "No", "firefox");
}
	

	@Test(priority =14)
	public void TC_MA_Page_5_13_datepicker() throws InterruptedException {
		
		
		MAPage5.getPage5_txtHouseKeepingDateOnsetContract().click();
	    MAPage5.getcclHouseKeepingDateOnsetContract_day_2_3().click();
		
}
	@Test(priority =15)
	public void TC_MA_Page_5_13_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtHouseKeepingRemarks().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtHouseKeepingRemarks().getAttribute("value"), txt);


}
	
	@Test(priority =16)
	public void TC_MA_Page_5_14_numeric() throws InterruptedException {
		
		String txt="21989347";
		MAPage5.getPage5_txtSecurityStaffPersonelHired().sendKeys(txt);

}
	@Test(priority =17)
	public void TC_MA_Page_5_14_dropdown() throws InterruptedException {
		utilobj.selectDropdown(MAPage5.getddlSecurityStaffBiometricAttendance(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getddlSecurityStaffPFDeduction(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlSecurityStaffMinWages(), driver, "Yes", "firefox");
        utilobj.selectDropdown(MAPage5.getPage5_ddlSecurityStaffECS(), driver, "Yes", "firefox");

}
	@Test(priority =18)
	public void TC_MA_Page_5_14_datepicker() throws InterruptedException {
		
		
		MAPage5.getPage5_txtSecurityStaffDateOnsetContract().click();
	    MAPage5.getPage5_cclSecurityStaffDateOnsetContract_day_2_3().click();
		
}
	
	@Test(priority =19)
	public void TC_MA_Page_5_14_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtSecurityStaffRemarks().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtSecurityStaffRemarks().getAttribute("value"), txt);


}
	
	@Test(priority =20)
	public void TC_MA_Page_5_15_numeric() throws InterruptedException {
		
		String txt="219812345";
		MAPage5.getPage5_txtARMPersonnelHired().sendKeys(txt);

}
	@Test(priority =21)
	public void TC_MA_Page_5_15_dropdown() throws InterruptedException {
		utilobj.selectDropdown(MAPage5.getPage5_ddlARMBiometricAttendance(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlARMPFDeduction(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlARMMinWages(), driver, "Yes", "firefox");
        utilobj.selectDropdown(MAPage5.getPage5_ddlARMStatusECS(), driver, "Yes", "firefox");

}
	@Test(priority =22)
	public void TC_MA_Page_5_15_datepicker() throws InterruptedException {
		
		
		MAPage5.getPage5_txtARMDateOnsetContract().click();
	    MAPage5.getPage5_cclARMDateOnsetContract_day_2_3().click();
		
}
	
	@Test(priority =23)
	public void TC_MA_Page_5_15_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtARMRemarks().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtARMRemarks().getAttribute("value"), txt);


}
	@Test(priority =24)
	public void TC_MA_Page_5_16_dropdown() throws InterruptedException {
		utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlBMWManagement(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlDisplayWorkInstruction(), driver, "Yes", "firefox");
		utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlAvailColuredLiners(), driver, "No", "firefox");
        utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlAvailColorCoded(), driver, "No", "firefox");
        utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlSegregationBMW(), driver, "Yes", "firefox");
        utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlAvailPPE(), driver, "No", "firefox");
        utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlProofBoxes(), driver, "Yes", "firefox");
        utilobj.selectDropdown(MAPage5.getPage5_ddlInfectionControlMutilation(), driver, "No", "firefox");
	}
	
	@Test(priority =25)
	public void TC_MA_Page_5_16_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtInfectionControlRemarks().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtInfectionControlRemarks().getAttribute("value"), txt);


}
	@Test(priority =26)
	public void TC_MA_Page_5_17_numeric() throws InterruptedException {
		
		String txt="931234647";
		MAPage5.getPage5_txtTrainingConductedLastMonth().sendKeys(txt);}
	
	@Test(priority =27)
	public void TC_MA_Page_5_17_2_numeric() throws InterruptedException {
		
		String txt="93474364";
		MAPage5.getPage5_txtInfectionControlRemarks().sendKeys(txt);
		MAPage5.getPage5_txtTrainingTrainedPerson1().sendKeys(txt);

}


	@Test(priority =27)
	public void TC_MA_Page_5_17_2_alphabets() throws InterruptedException {
		
		String txt="testing wuneduwneid ywbqedvuqwdbuyqw";
		MAPage5.getPage5_txtTrainingCategory1().sendKeys(txt);
	}
	
	@Test(priority =29)
	public void TC_MA_Page_5_17_2_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtTrainingRemarks1().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtTrainingRemarks1().getAttribute("value"), txt);

	}
	@Test(priority =30)
	public void TC_MA_Page_5_17_2_add_new() throws InterruptedException {
		
		
		MAPage5.getPage5_btnTrainingAdd1().click();
		driver.findElement(By.id("ctl00_cphpage_Page5_btnTrainingAdd2")).click();
		driver.findElement(By.id("ctl00_cphpage_Page5_btnTrainingAdd3")).click();

	}
	@Test(priority =31)
	public void TC_MA_Page_5_17_2_add_new_text() throws InterruptedException {
		String txt="testing wuneduwneid ywbqedvuqwdbuyqw";
		
		MAPage5.getPage5_txtTrainingCategory2().sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingCategory3")).sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingCategory4")).sendKeys(txt);

		
	}
	@Test(priority =32)
	public void TC_MA_Page_5_17_2_add_new_numeric() throws InterruptedException {
		String txt="875461277";
		
		MAPage5.getPage5_txtTrainingTrainedPerson2().sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingTrainedPerson3")).sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingTrainedPerson4")).sendKeys(txt);

	}
	@Test(priority =33)
	public void TC_MA_Page_5_17_2_add_new_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtTrainingRemarks2().sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingRemarks3")).sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingRemarks4")).sendKeys(txt);

		
	}
	
	@Test(priority =34)
	public void TC_MA_Page_5_18_numeric() throws InterruptedException {
		
		String txt="8754654667";
		MAPage5.getPage5_txtHardwareACtiveTerminals().sendKeys(txt);
		MAPage5.getPage5_txtHardwareLoginIdIssued().sendKeys(txt);
	
	}
	
	
	@Test(priority =35)
	public void TC_MA_Page_5_18_remarks() throws InterruptedException {
		
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtHardwareRemarks().sendKeys(txt);
		assertEquals(MAPage5.getPage5_txtHardwareRemarks().getAttribute("value"), txt);

	}
	
	
	@Test(priority =36)
	public void TC_MA_Page_5_17_2_add_new_redo() throws InterruptedException {
		
		
		driver.findElement(By.id("ctl00_cphpage_Page5_btnTrainingDelete1")).click();
		driver.findElement(By.id("ctl00_cphpage_Page5_btnTrainingDelete2")).click();
		driver.findElement(By.id("ctl00_cphpage_Page5_btnTrainingDelete3")).click();
		
		
		MAPage5.getPage5_btnTrainingAdd1().click();
		driver.findElement(By.id("ctl00_cphpage_Page5_btnTrainingAdd2")).click();
		driver.findElement(By.id("ctl00_cphpage_Page5_btnTrainingAdd3")).click();
		
		
		String txt="testing wuneduwneid ywbqedvuqwdbuyqw";
		
		MAPage5.getPage5_txtTrainingCategory2().sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingCategory3")).sendKeys(txt);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingCategory4")).sendKeys(txt);
		
		
		String number="875461277";
		
		MAPage5.getPage5_txtTrainingTrainedPerson2().sendKeys(number);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingTrainedPerson3")).sendKeys(number);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingTrainedPerson4")).sendKeys(number);
		
		
		String remarks="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		MAPage5.getPage5_txtTrainingRemarks2().sendKeys(remarks);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingRemarks3")).sendKeys(remarks);
		driver.findElement(By.id("ctl00_cphpage_Page5_txtTrainingRemarks4")).sendKeys(remarks);

	}
	
	
	@Test(priority =37)
	
	public void TC_MA_mandatory_alert_check() throws InterruptedException, IOException {
		
			
			try {
				MAPage5.getcphpage_btnNext().click();
				MAPage5.getcphpage_btnNext().sendKeys(Keys.ENTER);
			    Alert alert = driver.switchTo().alert();
			    // You can get the text of the alert and handle it accordingly
			    System.out.println("Alert message: " + alert.getText());
			    assertEquals(alert.getText(), "Please enter No. of blood units issued in last Month.");

			    
			    // You can dismiss the alert using the dismiss() method
			    alert.dismiss();
			    // Or you can accept it using the accept() method
			    // alert.accept();
			    
			    // Continue with your test script
			} catch (UnhandledAlertException e) {
			    // Log the exception or handle it appropriately
			    e.printStackTrace();
			}}
	
	
	@Test(priority =38)
	public void TC_MA_mandatory_field() throws InterruptedException {
		
		String txt="219347122";
		MAPage5.getPage5_txtBloodUnitsIssuedMonth().sendKeys(txt);
		
	}
	
	@Test(priority =39)
	public void TC_MA_Page_5_save_and_next_and_previous() throws InterruptedException {
		
		
		MAPage5.getcphpage_btnNext().click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_cphpage_btnPrevious")).click();

	}
	
	
	}
	
	