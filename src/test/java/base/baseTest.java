package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	
	   public static WebDriver driver;
	   public static Properties prop = new Properties();
	   public static FileReader fr;
	    @BeforeTest
       public void setUp() throws IOException {
    	   if(driver==null) {
    		  
    		   FileReader fr = new FileReader("C:\\Users\\revan\\eclipse-workspace\\TestGoogle\\src\\test\\resources\\config.properties");
    		   prop.load(fr);
    	   }
    	   if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
    			WebDriverManager.chromedriver().setup();  //base
    			driver = new ChromeDriver(); 
    			driver.get(prop.getProperty("testUrl"));
    	   }
       }
	    @AfterTest
	       public void tearDown() {
	    	   driver.close();
	    	
	       }
}
