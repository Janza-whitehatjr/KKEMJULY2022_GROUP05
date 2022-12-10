package com.groupfive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver; 

	@FindBy(css="a[class='btn btn-sm bg-gradient-info mb-0 me-1 mt-2 mt-md-0']")
	private WebElement loginButton;
	
	@FindBy(className=("form-control ng-untouched ng-pristine ng-invalid"))
	private WebElement userName;
	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void setUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}
//	public void setPassword(String strPassword) {
//		password.sendKeys(strPassword);
//	}
//	public void clickLogin() { //*[@id="navigation"]/ul/li[7]/a
//		login.click();
//	}
//	public void dropdown() {
//		drop.click();
//	}
	
}
