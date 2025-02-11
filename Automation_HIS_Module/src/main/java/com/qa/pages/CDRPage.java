package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;
import io.qameta.allure.Step;

public class CDRPage extends BasePage {
	

	util utilobj = new util();

	public CDRPage(WebDriver driver) {
		super(driver);

	}
	

	private By txtIPNumber = By.id("ctl00_cphpage_SearchUserControl1_txtIPNumber");

	private By SearchBtnUhid = By.id("ctl00_cphpage_SearchUserControl1_imgBtnUhid");

	//private By SelectBtn = By.xpath("//html//body//table[@id='ctl00_cphpage_SearchUserControl1_gdvSearch']//tbody//tr//td/a");
	private By SelectBtn = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/div[2]/table[2]/tbody/tr[1]/td/div/div/table[2]/tbody/tr[2]/td[5]/a");
	                                 
	private By mgBtnDetails = By.id("ctl00_cphpage_imgBtnDetails");
	private By tvCompleteDetailst2 = By.id("ctl00_cphpage_tvCompleteDetailst9");
	private By priscriptionlink = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div[1]/div/a");
	private By viewResult = By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div[1]/div[2]/div/table/tbody/tr[3]/td[5]/a");
	private By Resultclose = By.id("ctl00_cphpage_imgbtnPopClose");
	public WebElement gettxtIPNumber() {
		return getElement(txtIPNumber);
	}

	public WebElement getResultclose() {
		return getElement(Resultclose);
	}
	public WebElement getviewResult() {
		return getElement(viewResult);
	}
	public WebElement getpriscriptionlink() {
		return getElement(priscriptionlink);
	}

	public WebElement getSearchBtnUhid() {
		return getElement(SearchBtnUhid);
	}

	public WebElement getSelectBtn() {
		return getElement(SelectBtn);
	}
	public WebElement getmgBtnDetails() {
		return getElement(mgBtnDetails);
	}
	public WebElement gettvCompleteDetailst2() {
		return getElement(tvCompleteDetailst2);
	}

	private By SpecilazitionRadiobutton = By.id("ctl00_cphpage_rbSpecalization");
	public WebElement getSpecilazitionRadiobutton() {
		return getElement(SpecilazitionRadiobutton);
	}
	private By SpecilazitionDDL = By.id("ctl00_cphpage_ddlSpecalization");
	public WebElement getSpecilazitionDDL() {
		return getElement(SpecilazitionDDL);
	}
	private By DiagnoseRadiobutton = By.id("ctl00_cphpage_rbDiagnosis");
	public WebElement getDiagnoseRadiobutton() {
		return getElement(DiagnoseRadiobutton);
	}
	private By DiagnoseDDL = By.id("ctl00_cphpage_ddlDiagnosis");
	public WebElement getDiagnoseDDL() {
		return getElement(DiagnoseDDL);
	}
	private By EpisodeWiseradiobutton = By.id("ctl00_cphpage_rbEpisode");
	public WebElement getEpisodeWiseradiobutton() {
		return getElement(EpisodeWiseradiobutton);
	}







}
