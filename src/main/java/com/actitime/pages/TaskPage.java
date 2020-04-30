package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(xpath="//div[.='Add New']") private WebElement AddNewbtn;
	@FindBy(xpath="//div[.='+ New Customer']") private WebElement Newcustomer;
	@FindBy(xpath="//div[.='+ New Project']") private WebElement Newproject;
	@FindBy(xpath="//div[.='+ New Tasks']") private WebElement Newtasks;
	@FindBy(xpath="//div[.='Import Tasks from CSV']") private WebElement Importtasks;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void createCustomer()
	{
		AddNewbtn.click();
		Newcustomer.click();
	}
	public void createProject()
	{
		AddNewbtn.click();
		Newproject.click();
	}
	public void createTasks()
	{
		AddNewbtn.click();
		Newtasks.click();
	}
	public void importTasks()
	{
		AddNewbtn.click();
		Importtasks.click();
	}
}
	