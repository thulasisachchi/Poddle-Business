package businessComponent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.openBrowser;

public class businessProfile extends openBrowser{
@Test
public static void validateMandatoryInStep1() throws InterruptedException  {
		businessComponent.signIn.validSignInWithNotificationsAllowed();
				
}

@Test (priority = 2)

public static void myProfile() throws InterruptedException  {
Thread.sleep(2000);	   

driver.findElement(pages.pendingActionPopupClose_id_xpath.button_pendingActionPopupClose).click(); 	  			   
}		  	

@Test (priority = 3)
public static void businessProfile() throws InterruptedException { 

Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.businessProfileTab).click();

//validate business name
Thread.sleep(5000);
String businessNames = driver.findElement(pages.businessProfile_id_xpath.businessNames).getAttribute("value");
Assert.assertEquals(businessNames, "TJD fashion");

//Validate email
Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.emailTextField).sendKeys(Keys.CONTROL + "a");
driver.findElement(pages.businessProfile_id_xpath.emailTextField).sendKeys(Keys.BACK_SPACE);
Thread.sleep(2000);    
driver.findElement(pages.businessProfile_id_xpath.buttonSave).click();

//email error message validation
Thread.sleep(3000);
String thisFieldIsMandatoryEmail = driver.findElement(pages.businessProfile_id_xpath.thisFieldIsMandatoryEmail).getText();
Assert.assertEquals(thisFieldIsMandatoryEmail,"This field is mandatory");
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.emailTextField).sendKeys("thula467@gmail.com");
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.contactNumber).sendKeys(Keys.CONTROL + "a");
driver.findElement(pages.businessProfile_id_xpath.contactNumber).sendKeys(Keys.BACK_SPACE);
Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.contactNODropDown).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.searchCountryCode).sendKeys("Sri Lanka");
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.selectCountrySrilanka).click();
Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.contactNumber).sendKeys("779789181");
Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.editAddressButton).click();
Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.addressMapInput).clear();
Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.addressMapInput).sendKeys("44 Christchurch Rd, Ringwood BH24 1DW, UK");
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.enterAddressManuallyArrow).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.useAddressLookupArrow).click();
//driver.findElement(pages.businessProfile.editAddressPageCloseOption).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.confirmLocationButton).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.saveAddressButton).click();
Thread.sleep(2000);
driver.findElement(pages.businessProfile_id_xpath.webSite).sendKeys("https://www.google.com/");
Thread.sleep(1000);
driver.findElement(pages.businessProfile_id_xpath.facebook).sendKeys("https://web.facebook.com/");
Thread.sleep(1000);
driver.findElement(pages.businessProfile_id_xpath.instagram).sendKeys("https://www.instagram.com/");


//Business categories and sub-categories
//
//Thread.sleep(3000);
//driver.findElement(pages.businessProfile.category_remove).click();
//Thread.sleep(3000);
//driver.findElement(pages.businessProfile.category_remove).click();
//Thread.sleep(3000);
//driver.findElement(pages.businessProfile.businessCategoriesDropDown).click();
//Thread.sleep(4000);
//driver.findElement(pages.businessProfile.select_category1).click();
////Thread.sleep(4000);
////driver.findElement(pages.businessProfile.select_category3).click();
////Thread.sleep(4000);
////driver.findElement(pages.businessProfile.select_category4).click();
////Thread.sleep(4000);
////driver.findElement(pages.businessProfile.select_category5).click();
//Thread.sleep(4000);
//s.findElement(pages.businessProfile.selectsub_category1).click();
//Thread.sleep(4000);
//driver.findElement(pages.businessProfile.selectsub_category2).click();
//Thread.sleep(4000);
//driver.findElement(pages.businessProfile.businessCategoriesDropDown).click();
//Thread.sleep(4000);
//driver.findElement(pages.businessProfile.keyword_remove).click();
//Thread.sleep(3000);
//driver.findElement(pages.businessProfile.keyword_remove).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.save).click();
//Thread.sleep(4000);
//driver.findElement(pages.businessProfile.select_sub_category11).click();
//Thread.sleep(4000);
//driver.findElement(pages.businessProfile.select_sub_category12).click();

	for (int down = 0; down < 10; down++) {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(500);
    }
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.back_button).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.save).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.add_new_image).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.delete_image).click();
Thread.sleep(3000);
driver.findElement(pages.businessProfile_id_xpath.next_button).click();
}}

////driver.findElement(pages.businessProfile.category_remove).click();
//Thread.sleep(4000);

//
//String textfieldMandatoryProvince=driver.findElement(pages.createBusinessPage.txt_labelMandatoryProvince).getText();
//Assert.assertEquals(textfieldMandatoryProvince, "This field is mandatory");
//String thisFieldIsMandatoryEmail=driver.findElement(pages.businessProfile.thisFieldIsMandatoryEmail).getText();
//Assert.assertEquals(thisFieldIsMandatoryEmail,"This field is mandatory");
//}}


//String textfieldMandatoryProvince=driver.findElement(pages.createBusinessPage.txt_labelMandatoryProvince).getText();
//Assert.assertEquals(textfieldMandatoryProvince, "This field is mandatory");
//


		

	
