package com.Vision.FreeCrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.visionIt.FreeCRM.testBase.TestBase;

public class SignUpPage extends TestBase {

	// Object Repository

	@FindBy(name = "first_name")
	WebElement firstName;

	@FindBy(name = "surname")
	WebElement lastName;

	@FindBy(name = "email")
	WebElement email_;

	@FindBy(name = "email_confirm")
	WebElement confirmEmail;

	@FindBy(name = "username")
	WebElement user_name;

	@FindBy(name = "password")
	WebElement user_pwd;

	@FindBy(name = "passwordconfirm")
	WebElement confirm_password;

	@FindBy(name = "agreeTerms")
	WebElement checkboxBtn;

	@FindBy(xpath = "//img[@src='https://classic.crmpro.com/img/logo.png']")
	WebElement crmProImg;

	@FindBy(xpath = "//div[@class='myButton']")
	WebElement submitBtn;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyCrmproImgTag() {

		return crmProImg.isDisplayed();
	}

	public void verifySignUpAccountIsCreated(String fname, String lname, String email_id, String confemail_id,
			String uname, String upass, String confpass) {

		Select sel = new Select(driver.findElement(By.id("payment_plan_id")));

		sel.selectByVisibleText("Edition");

		firstName.clear();
		firstName.sendKeys(fname);

		lastName.clear();
		lastName.sendKeys(lname);

		email_.clear();
		email_.sendKeys(email_id);

		confirmEmail.clear();

		confirmEmail.sendKeys(confemail_id);

		user_name.clear();

		user_name.sendKeys(uname);

		user_pwd.clear();

		user_pwd.sendKeys(upass);

		confirm_password.clear();
		confirm_password.sendKeys(confpass);

		checkboxBtn.click();

		// submitBtn.click();
	}
}
