package businessComponent;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.openBrowser;

@Test (priority = 1)

public class createUser extends openBrowser{
	
	
public static void validateMandatoryInStep1() throws InterruptedException  {
		businessComponent.signIn.validSignInWithNotificationsAllowed();
					
}				
@Test (priority = 2)
    
public static void myProfile() throws InterruptedException  {
Thread.sleep(2000);	   
     
driver.findElement(pages.pendingActionPopupClose_id_xpath.button_pendingActionPopupClose).click(); 	  			   
	}		  	
	
@Test (priority = 3)
public static void createUserCancel() throws InterruptedException {
	
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.tab_users).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.button_createNew).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.createUserPopUp_close).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.button_createNew).click();	

for (int down = 0; down < 50; down++) {
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.ARROW_DOWN).perform();
 
Thread.sleep(5000);
driver.findElement(pages.createUser_id_xpath.button_cancel).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.button_createNew).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.button_imageUploadButton).click(); 
Thread.sleep(3000);
try
{
// Use Robot class to handle file dialog
Robot robot = new Robot();

// Copy the file path to the clipboard
String filePath = "C:\\Users\\thula\\OneDrive\\Desktop\\aa.jpg"; 
StringSelection selection = new StringSelection(filePath);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

// Simulate Ctrl+V to paste the file path
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);

// Simulate pressing Enter to confirm
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.img_button_confirm).click();
} catch (Exception e) {
e.printStackTrace();
}
Thread.sleep(2000);
driver.findElement(pages.createUser_id_xpath.button_dropdownSelectRole).click();
Thread.sleep(2000);
driver.findElement(pages.createUser_id_xpath.select_standarduser).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.button_dropdownSelectRole).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.select_superuser).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.text_firstName).sendKeys("thulash");
Thread.sleep(2000);
driver.findElement(pages.createUser_id_xpath.text_lastName).sendKeys("lash");
Thread.sleep(2000);
driver.findElement(pages.createUser_id_xpath.text_email).sendKeys("laxthulash@gmail.com");
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.button_createuser).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.button_done).click();
}}

//Edit user 

@Test (priority = 4)

public static void EditUser() throws InterruptedException {
	

Thread.sleep(3000);	
driver.findElement(pages.createUser_id_xpath.user_edit_option).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.createUserPopUp_close).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.booster_check).click();
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.search_user).sendKeys("Thulasiga");
Thread.sleep(3000);
driver.findElement(pages.createUser_id_xpath.user_edit_option).click();

for (int down = 0; down < 50; down++) {
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(5000);

driver.findElement(pages.createUser_id_xpath.makeThisUserActive).click();
//Thread.sleep(4000); 
//driver.findElement(pages.createUser_id_xpath.checkboxTickBooster).click();
Thread.sleep(4000);
driver.findElement(pages.createUser_id_xpath.save_changes).click();



}}}

