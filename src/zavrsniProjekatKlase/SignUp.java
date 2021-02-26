package zavrsniProjekatKlase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

	public static final String FULLNAME_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	public static final String WORKEMAIL_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	public static final String STARTFREETRIAL3_XPATH = "//*[@id=\"popup-free-trial-link\"]";
	public static final String POPUP2_XPATH = "//*[@id=\"intercom-container\"]/div/div/div[1]/div/div/span";
	
	public static void inputName(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(FULLNAME_XPATH)).sendKeys(fullname);
	}
	public static void inputWorkEmail(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(WORKEMAIL_XPATH)).sendKeys(workemail);
	}
	public static void clickStartFreeTrial3(WebDriver driver) {
		driver.findElement(By.xpath(STARTFREETRIAL3_XPATH)).click();
	}
	public static void exitPopUp2(WebDriver driver) {
		driver.findElement(By.xpath(POPUP2_XPATH)).click();
	}
}
