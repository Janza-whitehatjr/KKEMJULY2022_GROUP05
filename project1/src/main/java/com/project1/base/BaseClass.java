package com.project1.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop = null;
	String Safari_driverPath = "/usr/bin/safaridriver";

	public static void TestBase() {

		try {
			prop = new Properties();
			//FileInputStream ip = new FileInputStream(
					//"/Users/arjun/Software Testing/Project1/src/test/resources/brower.properties");
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources"+"/brower.properties");
					
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@BeforeTest

	public void onSetup() throws Exception {

		TestBase();
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Launching chrome browser.");
		} else if (browserName.equals("firefox")) {

			// WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Launching firefox browser.");
		} else if (browserName.equals("safari")) {

			System.setProperty("webdriver.safari.driver", Safari_driverPath);
			driver = new SafariDriver();
			System.out.println("Launching safari browser.");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
		driver.manage().window().fullscreen();

	}

}
