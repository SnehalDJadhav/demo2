package com.VisionIt.FreeCrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Vision.FreeCrm.Pages.HomePage;
import com.Vision.FreeCrm.Pages.LoginPage;
import com.visionIt.FreeCRM.testBase.TestBase;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	// test case layer

	@BeforeMethod
	public void setUp() {

		BrrSetUp();

		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void veryfiyLoginPageTitleTest() {

		String actual_loginPage_Title = loginPage.veryfiyLoginPageTitle();

		System.out.println(actual_loginPage_Title);
		
		Assert.assertEquals(actual_loginPage_Title,
				"CRMPRO - CRM software for customer relationship management, sales, and support.",
				"Page Titile doesn't matching ");
	}

	@Test(priority = 2)
	public void verifyCrmproImgTagTest() {

		boolean img_status = loginPage.verifyCrmproImgTag();

		Assert.assertTrue(img_status);
	}

	@Test(priority = 3)
	public void verifyloginToAppTest() {

		//homePage = loginPage.verifyloginToApp(prop.getProperty("uname"), prop.getProperty("upass"));
	}

	@AfterMethod
	public void tearDown() {

		//driver.quit();
	}

}
