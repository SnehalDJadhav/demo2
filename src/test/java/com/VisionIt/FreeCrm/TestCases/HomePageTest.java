package com.VisionIt.FreeCrm.TestCases;

import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Vision.FreeCrm.Pages.HomePage;
import com.Vision.FreeCrm.Pages.LoginPage;
import com.visionIt.FreeCRM.testBase.TestBase;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup(){
		BrrSetUp();
		loginPage=new LoginPage();
		//homePage=loginPage.verifyloginToApp(prop.getProperty("uname"), prop.getProperty("upass"));
		//homePage = loginPage.verifyloginToApp(prop.getProperty("uname"), prop.getProperty("upass"));
	}
	
	@Test
	public void VerifyHomePageTitleTest(){
		Assert.assertEquals(homePage.VerifyHomePageTitle(), "CRMPRO");
	}
	
	@Test
	public void navigatingToDealsPageTest(){
		homePage.navigatingToDealsPage();
	}
	
	@Test
	public void navigatingToTasksPageTest(){
		homePage.navigatingToTasksPage();
	}
	
	@Test
	public void navigatingToContactsPageTest(){
		homePage.navigatingToContactsPage();
	}


}
