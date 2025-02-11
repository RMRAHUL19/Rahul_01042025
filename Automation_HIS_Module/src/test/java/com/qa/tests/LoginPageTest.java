package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.Loginpage;
import com.qa.util.ReadDataFile;

public class LoginPageTest extends BaseTest {
	
	ReadDataFile readdata = new ReadDataFile();
	Loginpage loginpage;
	
	@Test
	public void doLoginTest() {
		
		loginpage = new Loginpage(driver);
		
		String ui = readdata.readDataFile("LoginPage", 1, "uidd", "LoginPage");
		String pwd = readdata.readDataFile("LoginPage", 1, "pwdd", "LoginPage");
		
		//String ui = prop.getProperty("uidd");
		//String pwd = prop.getProperty("pwdd");
		
		System.out.println(ui);
		System.out.println(pwd);

		loginpage.doLogin(ui,pwd);
		
		
		
	}
	

}
