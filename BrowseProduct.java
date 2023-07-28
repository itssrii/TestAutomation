package com.webshop.smoketests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BrowseProduct extends Prerequisites {
  @Test
  public void browserproduct() throws InterruptedException {
	  
	  List <WebElement> computers = driver.findElements(By.xpath("//*[contains(text(), 'Computers')]"));
	  
	  Actions actions = new Actions(driver);
	  actions.moveToElement(computers.get(0)).build().perform();
	  
	  List <WebElement> desktops = driver.findElements(By.xpath("//*[contains(text(), 'Desktops')]"));
	  
	
	  actions.moveToElement(desktops.get(0)).click().build().perform();;
	  Thread.sleep(10000);
	  
	  
	  boolean flag = true;
	  
	  try{
		  
		  if(driver.findElement(By.xpath("//*[text()='Simple Computer']")).isDisplayed()) {
			  System.out.println("PASS - Simple Computer is displayed");
		  }
		  
	  }
	  catch(Exception e) {
		  System.out.println("FAIL - Simple Computer is not displayed");
	  }
	  
	
	  if(flag) {
		  try{
			  
			  if(driver.findElement(By.xpath("//*[text()='Simple Computer']")).isDisplayed()) {
				  System.out.println("PASS - Simple Computer is displayed");
				  
				  price=driver.findElement(By.xpath("(//*[@class='price actual-price'])[6]")).getText();
				  
				  if(price.contains("800")) {
					  System.out.println("PASS - The price of simple computer is $800");
				  }
				  else {
					  System.out.println("FAIL - The price of simple computer is not $800");
				  }
				  
			  }
			  
		  }
		  catch(Exception e) {
			  System.out.println("FAIL - Simple Computer is not displayed");
		  }
		  
		  
		  try {
			  if(driver.findElement(By.xpath("(//input[@value='Add to cart'])[4]")).isDisplayed()) {
				  System.out.println("PASS - The Add to cart button is displayed");
			  }
		  }
		  catch(Exception e) {
			  System.out.println("FAIL - Add to Cart is not displayed");
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
  }
}
