package pages;

import org.openqa.selenium.By;

public class createUser_id_xpath {
	    
	    public static By tab_users=By.id("users");
        public static By button_createNew=By.xpath("//*[@class=\"btn p-button px-sm-5 px-2 m-s-button\"]");
		public static By button_imageUploadButton=By.id("btn-user-image-modal-open");
		public static By button_uploadFile=By.xpath("//*[@id=\"btn-user-image-modal-open\"]");
		public static By button_dropdownSelectRole=By.xpath("//*[@id=\"business-user-form-popup\"]/div/div/div/app-business-user-form/section/div[2]/div/div[2]/form/div[2]/div[2]/ng-select");
		public static By select_superuser=By.xpath("//span[text()=\"Super user\"]");
		public static By select_standarduser=By.xpath("//span[text()=\"Standard user\"]");
		public static By selectRolePlaceholderSearch=By.id("select_role");
		
//		public static By selectRole=By.xpath("//ng-select[@class=\"ng-select-searchable ng-select ng-select-single ng-pristine ng-invalid ng-touched ng-select-opened ng-select-bottom\"]");
		public static By text_firstName=By.id("first_name");
		public static By text_lastName=By.id("last_name");
		public static By makeThisUserActive=By.xpath("//input[@formcontrolname=\"isActive\"]");
		public static By text_email = By.xpath("//*[@id=\"business-user-form-popup\"]/div/div/div/app-business-user-form/section/div[2]/div/div[2]/form/div[5]/div[2]/input");
		public static By button_createuser = By.id("create_user");
		public static By img_button_confirm = By.id("upload-btn");
		public static By button_done=By.id("done_btn");
		public static By user_edit_option=By.id("edit_btn");
		public static By checkboxTickBooster=By.xpath("//input[@formcontrolname=\"isBusinessBooster\"]");
		public static By button_cancel=By.id("cancel_btn");
        public static By button_close=By.xpath("//button[@id=\"sharable-card-popup\"]");
        public static By createUserPopUp_close=By.id("business-user-form-close");
        public static By button_cancel_User =By.xpath("//*[@id='business-user-form-popup']//form/div[8]/button[1]");
        public static By save_changes=By.id("save_button");
        
//        Edit user 
        public static By download_and_print_generic_handout=By.id("download_button");
        public static By download_code_create_custom_handout =By.id("download_btn");
        public static By search_user=By.id("search_box");
        public static By booster_check=By.id("boosterCheck");
        
       
        

}

