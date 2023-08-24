package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseTest;

public class Search extends baseTest{
	@Test
	public static void testButton() throws Exception
	{
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
	    Thread.sleep(3000);
	}

}
