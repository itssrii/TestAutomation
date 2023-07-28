package com.webshop.smoketests;

import java.util.ArrayList;

import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.webshop.dbutil.dbutils;

public class Login extends Prerequisites {
  private WebDriver webDriver;

@Test
  public void login() throws InterruptedException {
	  
	  boolean flag = true;
	  
	  // Check if the Log in link is displayed and click on that
	  try {
		 if( driver.findElement(By.xpath("//*[text()='Log in']")).isDisplayed()) {
			 driver.findElement(By.xpath("//*[text()='Log in']")).click();
		 }
	  }
	  catch(Exception e) {
		  flag = false;
		  System.out.println("FAILED - THE LOG IN LINK IS NOT DISPLAYED");
	  }
	  
	  //Login to the application with credentials
	  if(flag) {
		  
		  dbutils db=new dbutils();
		  ArrayList<String> cred=db.getCredentialsFromDatabase();
		  
		  driver.findElement(By.id("Email")).sendKeys(cred.get(0));
		  driver.findElement(By.id("Password")).sendKeys(cred.get(1));
		  driver.findElement(By.xpath("//*[@value ='Log in']")).click();
		 
		  try {
			  if(driver.findElement(By.xpath("//*[text()= 'Log out' ]")).isDisplayed()) {
				  System.out.println("PASS - Login is successful");
			  }
		
	  }
	  catch(Exception e) {
		  System.out.println("FAILED - Login is not successful");
	  }
  
}
}
}

