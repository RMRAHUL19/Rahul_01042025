package com.qa.pages;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pages.BasePage;
import com.qa.util.util;

 public class ClinicalRecord extends BasePage {
	 util utilobj=new util();
	 public ClinicalRecord(WebDriver driver) {
		 super(driver);
	 }
	 private By ImgUhidSearchLink = By.id("ctl00_cphpage_imgsearchuhid");
	 
	 private By UhidSerchTextBoxLink = By.id("ctl00_cphpage_txtUhid");
	 
	
public WebElement getImgUhidSearchLink(){
	return getElement(ImgUhidSearchLink);
	
}
public WebElement getUhidSerchTextBoxLink() {
	return getElement(UhidSerchTextBoxLink);
}
public void  dogenratecertification(String UHIDNO) {
	getUhidSerchTextBoxLink().sendKeys(UHIDNO);
}
}