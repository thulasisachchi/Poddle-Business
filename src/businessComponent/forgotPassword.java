package businessComponent;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import util.openBrowser;
@Test(priority = 1)
public class forgotPassword extends openBrowser{ 

	
	
	public void forgotPassword () throws InterruptedException  {
		openBrowser.openBrowser(false);
	    Thread.sleep(2000); 
	driver.findElement(pages.forgotPassword_id_xpath.forgotPasswordOption).click(); 	  			   				
	Thread.sleep(2000);	
	driver.findElement(pages.forgotPassword_id_xpath.forgotEmail).sendKeys("mohoj26809@cashbn.com");
	Thread.sleep(2000);
	driver.findElement(pages.forgotPassword_id_xpath.continueButton).click();
			
	}}

	