package com.groupfive.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.groupfive.pages.LoginPage;
import com.groupfive.utility.XcelUtility;


public class Class extends Base{
	LoginPage objLogin;
	@Test
	public void verifyValidLogin()throws IOException
	{
		objLogin = new LoginPage(driver);
		
		String username=XcelUtility.getCellData(0, 0);
		//String password=XcelUtility.getCellData(0, 1);
		objLogin.clickLogin();
		objLogin.setUserName(username);
//		objLogin.setPassword(password);
		
//		objLogin.dropdown();
}
}
