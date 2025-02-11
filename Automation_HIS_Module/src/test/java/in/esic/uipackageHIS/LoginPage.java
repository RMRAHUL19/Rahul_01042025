package in.esic.uipackageHIS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

	public class LoginPage {

		WebDriver driver;

		public LoginPage(WebDriver driver) {

			this.driver = driver;
		}

		@FindBy(how = How.ID, using = "IDToken1")
		@CacheLookup
		WebElement username;

		@FindBy(how = How.ID, using = "IDToken2")
		@CacheLookup
		WebElement password;

		@FindBy(how = How.NAME, using = "Login.Submit")
		@CacheLookup
		WebElement login;

		@FindBy(how = How.LINK_TEXT, using = "Applications")
		@CacheLookup
		WebElement Applications;

		@FindBy(how = How.LINK_TEXT, using = "Health Information System")
		@CacheLookup
		WebElement HealthInformationSystem;

		public void verifyHomepage(String username1, String password1) throws InterruptedException {
			username.sendKeys(username1);
			Thread.sleep(4000);
			password.sendKeys(password1);
			Thread.sleep(4000);
			login.click();
			Thread.sleep(4000);
	        
	        //selecting the domain of Health Information System from Applications drop down menu
	 		Actions action = new Actions(driver);
			action.moveToElement(Applications).build().perform();;
			
			//Thread.sleep(2000);

			Actions action1 = new Actions(driver);
			action1.moveToElement(HealthInformationSystem).click().build().perform();
			Thread.sleep(2000);      
		
		}

	}