package com.qa.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.pages.CDRPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.ImpactOnHis_Ins_Uhid_CreationPage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class ImpactOnHis_Ins_Uhid_CreationTest extends BaseTest {
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CDRPage cdrpage;
	//ExtentReporterNG ex=new ExtentReporterNG();
	util utilobj = new util();
	String ip="1115104063";
	ImpactOnHis_Ins_Uhid_CreationPage IOHIUC;
	int i;
	@Test(priority =0)

	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority =2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
		IOHIUC=hishomepage.donavigatetoUhidCreationforImpactOnHis_Ins_Uhid_CreationPage();
	}
	@Test(priority = 3)
	public void DoTestCaseforIP_IntegtationToUHIDScreen() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_txtInsuranceNo")).sendKeys(ip);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
		Thread.sleep(1000);
		List<WebElement>Row=driver.findElements(By.xpath("//*[@id='ctl00_cphpage_hisLiveListControl_gdvInsurance']//tbody//tr"));
		System.out.println(Row.size());
	for(int i=2;i<=Row.size();i++) {
		String status= driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[4]/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td/div[1]/div[2]/table/tbody/tr/td/div/div/div/table/tbody/tr["+i+"]/td[7]/span")).getText();
		System.out.println(status);                 
		String Value=status.substring(0, 4);        
		System.out.println("value of string="+Value);
		int leanth=status.length();
		System.out.println(leanth);
		if(leanth==15)
		{
			System.out.println("passed");
		}
		else {
			System.out.println("Failed");
		}
	}

//		ArrayList<String> l1=new ArrayList<>();
//		l1.add("");
//		l1.add("name1");
//		l1.add("name2");
//		l1.add("name3");
//		l1.add("6-Dec-2020");
//		l1.add("");
//		l1.add("mr Father");
//		l1.add("mis Mother");
//		l1.add("");
//		l1.add("test identifivcation 1");
//		l1.add("test identifivcation 1");
//		l1.add("test Address");
//		l1.add("test Address2");
//		l1.add("test Address3");
//		l1.add("250001");
//		l1.add("7017299403");
//		List<WebElement> element=driver.findElements(By.className("textboxname"));//enter the data in textbox
//		System.out.println(element.size());
//		for(i=1;i<element.size();i++) {
//			//if(i<l1.size())
//			
//			if(i<l1.size() && element.get(i).isEnabled()&& element.get(i).getText()==null)  {
//				element.get(i).sendKeys(l1.get(i));
//			}
//			else {
//				i++;
//			}
//		}
		
		
		
	}
	

}
