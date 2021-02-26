package zavrsniProjekatKlase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {
	
	public static final String PROFILE_SETTINGS = "//*[@id=\"userm\"]/div";
	public static final String SETTINGS_XPATH = "//*[@id=\"userm\"]/div/a[2]";
	public static final String MIN_TIME_SHIFTS = "//*[@id=\"mtimebshifts\"]";
	public static final String MIN_WEEKLY = "//*[@id=\"undertime\"]";
	public static final String MIN_WEEKLY_OVERTIME = "//*[@id=\"overtime\"]";
	public static final String SAVE_SETTINGS_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static void clickProfileSettings(WebDriver driver) {
		driver.findElement(By.xpath(PROFILE_SETTINGS)).click();
	}
	public static void clickSettingsProfile(WebDriver driver) {
		driver.findElement(By.xpath(SETTINGS_XPATH)).click();
	}
	public static void clickMinTimeShifts(WebDriver driver) {
		driver.findElement(By.xpath(MIN_TIME_SHIFTS)).click();
	}
	public static void clickMinWeekly(WebDriver driver) {
		driver.findElement(By.xpath(MIN_WEEKLY)).click();
	}
	public static void clickMinWeeklyOvertime(WebDriver driver) {
		driver.findElement(By.xpath(MIN_WEEKLY_OVERTIME)).click();
	}
	public static void clickSaveSettings(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_SETTINGS_XPATH)).click();
	}
	
	

}
