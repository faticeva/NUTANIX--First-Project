package zavrsniProjekatTestovi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import zavrsniProjekatKlase.HomePage;
import zavrsniProjekatKlase.LogIn;
import zavrsniProjekatKlase.MyFirmHumanity;

public class MyFirmHumanityTest {

	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\38164\\\\OneDrive\\\\Desktop\\\\QA\\\\chromedriver.exe");
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

	@Test(priority = 1)
	public void dashboardOption() {
		driver.navigate().to(MyFirmHumanity.URL);
		MyFirmHumanity.clickDashboard(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void shiftPlanningOption() {
		MyFirmHumanity.clickShiftPlaning(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/schedule/employee/week/overview/overview/25%2c1%2c2021/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void timeClockOption() {
		MyFirmHumanity.clickTimeClock(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/timeclock/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void leaveOption() {
		MyFirmHumanity.clickLeave(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/requests/vacation/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 5)
	public void trainingOption() {
		MyFirmHumanity.clickTraining(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/training/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 6)
	public void stuffOption() {
		MyFirmHumanity.clickTraining(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/staff/list/load/true/";
	}

	@Test(priority = 7)
	public void availabilityOption() {
		MyFirmHumanity.clickAvailibility(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 8)
	public void payrollOption() {
		MyFirmHumanity.clickPayroll(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/payroll/scheduled-hours/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 9)
	public void reportsOption() {
		MyFirmHumanity.clickReports(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://itnesto.humanity.com/app/reports/dashboard/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 10)
	public void addEmployees() {
		driver.navigate().to(MyFirmHumanity.ADD_EMPLOYEES_XPATH);
		MyFirmHumanity.addEmployee(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (true) {
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);
			try {
				ImageIO.write(screenshot.getImage(), "PNG", new File("TrueScreenshot1.png"));
			} catch (IOException e) {
				System.out.println("Error screenshot not taken!");
				e.printStackTrace();
			}
		}
	}

	@Test(priority = 11)
	public void changeName() {
		driver.navigate().to("https://itnesto.humanity.com/app/staff/list/load/true/");
		MyFirmHumanity.changeName(driver);
		
	}

	@Test(priority = 12)
	public void addNewEmployees() {
		driver.navigate().to("https://itnesto.humanity.com/app/staff/list/load/true/");
		MyFirmHumanity.fiveEmployeesInput(driver);

	}
}
