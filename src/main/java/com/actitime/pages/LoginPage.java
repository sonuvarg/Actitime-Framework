package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username") private WebElement username;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(xpath="//div[.='Login ']") private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginOperation(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
		
		
		
	}
	
	
	

}
