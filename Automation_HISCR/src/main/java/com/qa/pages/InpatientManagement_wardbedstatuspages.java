package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.qa.util.util;

public class InpatientManagement_wardbedstatuspages extends BasePage {

	WebDriver driver;
	
	public InpatientManagement_wardbedstatuspages(WebDriver driver){
		
		super(driver);
		
	}
	util utilobj = new util();
	private By Plusicon=By.xpath("//tbody/tr[@id='ctl00_cphpage_lstViewWard_ctrl0_row']/th[1]/img[1]");
	public WebElement getPlusicon() {
		return getElement(Plusicon);
	}
	
	
}

