package com.webshop.smoketests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Prerequisites {
	
	
public static WebDriver driver;	
public static String price=null;

  @BeforeSuite
  public void beforeSuite() {
	  
	//Driver exe config
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	driver= new ChromeDriver();
	
	driver.get("http://demowebshop.tricentis.com/");
	
	
	String pageTitle =driver.getTitle();
	
	System.out.println("This is the title of the page - "+pageTitle);
	
	assertEquals("Demo Web Shop", pageTitle, "Failed - incorrect web page loaded");
	
	driver.manage().window().maximize();
	
  }

  
  @AfterSuite
 public void afterSuite() {
	  
	  driver.findElement(By.xpath("//*[text()= 'Log out' ]")).click();
	  driver.close();
	  driver.quit();
	  
	  
  }

}
