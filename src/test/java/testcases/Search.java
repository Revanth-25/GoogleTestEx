package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseTest;

public class Search extends baseTest{
	@Test
	public static void testButton() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[6]/center/input[1]")).click();
		
	    Thread.sleep(3000);
	}

}
