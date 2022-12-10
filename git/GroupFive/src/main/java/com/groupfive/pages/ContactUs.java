package com.groupfive.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"dropdownMenuPages\"][contains(text(), 'Contact Us')]")
	private WebElement contactUs;

	@FindBy(xpath = "//input[@placeholder ='Full Name']")
	private WebElement username;

	@FindBy(xpath = "//input[@placeholder ='Email id']")
	private WebElement email;

	@FindBy(xpath = "//input[@placeholder ='What you love']")
	private WebElement subject;

	@FindBy(xpath = "//*[@id=\"message\"]")
	private WebElement message;

	@FindBy(xpath = "//button[contains(text(),'Send Message')]")
	private WebElement SendMessagebtn;

	public ContactUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickLoginbtn() {
		contactUs.click();
	}

	public void setUsername(String setUsername) throws InterruptedException {

		username.sendKeys(setUsername);
		Thread.sleep(2000);

	}

	public void setEmail(String setEmail) throws InterruptedException {
		email.sendKeys(setEmail);
		Thread.sleep(2000);

	}

	public void setSubject(String setSubject) throws InterruptedException {
		subject.sendKeys(setSubject);
		Thread.sleep(2000);

	}

	public void setMessage(String setMessage) throws InterruptedException {
		message.sendKeys(setMessage);
		Thread.sleep(2000);

	}

	public String clickSendMessagebtn() throws InterruptedException {
		Thread.sleep(500);
		SendMessagebtn.submit();
		Alert alert = driver.switchTo().alert();
		String actual = alert.getText();
		alert.accept();
		return actual;

	}

}