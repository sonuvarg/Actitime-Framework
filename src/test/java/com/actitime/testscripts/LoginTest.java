package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.actitime.commonutils.WebDriverUtils;
import com.actitime.configuration.CommonSetup;
import com.actitime.pages.LoginPage;

public class LoginTest extends CommonSetup {
	@Test
	public void loginTest() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		WebDriverUtils utils=new WebDriverUtils();
		String user=utils.getDataFromProperties("username");
		String pass=utils.getDataFromProperties("password");
		lp.loginOperation(user, pass);
		
		
		
		
	}
	

}
