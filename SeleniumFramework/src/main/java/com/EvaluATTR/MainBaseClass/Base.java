package com.EvaluATTR.MainBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) {
		if(browserName.equals("chrome"))
        {
                      WebDriverManager.chromedriver().setup();
                     
                      //System.setProperty("webdriver.chrome.driver","/user/thejesh/chromedriver");
        //System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
       //ss driver = new ChromeDriver();
        if(prop.getProperty("headless").equals("yes")) {
        	ChromeOptions options= new ChromeOptions();
        	options.addArguments("--headless");
        	driver= new ChromeDriver(options);
        	driver.manage().window().maximize();
        }else {
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
        
        }
        
        }
		
        
	return driver;

	}
	
	
	
	public Properties init_properties() {
		prop=new Properties();
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\GANJIJ\\git\\SeleniumFramework\\SeleniumFramework\\src\\main\\java\\com\\EvaluATTR\\Config\\config.properties");
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	}


