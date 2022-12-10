package com.groupfive.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	WebDriver driver;
	public static Properties prop=null;
	
	String Firefox_driverPath= "/Users/arjun/MainProject/Drivers/geckodriver";
	String Chrome_driverPath= "/Users/arjun/MainProject/Drivers/chromedriver";
	String Safari_driverPath= "/usr/bin/safaridriver";


	public static void TestBase() {
		
		try {
        	prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/arjun/MainProject/src/test/resources/config.properties");
          
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		  
    }
	@BeforeTest

        
	public void onSetup() {
		
		TestBase();
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",Chrome_driverPath);
			driver = new ChromeDriver();
			System.out.println("Launching chrome browser.");
		}
			else if(browserName.equals("firefox")) {
	
				System.setProperty("webdriver.gecko.driver",Firefox_driverPath);
				driver = new FirefoxDriver();
				System.out.println("Launching firefox browser.");
			}
					else if(browserName.equals("safari")) {
						
						System.setProperty("webdriver.safari.driver",Safari_driverPath);
						driver = new SafariDriver();
						System.out.println("Launching safari browser.");
					}
		
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize(); 
		
	}
}
