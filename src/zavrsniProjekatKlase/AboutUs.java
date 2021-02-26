package zavrsniProjekatKlase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUs {

	public static final String HOMEPAGE_URL = "https://www.humanity.com/";
	public static final String ABOUTUS_URL = "https://www.humanity.com/about";
	public static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul";
	public static final String ABOUTUSBUTTON_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";

	public static void clickAboutUsMenu(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUS_XPATH)).click();
	}
	public static void clickAboutUsButton(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUSBUTTON_XPATH)).click();
	}

	
}
