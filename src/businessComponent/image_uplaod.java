package businessComponent;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class image_uplaod {
public void uploadImage() {
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
//	driver.findElement(pages.myProfile_id_xpath.my_profile_img_upload_popup_close_icon).click();
	} catch (Exception e) {
		e.printStackTrace();
		}}
//
//public static void main(String[] args) {
//    // Create an instance and call the upload method
//    ImageUpload imageUpload = new ImageUpload();
//    imageUpload.uploadImage();
//}
}