package zavrsniProjekatTestovi;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import zavrsniProjekatKlase.AboutUs;
import zavrsniProjekatKlase.HomePage;

public class AboutUsTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\38164\\OneDrive\\Desktop\\QA\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void goToAboutUsTest() {
		driver.navigate().to(HomePage.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		HomePage.exitPopUp(driver);
		AboutUs.clickAboutUsMenu(driver);
		AboutUs.clickAboutUsButton(driver);

		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File("AboutUsScreenshot1.png"));
		} catch (IOException e) {
			System.out.println("Error screenshot not taken!");
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = AboutUs.ABOUTUS_URL;
		Assert.assertEquals(actual, expected);
		driver.quit();
	}

}
