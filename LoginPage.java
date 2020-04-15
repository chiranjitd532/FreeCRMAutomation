package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	// Object Repositories
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")
	WebElement Login;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatepageTitle() {
		return driver.getTitle();
	}

}
