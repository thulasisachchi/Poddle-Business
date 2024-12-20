package businessComponent;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Test;

import util.openBrowser;
public class signIn extends openBrowser {
	
	 public static WebDriver setupBrowserWithNotificationHandling(boolean allowNotifications) {
	        ChromeOptions options = new ChromeOptions();

	        // Set preferences to handle notifications
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("profile.default_content_setting_values.notifications", allowNotifications ? 1 : 2); // 1: Allow, 2: Block
	        options.setExperimentalOption("prefs", prefs);

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        return driver;
	    }
	
	 @Test(priority = 3)
	    public static void validSignInWithNotificationsAllowed() throws InterruptedException {
	        openBrowser(true); // Allow notifications
	        Thread.sleep(3000);

	        String password = "Sachchi1997#";

	 	   driver.findElement(pages.signIn_id_xpath.text_email).sendKeys("mohoj26809@cashbn.com");
	 	   driver.findElement(pages.signIn_id_xpath.text_password).sendKeys(password);
	 	   driver.findElement(pages.signIn_id_xpath.password_hidden).click();
	 	   driver.findElement(pages.signIn_id_xpath.rememberMeCheck).click();
	 	   driver.findElement(pages.signIn_id_xpath.button_login).click();

	        Thread.sleep(5000);
	        System.out.println("Login completed successfully with notifications allowed.");

	        // Additional actions if required
	        handleBrowserNotification();
	 }
//	        driver.quit();
	 
	 public static void handleBrowserNotification() {
	        try {
	            java.awt.Robot robot = new java.awt.Robot();

	            // Simulate Tab key to focus the popup
	            robot.keyPress(java.awt.event.KeyEvent.VK_TAB);
	            robot.keyRelease(java.awt.event.KeyEvent.VK_TAB);

	            // Simulate Enter key to confirm (Allow/Block based on focus)
	            robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	            robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);

	            System.out.println("Notification popup handled.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

   @Test (priority = 1)
 public static void InvalidSignIn() throws InterruptedException { 
	openBrowser.openBrowser(false);
	Thread.sleep(3000);
	String password= "Sahchi1997";
	driver.findElement(pages.signIn_id_xpath.text_email).sendKeys("mohoj26809@cashbn.com");
	driver.findElement(pages.signIn_id_xpath.text_password).sendKeys(password);
	driver.findElement(pages.signIn_id_xpath.button_login).click();
	
	 Thread.sleep(2000);
	   String toasterTitle=driver.findElement(pages.signIn_id_xpath.toaster).getText();
	   String toasterMessage=driver.findElement(pages.signIn_id_xpath.toasterMessage).getText();
	   System.out.print(toasterMessage);
       String toasterMessage1 = "ncikjdo";
       
       // Assert.   
  driver.close();
 }
   
//	   Assert.assertEquals(toasterTitle, "Not found");
//	   Assert.assertEquals(toasterMessage, "User not found, please check your email is correct and try again.");	   
   @Test (priority = 2)   
   	public static void invaildPasswordSignIn() throws InterruptedException  {
   		openBrowser.openBrowser(false);
   	   Thread.sleep(2000);
   	   driver.findElement(pages.signIn_id_xpath.text_email).sendKeys("thulash");
   	   driver.findElement(pages.signIn_id_xpath.text_password).sendKeys("12345678");
   	   driver.findElement(pages.signIn_id_xpath.button_login).click();
   	   Thread.sleep(2000);
   	   String toasterMessageForInvalid=driver.findElement(pages.signIn_id_xpath.toasterMessageForInvalid).getText();
   	   System.out.print(toasterMessageForInvalid);
   	   Assert.assertEquals(toasterMessageForInvalid, "Incorrect password. Please try again, or tap ‘Forgot password’ to reset.");
   	 // Assert.   
   	  driver.close();
   	    
   } 	   
 

  	@Test (priority = 4)
   	public static void myProfile() throws InterruptedException  {
  	Thread.sleep(2000);	   
    driver.findElement(pages.pendingActionPopupClose_id_xpath.button_pendingActionPopupClose).click(); 	  			   
  	}
   @Test (priority = 5)
    public static void logout() throws InterruptedException {
	   Thread.sleep(3000);	   
	   driver.findElement(pages.logout_id_xpath.button_logout).click();
   }} 
