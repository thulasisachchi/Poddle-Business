package util;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class openBrowser {
    
	public static WebDriver driver ;  
	
	public static void openBrowser(boolean allowNotifications) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // ChromeOptions setup
        ChromeOptions options = new ChromeOptions();
        
        // Set notification preferences
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", allowNotifications ? 1 : 2);
        options.setExperimentalOption("prefs", prefs);
        
        options.addArguments("--remote-allow-origins=*");

        // Initialize the WebDriver
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://business.poddleuat.demotown.co.uk/#/login");
        openBrowser.driver=driver;
    }

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		openBrowser.driver = driver;
	}
		
	}


