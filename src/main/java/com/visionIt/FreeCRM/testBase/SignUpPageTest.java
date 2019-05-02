package com.visionIt.FreeCRM.testBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Vision.FreeCrm.Pages.LoginPage;
import com.Vision.FreeCrm.Pages.SignUpPage;

import junit.framework.Assert;

public class SignUpPageTest extends TestBase{

	SignUpPage signUpPage;
	LoginPage loginpage;

	@BeforeMethod
	public void setUp(){
		
		BrrSetUp();
		loginpage = new LoginPage();
		signUpPage= loginpage.verifynavigateToSignUpPage();
	}
		
	
	@Test(priority=2)
	public void verifyCrmproImgTagTest(){
		
		Assert.assertTrue(signUpPage.verifyCrmproImgTag());
	}
	
	@Test(priority=2)
	public void verifySignUpAccountIsCreatedTest(){
		
		signUpPage.verifySignUpAccountIsCreated("Snehal", "Jadhav", "Snehal@gmail.com", "Snehal@gmail.com",
				"Snehal", "Snehal@123", "Snehal@123");
	}
	
	@AfterMethod
	public void tesrDown(){
	
		driver.quit();
	}
	
	
	
}
