import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	public static void main(String[] args) {
	 
		 FirefoxDriver driver = new FirefoxDriver();
	 
	        //Launch the Online Store Website
	 driver.get("http://www.store.demoqa.com");
	 
	        // Print a Log In message to the screen
	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
	 
	 //Wait for 5 Sec
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	        // Close the driver
	        driver.quit();
	    }}
