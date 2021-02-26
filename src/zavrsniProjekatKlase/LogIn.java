package zavrsniProjekatKlase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {

	public static final String LOGIN_BUTTON = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String MAIL_XPATH = "//*[@id=\"email\"]";
	public static final String PASSWORD = "//*[@id=\"password\"]";
	public static final String LOGIN2_BUTTON = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	public static final String LOGIN_END = "https://itnesto.humanity.com/app/dashboard/";
	
	public static void clickLogIn(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_BUTTON)).click();
	}
	public static void inputMailLogIn(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(MAIL_XPATH)).sendKeys(fullname);
	}
	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath(PASSWORD)).sendKeys(password);
	}
	public static void clickLogIn2(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN2_BUTTON)).click();
	}
}
