package ESIC_HIS.ProductionScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.IndentRaisedworkFlowPage;
import com.qa.pages.Loginpage;
import com.qa.pages.PhysicalStockEntryPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

public class IndentRaisedworkFlow extends CrossBrowser {
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	IndentRaisedworkFlowPage IRWFP;
	String EntryNo;
	util utilobj=new util();
	String parent3;
	String parent2;
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	@Test(priority =1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"),Browser);
	}
	@Test(priority = 3)
	public void doNavigateToPhysicalStockEntryLink() {

		IRWFP = hishomepage.doNavigateToIndentRaisedLink();
	}

@Test(priority = 4)
public void Do_Test_for_Select_Indent_To() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
	IRWFP.getIndentToSearchImageButton().click();
	wait.until(ExpectedConditions.visibilityOf(IRWFP.getIndentTo_StoreNameTextBox()));
	IRWFP.getIndentTo_StoreNameTextBox().sendKeys("Female medical ward");
	IRWFP.getIndentTo_Store_SearchButton().click();
	wait.until(ExpectedConditions.visibilityOf(IRWFP.getIndentTo_Store_CheckBox()));
	IRWFP.getIndentTo_Store_CheckBox().click();
	IRWFP.getIndentTo_Store_SelectButton().click();
	wait.until(ExpectedConditions.visibilityOf(IRWFP.getIndentTo_Item_NameImageSearchButton()));
	


}
@Test(priority = 5)
public void Do_Test_for_ClickOn_ItemSearchImgButton() throws InterruptedException {
	 parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
	IRWFP.getIndentTo_Item_NameImageSearchButton().click();	
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
@Test(priority = 6)
public void Do_Test_for_SearchTheItem() throws InterruptedException {
	Thread.sleep(2000);
	IRWFP.getIndentTo_Item_Name_SearchTextbox().sendKeys("Paracetamol");
	
	Thread.sleep(2000);
	IRWFP.getIndentTo_Item_Name_searchButton().click();
	
	IRWFP.getIndentTo_Item_Name_checkbox().click();
	
	IRWFP.getIndentTo_Item_Name_SelectButton().click();
	
	Thread.sleep(2000);
	driver.switchTo().window(parent3);
}
@Test(priority = 7)
public void Do_Test_for_EnterQuantity_SaveButton() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
	wait.until(ExpectedConditions.visibilityOf(IRWFP.getIndentTo_RequirmentQuantityTextBox()));
	IRWFP.getIndentTo_RequirmentQuantityTextBox().sendKeys("1");
	Thread.sleep(2000);
	IRWFP.getIndentTo_RemarksTextBox().sendKeys("test Remarks");
	IRWFP.getIndentTo_SaveButton().click();
	Thread.sleep(2000);
	
}
@Test(priority = 8)
public void Do_Test_for_viewButton() throws InterruptedException {
	IRWFP.getIndentTo_SuccessOkButton().click();
	Thread.sleep(2000);
	IRWFP.getIndentTo_ViewButton().click();
	
}
@Test(priority = 9)
public void Do_Test_for_Indent_worklist_viewIndent() throws InterruptedException {
	IRWFP.getIndentWorkList_IsuueRadiobutton().click();
	parent3 = driver.getWindowHandle();
	utilobj.Window(driver);
	
	IRWFP.getIndentWorkList_ViewIndent().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	driver.manage().window().maximize();
	IRWFP.getIndentWorkList_ViewIndent_ApproveButton().click();
	IRWFP.getIndentTo_SuccessOkButton().click();
	IRWFP.getIndentWorkList_ViewIndent_CloseButton().click();
	driver.switchTo().window(parent3);
}
@Test(priority = 10)
@Parameters("browser")
public void Do_Test_for_ChangeLocation(String Browser) throws InterruptedException {
	Thread.sleep(2000);
	IRWFP.getChangeLocation().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("FemaleMedicalWard"),Browser);
	
}
@Test(priority = 11)
public void Do_Test_for_IndentWorkList_ViewIndent() throws InterruptedException {
	Thread.sleep(2000);
	IRWFP = hishomepage.doNavigateToIndentWorklistLink();
	Thread.sleep(2000);
	IRWFP.getWarningMessageOkButton().click();
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_IssueTab().click();
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_IndentIssueRadiobutton().click();
	Thread.sleep(2000);
	parent3 = driver.getWindowHandle();
	utilobj.Window(driver);
	IRWFP.getIndentWorkList_IssueViewIndent().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	driver.manage().window().maximize();
	
	
}
@Test(priority = 12)
public void Do_Test_for_IndentWorkList_ApproveIndent() {
	IRWFP.getIndentWorkList_ViewIndent_ApproveButton().click();
	

}
@Test(priority = 13)
public void Do_Test_for_IndentWorkList_issueIndent_SubsituteItem() throws InterruptedException {
	IRWFP.getIndentTo_SuccessOkButton().click();
	IRWFP.getIndentWorkList_ViewIndent_CloseButton().click();
	Thread.sleep(2000);
	driver.switchTo().window(parent3);//close the window
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_IndentIssueRadiobutton().click();
	Thread.sleep(2000);
	parent3 = driver.getWindowHandle();
	Thread.sleep(2000);
	utilobj.Window(driver);
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_Issue_IssueIndentButton().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	//second window
	parent2=driver.getWindowHandle();
	Thread.sleep(2000);
	utilobj.Window(driver);
	IRWFP.getIndentWorkList_Issue_IssueIndent_SubItemsearchButton().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_Issue_IssueIndent_SubsituteItemCheckButton().click();
	
}
@Test(priority = 14)
@Parameters("browser")
public void Do_Test_for_IndentWorkList_issueIndent(String Browser) throws InterruptedException {
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_Issue_IssueIndent_SubsituteItemSelectButton().click();
	Thread.sleep(2000);
	driver.switchTo().window(parent2);//close the window subsitute
	Thread.sleep(2000);
	utilobj.selectDropdown(IRWFP.getIndentWorkList_IssueIndent_UnitOfMesurment(), driver, "Nos.=1", Browser);
	IRWFP.getIndentWorkList_Issue_IssueIndent_SaveButton().click();
}
@Test(priority = 15)
@Parameters("browser")
public void Do_Test_ChangeLoccation_For_RecieptAcknowladge(String Browser) throws InterruptedException {
//	Thread.sleep(2000);
//	IRWFP.getIndentWorkList_Issue_IssueIndent_InformationYesButton().click();
	Thread.sleep(2000);
	IRWFP.getIndentTo_SuccessOkButton().click();
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_IssueIndent_CloseButton().click();
	Thread.sleep(2000);
	driver.switchTo().window(parent3);//close the window subsitute
	Thread.sleep(2000);
	IRWFP.getChangeLocation().click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("storefacility"),Browser);
	Thread.sleep(2000);
	IRWFP = hishomepage.doNavigateToIndentWorklistLink();
	Thread.sleep(2000);
	
	
}
@Test(priority = 16)
public void Do_Test_ChangeLoccation_For_RecieptAcknowladge_ReciptAckButton() throws InterruptedException {
	IRWFP.getIndentWorkList_RecieptAcknowladgeRadioButton().click();
	Thread.sleep(2000);
	parent3 = driver.getWindowHandle();
	utilobj.Window(driver);
	IRWFP.getIndentWorkList_RecieptAcknow_viewIssue().click();
	Thread.sleep(2000);
	utilobj.ChildWindow(driver);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_RecieptAcknow_RecieptAckButton().click();
	Thread.sleep(2000);
	
}
@Test(priority = 17)
public void Do_Test_ChangeLoccation_For_RecieptAcknowladge_Recipt_closeButton() throws InterruptedException {
	IRWFP.getIndentTo_SuccessOkButton().click();
	Thread.sleep(2000);
	IRWFP.getIndentWorkList_RecieptAcknow_Closebutton().click();
	Thread.sleep(2000);
	driver.switchTo().window(parent3);	
}

}
/*Indent Raise Workflow Select Location And Facility (Location:-ESIC Test Hospital DL, Facility:-Store Services)>
Got to Store and Select Indent raise Screen>Select indent to, select item and click on save Button>click on View Button and click
on approve button>Click on Change Location and select Female medical Ward in Facility click on Submit Button>go store and 
click on Indent Work List >select indent, click on view Indent and click on approve Button>select  indent ,click on issue 
ident Button>click on Substitute item search Button, select item and click on save Button */
