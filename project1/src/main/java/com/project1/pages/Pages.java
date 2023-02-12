package com.project1.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project1.base.BaseClass;

public class Pages extends BaseClass {
	
	
	@FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
	private WebElement SearchBox;
	
	@FindBy(xpath = "//input[@value=\"Go\"]")
	private WebElement Go;
	
	//@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	@FindBy(xpath ="//span[@id='productTitle'][contains(text(), ' Samsung Galaxy M04 Light Green, 4GB RAM, 128GB Storage | Upto 8GB RAM with RAM Plus | MediaTek Helio P35 | 5000 ')]")
	private WebElement ItemClick;
	//@FindBy(xpath = "//input[@formaction=\"/cart/add-to-cart/ref=dp_start-bbf_1_glance\"]")
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement Addcart;
	
//	@FindBy(xpath = "//a[@id=\"attach-close_sideSheet-link\"]")
//	private WebElement Close;
//	
//	@FindBy(xpath = "//span[@id=\\\"attach-sidesheet-view-cart-button-announce\\\"]")
//	private WebElement GoCart;
	
//	@FindBy(xpath = "//span[@id=\"attach-sidesheet-view-cart-button-announce\"]")
//	private WebElement ClickCart;
	
	@FindBy(xpath = "//span[@class=\"nav-cart-icon nav-sprite\"]")
	private WebElement Carticon;
//	@FindBy(xpath = "//span[@id='nav-cart-count']")
//	private WebElement viewcart;
//	
	@FindBy(xpath = "//a[@href=\"/gp/cart/view.html?ref_=ewc_gtc\"]")
	private WebElement ClkCart;
	
	
	
	
	
	public Pages(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Search(String SetName) {
		SearchBox.sendKeys(SetName);
	}
	public void Go() {
		Go.click();
	}
	
	public void Item() {
		new Actions(driver).moveToElement(ItemClick).click();
		//ItemClick.click();
	}
	public void Add() {
		new Actions(driver).moveToElement(Addcart).click();
		//Addcart.click();
	}
//	public void Cls() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
//		wait.until(ExpectedConditions.visibilityOf(Close)).click();
//		//Close.click();
//	}
	
//	public void Cart() {
//		GoCart.click();;
//	}
//	public void ClickCart() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
//		wait.until(ExpectedConditions.visibilityOf(ClickCart)).click();;
//		//ClickCart.click();
//		//ClickCart.click();
//	}
	public void Carticon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(Carticon)).click();
		//viewcart.click();
	
	}
//	public void ClkCart_Assert() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
//		wait.until(ExpectedConditions.visibilityOf(ClkCart)).click();
//		assertTrue(driver.findElement(By.xpath("//h1[text()=\"Shopping Cart \"]")).isDisplayed());
//	}

}
