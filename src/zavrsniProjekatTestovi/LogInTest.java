package zavrsniProjekatTestovi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import zavrsniProjekatKlase.HomePage;
import zavrsniProjekatKlase.LogIn;


public class LogInTest {

	private static WebDriver driver;
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\38164\\OneDrive\\Desktop\\QA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testLogIn() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage.exitPopUp(driver);
		LogIn.clickLogIn(driver);
		LogIn.inputMailLogIn(driver, "markomarkovic123@gmail.com");
		LogIn.inputPassword(driver, "markomarkovic");
		LogIn.clickLogIn2(driver);
		
		String expected = LogIn.LOGIN_END;
		String actual = driver.getCurrentUrl();
		driver.quit();
		
	}
}
