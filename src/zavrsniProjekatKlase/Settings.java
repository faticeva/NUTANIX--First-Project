package zavrsniProjekatKlase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {

	public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span";
	public static final String SELECT_LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SAVE_SETTINGS = "//*[@id=\"act_primary\"]";
	public static final String DISABLE_EMAIL = "//*[@id=\"pref_pref_email\"]";
	public static final String DISABLE_SMS = "//*[@id=\"pref_pref_sms\"]";
	public static final String DISABLE_PUSH = "//*[@id=\"pref_pref_mobile_push\"]";
	public static final String SAVE_SETTINGS2 = "//*[@id=\"_save_settings_button\"]";
	
	
	public static void clickSettings(WebDriver driver) {
		driver.findElement(By.xpath(SETTINGS_XPATH)).click();
	}
	public static void clickSelectLanguage(WebDriver driver) {
		driver.findElement(By.xpath(SELECT_LANGUAGE_XPATH)).click();
	}
	public static void clickSave1(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_SETTINGS)).click();
	}
	public static void disableEmail(WebDriver driver) {
		driver.findElement(By.xpath(DISABLE_EMAIL)).click();
	}
	public static void disableSMS(WebDriver driver) {
		driver.findElement(By.xpath(DISABLE_SMS)).click();
	}
	public static void disablePush(WebDriver driver) {
		driver.findElement(By.xpath(DISABLE_PUSH)).click();
	}
	public static void clickSave2(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_SETTINGS2)).click();
	}
	
	
}
