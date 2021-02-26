package zavrsniProjekatTestovi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import zavrsniProjekatKlase.HomePage;
import zavrsniProjekatKlase.LogIn;
import zavrsniProjekatKlase.MyFirmHumanity;
import zavrsniProjekatKlase.Settings;

public class SettingsTest {
	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\38164\\\\OneDrive\\\\Desktop\\\\QA\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeClass
	public void loggingIn() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();
		HomePage.exitPopUp(driver);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LogIn.clickLogIn(driver);
		LogIn.inputMailLogIn(driver, "markomarkovic123@gmail.com");
		LogIn.inputPassword(driver, "markomarkovic");

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		LogIn.clickLogIn2(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/dashboard/";

	}

	@Test
	public void changeLanguage() {
		Settings.clickSettings(driver);
		Select dropdown = new Select(driver.findElement(By.name("language")));
		dropdown.selectByVisibleText("Serbian (machine)");
		Settings.clickSave1(driver);
		

	}
	@Test
	public void disableMailSmsPush() {
		Settings.disableEmail(driver);
		Settings.disableSMS(driver);
		Settings.disablePush(driver);
		Settings.clickSave2(driver);
		driver.quit();
	}
}