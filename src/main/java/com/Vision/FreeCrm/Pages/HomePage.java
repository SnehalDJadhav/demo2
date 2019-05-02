package com.Vision.FreeCrm.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visionIt.FreeCRM.testBase.TestBase;

public class HomePage extends TestBase{

	//OR
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[text()='Companies']")
	WebElement companiesLink;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage navigatingToContactsPage()
	{
		 driver.switchTo().frame("mainpanel");
		 contactsLink.click();
		 
		 driver.switchTo().defaultContent();
		return new ContactsPage();
	}
	
	public DealsPage navigatingToDealsPage()
	{
		driver.switchTo().frame("mainpanel");
		dealsLink.click();
		
		driver.switchTo().defaultContent();
		return new DealsPage();
	}
	

	public TasksPage navigatingToTasksPage()
	{
		driver.switchTo().frame("mainpanel");
		tasksLink.click();
		
		driver.switchTo().defaultContent();
		return new TasksPage();
	}
	
	/*public NewContact navigateToNewContactPage(){
		
	}*/
	
	
	
}
