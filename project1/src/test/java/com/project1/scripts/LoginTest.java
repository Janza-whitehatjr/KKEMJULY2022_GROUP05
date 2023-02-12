package com.project1.scripts;


import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.project1.base.BaseClass;
import com.project1.pages.Pages;
import com.project1.utility.ExcelUtility;

public class LoginTest extends BaseClass {

	@Test
	public void VerifyLogin() throws Exception {
		Pages Pg;
		Pg = new Pages(driver);

		Pg.Search("Mobile phone");
		Pg.Go();
		Pg.Item();
		Pg.Add();
		//Pg.Cls();
		Pg.Carticon();
		//Pg.ClkCart_Assert();
		//assertTrue(driver.findElement(By.xpath("//h1[text()=\"Shopping Cart \"]")).isDisplayed());
		//assertTrue(driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//span[@id='nav-cart-count']")).isDisplayed());
		

	}	
//	@AfterMethod
//	public void closetab() {
//		driver.close();
//	}
}
