package in.esic.uipackageHIS;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaffLoginPage {
 
	
	WebDriver driver;

	public StaffLoginPage(WebDriver driver) {
		this.driver = driver;

	}

   //  @FindBy(how = How.CSS, using = "#ctl00_cphpage_ddlHospital")
   //  @CacheLookup
  //   WebElement Location;

	@FindBy(how = How.CSS, using = "#ctl00_cphpage_ddlFacility")
	@CacheLookup
	WebElement Facility;

	@FindBy(how = How.CSS, using = "#ctl00_cphpage_btnSubmit")
	@CacheLookup
	WebElement submit;

	public void StaffLoginWordpress(String ward) throws InterruptedException {
		
		// It will return the parent window name as a String
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

         
		
		
	    Select userlocation1 = new Select(driver.findElement(By.id("ctl00_cphpage_ddlHospital")));
	    userlocation1.selectByVisibleText("ESIC TEST HOSPITAL DL");
		Thread.sleep(1000);

		Select userFacility = new Select(Facility);
		userFacility.selectByVisibleText(ward);
		Thread.sleep(1000);

		submit.click();
		Thread.sleep(2000);

		}
		
		
		}
		
	}
	
}


