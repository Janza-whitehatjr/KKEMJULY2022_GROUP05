package com.rediff.testng;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Redifftest {
WebDriver driver;
 String driverpath=System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe";
@BeforeClass
public void Baseclass() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", driverpath);
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
		
	}
  @Test
  public void registration() throws InterruptedException {
	  WebElement name=driver.findElement(By.cssSelector("input[type='text'][name^=nam]"));
	  name.sendKeys("sonia");
	  WebElement mailcheck=driver.findElement(By.cssSelector("input[type='text'][onfocus^=java]"));
	  mailcheck.sendKeys("sonia");
	 // WebElement checkavail=driver.findElement(By.xpath("//input[@type='button'and@class='btn_checkavail']"));
	 // checkavail.click();
	  WebElement password=driver.findElement(By.id("newpasswd"));
	  password.sendKeys("aaaaaa");
	  WebElement rpassword=driver.findElement(By.id("newpasswd1"));
	  rpassword.sendKeys("aaaaaa");
	  WebElement altemail=driver.findElement(By.cssSelector("input[type='text'][name^=alt]"));
	  altemail.sendKeys("sonia@yahoo.com");
	  WebElement checkclick=driver.findElement(By.xpath("//input[@type=\"checkbox\"and@class=\"nomargin\"]"));
	  checkclick.click();
	  //to locate an element dropdownlist which have no select tag only have div tag in which ul and li tag
	   WebElement mobcd =driver.findElement(By.cssSelector("div[onclick='javascript: openDiv(event);']"));//locate webelement countrycode dropdwonlist in div tag
	   mobcd.click();	//click on div tag 
	 List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id=\"country_id\"]/ul/li"));//store all elements in list to allOption list of type webelement
	 System.out.println(allOptions.size());//print the size of allOptions type list
     System.out.println(allOptions.get(0).getText()) ;//print the first element in list
    for(int i = 0; i<=allOptions.size()-1; i++) { 
        if(allOptions.get(i).getText().contains("Angola")) {//search for the specified country angola 
            allOptions.get(i).click();//click on angola and select it
            break;//break from the loop
            }
    }

//List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"country_id\"]/ul/li[2]"));//to locate  2nd element in list;ie locate specific one element
	   // allOptions.get(0).click();
    
	  WebElement mobileno=driver.findElement((By.id("mobno")));
	  mobileno.sendKeys("999999999");
	  WebElement Dobd=driver.findElement(By.cssSelector("select[onchange='fieldTrack(this);'][name^=DOB_D]"));
	  Select sel=new Select(Dobd);
	  //sel.selectByIndex(1);
	  // Thread.sleep(2000);
	  sel.selectByValue("30");
	 // Thread.sleep(2000);
	   //sel.selectByVisibleText("31");  
	  WebElement dobm=driver.findElement(By.xpath("//select[@onchange='fieldTrack(this);' and starts-with(@name,'DOB_Mo')]"));
	  Select sel1=new Select(dobm);
	  sel1.selectByIndex(5);
	// sel1.deselectByIndex(5);
	//select[contains(@name,'DOB_Ye') and @onchange='fieldTrack(this);']//locating with xpath and contains()
	  Select sely=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Ye') ]")));
	  //sely.selectByVisibleText("2006");
	  sely.selectByValue("2006");
	  WebElement gender=driver.findElement(By.cssSelector("input[name^=gender][value='f']"));
	 gender.click();
	  WebElement country=driver.findElement(By.id("country"));
	  Select selco=new Select(country);
	  selco.selectByIndex(10);
	  WebElement sbutton=driver.findElement(By.className("submitbtn"));
	  sbutton.click();
	   Thread.sleep(5000);
	   
  }
	   @AfterClass
	   public void teardown() {
		  driver.quit(); 
	   }
	   
  } 

