package pages;

import org.openqa.selenium.By;

public class businessProfile_id_xpath {
	public static By businessNames=By.xpath("//input[@formcontrolname=\"name\"]"); 
	public static By businessProfileTab=By.id("business-profile");
	public static By emailTextField=By.xpath("//input[@formcontrolname=\"email\"]");
    public static By contactNumber=By.xpath("//input[@formcontrolname='contactNumber']");
    public static By contactNODropDown=By.xpath("//ng-select[@placeholder=\"Select city\"]");
    public static By selectCountrySrilanka=By.xpath("//span[text()=\"Sri Lanka\"]");
    public static By searchCountryCode=By.xpath("//input[@placeholder=\"Search\"]");
    public static By selectedCountryCode=By.id("a0f118f94c6f-205");
    public static By thisFieldIsManadatoryContactNo=By.xpath("//span[@class=\"text-danger font-weight-bold text-xxs ng-star-inserted\"]");
    public static By thisFieldIsMandatoryEmail=By.xpath("//span[@class=\"text-danger font-weight-bold text-xxs\"]\r\n"
    		+ "");
    
//    Edit address
    
    public static By editAddressButton=By.id("basic-address");
    public static By closeAddressPopup=By.id("close-address-view");
    public static By mapZoomIn=By.xpath("//button[@title=\"Rotate map clockwise\"]\r\n"+ "");
    public static By mapZoomOut=By.xpath("//button[@title=\"Zoom out\"]");
    public static By addressMapInput=By.id("address-map-input");
    public static By enterAddressManuallyArrow=By.xpath("//span[@class=\"mr-2\"]");
    public static By useAddressLookupArrow=By.xpath("//span[text()=\"Use address lookup\"]");
    public static By confirmLocationButton=By.xpath("//button[@class=\"btn p-button px-5\"]");
    public static By saveAddressButton=By.xpath("//button[@class=\"btn p-button px-5 p-padding\"]");
    public static By editAddressPageCloseOption=By.id("close-address-view");
    public static By titleOrBuildingName=By.xpath("//input[@formcontrolname=\"name\"]");
    public static By doorNumber=By.xpath("//input[@formcontrolname=\"number\"]");
    public static By invalidMailAddress=By.xpath("//span[@class=\"text-danger font-weight-bold text-xxs\"]");
    public static By buttonSave=By.xpath("//button[@class=\"btn p-button width-226 px-5 d-none d-sm-block\"]");
    
//    Online presence
    
    public static By webSite=By.xpath("//input[@formcontrolname=\"webSite\"]\r\n"+ "");   
    public static By facebook=By.xpath("//input[@formcontrolname=\"facebook\"]");
    public static By instagram=By.xpath ("//input[@formcontrolname=\"instagram\"]");
    
//    business Categories
    
    public static By businessCategoriesDropDown=By.id("bc_select");
    public static By select_category1=By.xpath("//ng-dropdown-panel[@class='ng-dropdown-panel ng-select-top']/div/div[2]//div/span[text()='Travel & Tourism']");
//    public static By select_category2=By.xpath("//ng-dropdown-panel[@class="ng-dropdown-panel ng-select-top"]/div/div[2]//div/span[text()="Auto & Transport"]");
//    public static By select_category3=By.xpath("//ng-dropdown-panel[@class="ng-dropdown-panel ng-select-top"]/div/div[2]//div/span[text()="Dresses"]");
//    public static By select_category4=By.xpath("//ng-dropdown-panel[@class="ng-dropdown-panel ng-select-top"]/div/div[2]//div/span[text()="Business Services"]");
//    public static By select_category5=By.xpath("//ng-dropdown-panel[@class="ng-dropdown-panel ng-select-top"]/div/div[2]//div/span[text()="Retail & Shopping"]");
   
//  business sub  Categories
    
    public static By selectsub_category1 =By.id ("subCategoryCheckbox0_1");
    public static By selectsub_category2=By.id ("subCategoryCheckbox1_1");
//    public static By select_sub_category11 =By.id ("subCategoryCheckbox0_1");
//    public static By select_sub_category12=By.id ("subCategoryCheckbox1_1");
    public static By category_remove=By.id("remove_btn");
    public static By keyword_remove=By.id("remove_keyword");
    public static By keyword_dropdown=By.id("ab34542e2d30");
    
    public static By save=By.id ("sn_btn");
    public static By auto_transport=By.id ("a7bf029c165a-7");

  
//  Business profile image
    
    public static By add_new_image=By.id ("add-new-image");
    public static By back_button=By.id ("back-btn");
    public static By delete_image=By.id ("remove_button");
    public static By next_button=By.id ("save_btn");
//    public static By =By.id ("sn_btn");
//    
//    public static By =By.id ("");
//    public static By =By.id ("");
//    public static By =By.id ("");
//    public static By =By.id ("");
//    public static By =By.id ("");
//    public static By =By.id ("");
    
    
    		}