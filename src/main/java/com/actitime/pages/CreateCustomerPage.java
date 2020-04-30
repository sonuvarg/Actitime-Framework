package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerPage {
	@FindBy(xpath="//span[.='ASSIGNED USERS (3)']") private WebElement assignedusers;
	@FindBy(xpath="//span[.='MANAGERS (3)']")  private WebElement  managers;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") private WebElement customername;
	@FindBy(xpath="//div[.='Create Customer']") private WebElement createCustomerbtn;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") private WebElement desc;
	
	public CreateCustomerPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createNewCustomer(String custname)
	{
		customername.sendKeys(custname);
		createCustomerbtn.click();
			
	}
	public void createNewCustomer(String custname, String description)
	{
		customername.sendKeys(custname);
		desc.sendKeys(description);
		createCustomerbtn.click();
			
	}
	

}
