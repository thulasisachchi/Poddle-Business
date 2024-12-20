package businessComponent;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import util.openBrowser;

public class my_profile extends openBrowser {

	@Test(priority = 1)
	public static void validateMandatoryInStep1() throws InterruptedException {
		businessComponent.signIn.validSignInWithNotificationsAllowed();
	}

	@Test(priority = 2)

	public static void myProfile() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(pages.pendingActionPopupClose_id_xpath.button_pendingActionPopupClose).click();
	}

@Test (priority = 3)

public static void myProfiletab() throws InterruptedException {
Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.my_profile_tab).click();
Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.user_upload_image).click(); 
Thread.sleep(3000);
try
{
// Use Robot class to handle file dialog
Robot robot = new Robot();

// Copy the file path to the clipboard
String filePath = "C:\\Users\\thula\\OneDrive\\Desktop\\1.jpg"; 
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
driver.findElement(pages.myProfile_id_xpath.my_profile_img_upload_popup_close_icon).click();
} catch (Exception e) {
	e.printStackTrace();
	}}


@Test (priority = 4)
public static void myProfileImageUpload() throws InterruptedException {
Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.user_upload_image).click(); 

Thread.sleep(3000);

try
{
// Use Robot class to handle file dialog
Robot robot = new Robot();

// Copy the file path to the clipboard
String filePath = "C:\\Users\\thula\\OneDrive\\Desktop\\coco.jpeg"; 
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

Thread.sleep(1000);
driver.findElement(pages.myProfile_id_xpath.img_upload_button).click();
} catch (Exception e) {
	e.printStackTrace();
	}

try
{
// Use Robot class to handle file dialog
Robot robot = new Robot();

// Copy the file path to the clipboard
String filePath = "C:\\Users\\thula\\OneDrive\\Desktop\\1.jpg"; 
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
driver.findElement(pages.myProfile_id_xpath.img_confirm_button).click();
} catch (Exception e) {
	e.printStackTrace();
	}
}

@Test (priority = 5)
public static void myProfiletabfinal() throws InterruptedException {

Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.copy_mail_id).click();

Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.user_upload_image).click(); 
Thread.sleep(3000);
try
{
//Use Robot class to handle file dialog
Robot robot = new Robot();

//Copy the file path to the clipboard
String filePath = "C:\\Users\\thula\\OneDrive\\Desktop\\aa.jpg"; 
StringSelection selection = new StringSelection(filePath);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

//Simulate Ctrl+V to paste the file path
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);

//Simulate pressing Enter to confirm
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.img_crop_button).click();
Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.image_ratio_16).click();
Thread.sleep(3000);
driver.findElement(pages.myProfile_id_xpath.image_ratio_any).click();
Thread.sleep(5000);

    try {
    	WebElement rotate_button =  driver.findElement(pages.myProfile_id_xpath.rotate_button);
    	
    	for (int i = 0; i < 4; i++) {
    		rotate_button.click(); 
		}}
     catch (Exception e) {
        e.printStackTrace();
     }       

Thread.sleep(1500);
driver.findElement(pages.myProfile_id_xpath.image_crop_save_button).click();
Thread.sleep(1500);
driver.findElement(pages.myProfile_id_xpath.img_confirm_button).click();
} catch (Exception e) {
e.printStackTrace();
}

for (int down = 0; down < 10; down++) {
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(500);
}

//Your Unique Code!
//@Test(priority = 6)
//	public static void Download_generic_handout() throws InterruptedException {
//		for (int down = 0; down < 10; down++) {
//			Actions actions = new Actions(driver);
//			actions.sendKeys(Keys.ARROW_DOWN).perform();
//			Thread.sleep(500);
//		}
//		Thread.sleep(3000);
		driver.findElement(pages.myProfile_id_xpath.download_and_print).click();
		Thread.sleep(3000);
		driver.findElement(pages.myProfile_id_xpath.download_and_print_close_icon).click();
//Thread.sleep(3000);
//driver.findElement(pages.myProfile_id_xpath.download_custom_handout).click();
////Thread.sleep(3000);
//driver.findElement(pages.myProfile_id_xpath.download_code_download_button).click();
//Thread.sleep(2000);
//driver.findElement(pages.myProfile_id_xpath.download_code_create_custom_handout_close_icon).click();
//Thread.sleep(2000);

//Shout about it on social media

		Thread.sleep(2000);
		driver.findElement(pages.myProfile_id_xpath.facebook_share).click();
		Thread.sleep(500);

		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//		int tabSize = tabs.size();
		driver.switchTo().window(tabs.get(0));

		Thread.sleep(500);
		driver.findElement(pages.myProfile_id_xpath.twitter_share).click();
		Thread.sleep(1000);
		List<String> tab_size1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(500);
		driver.findElement(pages.myProfile_id_xpath.linkedin_share).click();
		Thread.sleep(1000);
		List<String> taabs = new ArrayList<>(driver.getWindowHandles());
		int taabSize = tabs.size();
		System.out.println("Tabs count :" + tabSize);
//		driver.switchTo().window(tabs.get(tabs.size() - 1));
		driver.switchTo().window(tabs.get(0));
	
//		driver.findElement(pages.myProfile_id_xpath.mail_share).click();
//		Thread.sleep(1000);
//		List<String> tabbs = new ArrayList<>(driver.getWindowHandles());
//		int tabbSize = tabs.size();
//		System.out.println("Tabs count :" + tabSize);
//		driver.switchTo().window(tabs.get(tabs.size() - 1));
//		driver.close();

	
	
		//Thread.sleep(3000);
		//driver.findElement(pages.myProfile_id_xpath.send_people_a_link_copy).click();
		//driver.close();

	}
}

