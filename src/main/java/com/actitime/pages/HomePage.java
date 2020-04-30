package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[.='Tasks']") private WebElement Tasks;
	@FindBy(xpath="//div[.='Reports']") private WebElement Reports;
	@FindBy(xpath="//div[.='Users']") private WebElement Users;
	@FindBy(id="logoutLink") private WebElement Logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnTasks()
	{
		Tasks.click();
	}
	public void clickOnReports()
	{
		Reports.click();
	}
	public void clickOnUsers()
	{
		Users.click();
	}
	public void logout()
	{
		Logout.click();
	}
	
	

}

