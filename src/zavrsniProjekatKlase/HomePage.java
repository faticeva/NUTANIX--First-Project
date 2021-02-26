package zavrsniProjekatKlase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static final String URL = "https://www.humanity.com/";
	public static final String FULLNAMEBOX_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	public static final String WORKEMAILBOX_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	public static final String STARTFREETRIAL_XPATH = "//*[@id=\"free-trial-link-01\"]";
	public static final String STARTFREETRIAL2_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	public static final String POPUP_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	
	public static void inputFullName(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(FULLNAMEBOX_XPATH)).sendKeys(fullname);
	}
	public static void inputWorkEmail(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(WORKEMAILBOX_XPATH)).sendKeys(workemail);
	}
	public static void clickStartFreeTrial(WebDriver driver) {
		driver.findElement(By.xpath(STARTFREETRIAL_XPATH)).click();
	}
	public static void clickStartFreeTrial2(WebDriver driver) {
		driver.findElement(By.xpath(STARTFREETRIAL2_XPATH)).click();
	}
	public static void exitPopUp(WebDriver driver) {
		driver.findElement(By.xpath(POPUP_XPATH)).click();
	}
}
