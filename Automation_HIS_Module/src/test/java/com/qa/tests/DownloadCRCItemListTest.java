package com.qa.tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.qa.pages.DownloadCRCItemListpage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;

public class DownloadCRCItemListTest extends BaseTest {
public	DownloadCRCItemListTest() {
	
}
Loginpage loginpage;
HomePage homepage;
SelectHospitalLocationPage selecthospitallocationpage;
HISHomePage hishomepage;
DownloadCRCItemListpage DownloadCRCItemListpageobject;
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

	hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityNameLABORATORYSERVICESTORE"));
}
@Test(priority = 3)
public void donavigateToDownloadCRCItemTest() {

	DownloadCRCItemListpageobject = hishomepage.donavigateToDownloadCRCItemList();
}
@Test(priority = 4)
public void doTestForDownloadCRCItemListTest() throws InterruptedException, AWTException {
	DownloadCRCItemListpageobject.testcaseforDownloadCRCItemListpage();
}


}
