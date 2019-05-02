package com.Vision.FreeCrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionIt.FreeCRM.testBase.TestBase;

public class LoginPage extends TestBase{

	// page layer
	
	// Object Repository OR
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement upwd;
	
	@FindBy(xpath="//input[@type='submit'or@value='Login']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//img[@src='https://classic.crmpro.com/img/logo.png']")
	WebElement crmProImg;
	
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpLink;
	
	
	
	public LoginPage(){		
		// used to initialize current class web element
		PageFactory.initElements(driver, this);	
		//PageFactory.initElements(driver, LoginPage.class);
	}
	
	
	public String veryfiyLoginPageTitle(){
		
		return driver.getTitle();
	}
	
	
	public boolean verifyCrmproImgTag(){
		
		return crmProImg.isDisplayed();
	}
	
	
	public HomePage verifyloginToApp(String un, String pass) throws InterruptedException
	{
		
		uname.clear();
		uname.sendKeys(un);
		
		upwd.clear();
		upwd.sendKeys(pass);
		
		Thread.sleep(3000);
		loginBtn.submit();
		//loginBtn.click();
		
		return new HomePage();
		
	}
	
	 
	public SignUpPage verifynavigateToSignUpPage(){
		
		//signUpLink.click();
		
		driver.findElement(By.linkText("Sign Up")).click();
		return new SignUpPage();
		
	}
		
}
