package businessComponent;

import org.testng.annotations.Test;

import util.openBrowser;

public class logout extends openBrowser {
	@Test
	public static void logout() throws InterruptedException  {
		
		businessComponent.signIn.vaildSignIn();
		Thread.sleep(4000);
		driver.findElement(pages.logout_id_xpath. button_userdrop).click();
		driver.findElement(pages.logout_id_xpath.button_logout).click();
	}

}

	


