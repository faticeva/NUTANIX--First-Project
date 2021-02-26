package zavrsniProjekatTestovi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import zavrsniProjekatKlase.HomePage;
import zavrsniProjekatKlase.SignUp;

public class HomePageTest {

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\38164\\OneDrive\\Desktop\\QA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void testSignUpFromHomePage() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage.exitPopUp(driver);
		HomePage.inputFullName(driver, "Marko Markovic");
		HomePage.inputWorkEmail(driver, "markomarkovic123.1@gmail.com");
		HomePage.clickStartFreeTrial(driver);
		
		String expected = "https://www.humanity.com/wizard-setup2/";
		String actual = driver.getCurrentUrl();
		
		
	}
	@Test (priority = 2)
	public void testSignUpFromSignUpForm() {
		driver.navigate().to(HomePage.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		HomePage.clickStartFreeTrial2(driver);
		SignUp.inputName(driver, "Marko Markovic");
		SignUp.inputWorkEmail(driver, "markomarkovic123.@gmail.com");
		SignUp.clickStartFreeTrial3(driver);
		
		String expected = "https://www.humanity.com/wizard-setup2/";
		String actual = driver.getCurrentUrl();
		
		driver.quit();
		
		
	}
}
