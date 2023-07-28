package com.webshop.smoketests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class AddToCart extends Prerequisites {
  @Test
  public void addtocart() throws InterruptedException {


	  WebElement addtocart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[4]"));
	  
	  
	  Actions actions = new Actions (driver);
	  
	  actions.moveToElement(addtocart).click().build().perform();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//*[@name ='product_attribute_75_5_31']")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("(//*[@value='Add to cart'])[1]")).click();
	  
	  Thread.sleep(5000);
	  
	  try{
		  if(driver.findElement(By.className("content")).isDisplayed()){
			  System.out.println("PASS - Banner message is  displayed");
		  }
		  }
	catch(Exception e) {
		System.out.println("FAIL - Banner message is not displayed");
	}
	  
	 String qty =driver.findElement(By.xpath("//*[@class='cart-qty']")).getText().replace("(", "").replace(")", "").trim();
	  
	 assertEquals(qty, "1", "FAIL - No Items added in CART");
	 
	 
	 
	  
  }


}
