package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseTest;

public class Working extends baseTest {
	@Test
	public static void nameTest() throws Exception {
		Thread.sleep(4000);	 
	     WebElement usernameTxt = driver.findElement(By.id("APjFqb"));
	     if(usernameTxt.isDisplayed()) {
	        	if(usernameTxt.isEnabled()) {
	        		usernameTxt.sendKeys("Kairos Tech");
	        		String enteredText = usernameTxt.getAttribute("value");
	        		System.out.println(enteredText);
	        		
	        		Thread.sleep(3000);
	        	}
	        	else
	        	    System.err.println("Name textbox is not enabled");
	        }
	        else
	        	System.err.println("Name textbox is not displayed");
		}

}
