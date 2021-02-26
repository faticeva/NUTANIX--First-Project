package zavrsniProjekatTestovi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import zavrsniProjekatKlase.HomePage;
import zavrsniProjekatKlase.LogIn;
import zavrsniProjekatKlase.Profile;

public class ProfileTest {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\38164\\OneDrive\\Desktop\\QA\\chromedriver.exe");
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
	public void manageProfileSettings() {
		Profile.clickMinTimeShifts(driver);
		Select dropdown1 = new Select(driver.findElement(By.name("Minimum Time Between Shifts")));
		dropdown1.selectByVisibleText("30 mins");
		Profile.clickMinWeekly(driver);
		Select dropdown2 = new Select(driver.findElement(By.name("Minimum Weekly Hours")));
		dropdown2.selectByVisibleText("18");
		Profile.clickMinWeeklyOvertime(driver);
		Select dropdown3 = new Select(driver.findElement(By.name("Maximum Weekly Hours (overtime)")));
		dropdown3.selectByVisibleText("Unlimited");
		Profile.clickSaveSettings(driver);
		
		
		
	}

}
