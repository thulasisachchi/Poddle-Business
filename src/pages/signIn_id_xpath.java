package pages;

import org.openqa.selenium.By;

public class signIn_id_xpath {
	public static By text_email=By.id("login-email");
	public static By text_password=By.id("login-password");
	public static By button_login=By.id("login-btn");
	public static By toaster=By.id("login-btn");
	public static By password_hidden =By.xpath("\r\n"+ "//span[@class=\"input-group-text p-border-radius-right border-left-0 c-point\"]");
	public static By toasterMessage=By.xpath("//*[@id=\"toast-container\"]/div/div[2]");
	//public static By toasterMessageForInvalid=By.xpath("//div[@aria-label=\"Incorrect password. Please try again, or tap ‘Forgot password’ to reset.\"]");
	public static By toasterMessageForInvalid;
    public static By rememberMeCheck=By.xpath("//label[@class=\"form-check-label p-body-large\"]");
}
