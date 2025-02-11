package com.qa.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Investigation_PrescriptionsPage;
import com.qa.pages.Loginpage;
import com.qa.pages.OPCaseSheetPage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class Investigation_PrescriptionsTest extends BaseTest {
	public void getInvestigation_PrescriptionsPage() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OPCaseSheetPage opCaseSheetPage;
	Investigation_PrescriptionsPage IPP;
	util utilobj=new util();
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	public void doNavigateToHISHomeTest() {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"));
	}
	
	@Test(priority = 3)
	public void doNavigateToPatientCheckInTest() {

		IPP=hishomepage.doNavigateTogetInvestigation_PrescriptionsLink();
	}
	@Test(priority = 4)
	public void tochecktheFunctinalityofSaveButton() throws AWTException, InterruptedException {
		Thread.sleep(1000);
		IPP.getimgSearchUHID().click();
		Thread.sleep(1000);
		Robot rb=new Robot();
		utilobj.selectDropdown(IPP.getUHID_DLL(), driver, "Starts With");
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		IPP.getUHID_textBOX().sendKeys("DUMM");
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		IPP.getUHID_RadioButton().click();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
//		IPP.getUHID_ButtonSelect();
		Thread.sleep(1000);
//      IPP.getimgSearchUHIDDoctor().click();
//		Thread.sleep(1000);
//		utilobj.SwitchToChildWindow(driver,"Doctor Search");
//		
//		Thread.sleep(1000);
//		rb.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		rb.keyPress(KeyEvent.VK_TAB);
		String parent3 = driver.getWindowHandle();

		//1
		utilobj.Window(driver);
		Thread.sleep(2000);
		IPP.getimgSearchUHIDDoctor().click();
		Thread.sleep(2000);
		 utilobj.ChildWindow(driver);
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
			Thread.sleep(2000);
		IPP.getUHIDDoctor_Name().sendKeys("test");
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		IPP.getUHIDDoctor_CheckBox().click();
		Thread.sleep(2000);
		IPP.getUHIDDoctor_SelectButton().click();
		Thread.sleep(2000);
		driver.switchTo().window(parent3);
		Thread.sleep(2000);
		
		/*//2
		 * IPP.getimgSearchUHIDDoctor().click();
		 * driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS); // store all
		 * window handles Set<String> a = driver.getWindowHandles(); // iterate through
		 * handles Iterator<String> it = a.iterator(); Thread.sleep(2000); String chlwnd
		 * = it.next(); Thread.sleep(2000); String pwnd = it.next(); Thread.sleep(2000);
		 * // switch to child window driver.switchTo().window(chlwnd);
		 * Thread.sleep(2000); System.out.println("Page title "+ driver.getTitle()); //
		 * switch to parent window driver.switchTo().window(pwnd);
		 * System.out.println("Page title "+ driver.getTitle()); driver.quit();
		 */
		//3
		/*IPP.getimgSearchUHIDDoctor().click();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS); // store all
		String MainWindow=driver.getWindowHandle();		
		Thread.sleep(2000);
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();	
            Thread.sleep(2000);
        Iterator<String> i1=s1.iterator();		
        Thread.sleep(2000);
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
            	Thread.sleep(2000);
                    driver.switchTo().window(ChildWindow);	 
                    Thread.sleep(2000);
                               driver.getTitle();  
                               Thread.sleep(2000);
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
        Thread.sleep(2000);
            driver.switchTo().window(MainWindow);				
    }*/
		//4
		/*IPP.getimgSearchUHIDDoctor().click();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);

		}*/
		
	}
	
}


