package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.tools.ant.taskdefs.Echo;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.EditCertificatePage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OpenVisitPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class EditCertificateTest extends CrossBrowser {
	public EditCertificateTest() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	EditCertificatePage ECP;
	
	@Test(priority = 0)
	public void doLoginOpenVisitTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),browser);
	}

	@Test(priority = 3)
	public void doNavigateToEditCertificateTest() {

		ECP=hishomepage.doNavigateToEditCertificatePageLink();		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void CheckTheFunctionalityOfRequestForChangedUPdateButton(String browser) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		ECP.getEditCertificate_SearchImage().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_Insurance_NO_DLL(), driver, "Starts With",browser);
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_NO_TextBox().sendKeys("1199900090");
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SearchButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_RadioButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SelectButton().click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		Thread.sleep(2000);
		ECP.getEditCertificate_RadioButtonSpellchange().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButtonCencetCertificate().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_CertificateTypeChange().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-First",browser);
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-Intermediate",browser);
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-Final",browser);
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-Special Intermediate",browser);
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_DOA_DOCChanged().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_ButtonUpdate().click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBox_ButtonOK")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void ChecktheFunctionalityOftoNavigateToEditMeternityCertificatePages() throws InterruptedException {

		Thread.sleep(1000);
		ECP=hishomepage.doNavigateToEditMaternityCertificatePageLink();
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void ChecktheFunctionalityOfUpdateButtonOfEditMeternityCertificatePages() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		ECP.getEditCertificate_SearchImage().click();
		ECP.getEditCertificate_Certification_NO_TextBox().sendKeys("1199900090");
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SearchButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_RadioButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SelectButton().click();
		Thread.sleep(1000);
		ECP.getEditMeterNityCertificate_RemarksTextBoxElement().clear();
		Thread.sleep(1000);
		ECP.getEditMeterNityCertificate_RemarksTextBoxElement().sendKeys("Test Remark");
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_ButtonUpdate().click();
		Thread.sleep(1000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		
}
	}
