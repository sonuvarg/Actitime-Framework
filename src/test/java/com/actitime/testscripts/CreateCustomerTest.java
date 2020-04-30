package com.actitime.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.commonutils.WebDriverUtils;
import com.actitime.configuration.CommonSetup;
import com.actitime.pages.CreateCustomerPage;
import com.actitime.pages.HomePage;
import com.actitime.pages.TaskPage;

public class CreateCustomerTest extends CommonSetup {
	WebDriverUtils ut=new WebDriverUtils();
	@Test
	public void createCustomerWithName() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
		String custname=ut.readtestdata("./src/test/resources/Testcasedata/Actitime.xlsx","Sheet1", 1, 0);
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.clickOnTasks();
		TaskPage tp=new TaskPage(driver);
		Thread.sleep(3000);
		tp.createCustomer();
		CreateCustomerPage cp=new CreateCustomerPage(driver);
		Thread.sleep(3000);
		cp.createNewCustomer(custname);
		Thread.sleep(3000);
		
		}
	@Test
	public void createCustomerWithNameAndDescription() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException
	{
		String custname=ut.readtestdata("./src/test/resources/Testcasedata/Actitime.xlsx", "Sheet1", 2, 0);
		String desc=ut.readtestdata("./src/test/resources/Testcasedata/Actitime.xlsx", "Sheet1", 2, 1);
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.clickOnTasks();
		TaskPage tp=new TaskPage(driver);
		Thread.sleep(3000);
		tp.createCustomer();
		CreateCustomerPage cp=new CreateCustomerPage(driver);
		Thread.sleep(3000);
		cp.createNewCustomer(custname, desc);
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	
	

}
