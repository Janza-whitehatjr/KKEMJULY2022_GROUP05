package com.groupfive.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Industrial {
	WebDriver driver;

	@FindBy(xpath = "//a[@routerlink='/adminpage/industrial']")
	private WebElement know;
	@FindBy(xpath = "//a[@href='/adminpage/industryAdd']")
	private WebElement addknow;
	@FindBy(xpath = "//button[@title= \"Next\"]")
	private WebElement addfile;
	@FindBy(xpath = "//button[text()= \"OK\"]")
	private WebElement ok;

	public Industrial(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickknow() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@routerlink='/adminpage/knowledge']")));
	//wait.until(ExpectedConditions.visibilityOf(know));
		know.click();
		Thread.sleep(1000);
	}

	public void addknow() throws Exception {
		addknow.click();
		Thread.sleep(1000);
	}

	public void addimg() throws Exception {

		WebElement chooseFile = driver.findElement(By.xpath("//input[@formcontrolname='img']"));
		chooseFile.sendKeys("/Users/arjun/git/Main-project-G5/GroupFive/img/ictlogo.png");
		Thread.sleep(1000);

	}

	public void addfile() throws Exception {
		addfile.click();
		Thread.sleep(1000);
	}

	public void clk() throws Exception {

		ok.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}
}
