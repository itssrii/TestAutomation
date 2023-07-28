package com.webshop.smoketests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class checkout extends Prerequisites {


@Test
  public void checkout1() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@class='cart-qty']")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("termsofservice")).click();
	  
	  driver.findElement(By.xpath("//*[@id='checkout']")).click();
	  
	  driver.findElement(By.xpath("(//*[@value='Continue'])[1]")).click();
	  
	  Thread.sleep(4000);
	  
	  driver.findElement(By.id("PickUpInStore")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("(//*[@value='Continue'])[2]")).click();
	  
	  Thread.sleep(2000);
	  
	driver.findElement(By.xpath("(//*[@value='Continue'])[4]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//*[@value='Continue'])[5]")).click();
	
	Thread.sleep(2000);
	
	
	String tot =driver.findElement(By.className("product-subtotal")).getText();

	assertEquals(tot, price, "FAIL - Total price is not matching");
	
	driver.findElement(By.xpath("//*[@class='button-1 confirm-order-next-step-button']")).click();  
	
	Thread.sleep(4000);
	
	String final_msg =driver.findElement(By.xpath("//*[@class = 'title']")).getText();
	
	assertEquals(final_msg, "Your order has been successfully processed!", "FAIL - Final message is not displayed");
	
	  
  }
}
