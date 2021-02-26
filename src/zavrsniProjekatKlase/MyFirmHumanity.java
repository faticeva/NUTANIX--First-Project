package zavrsniProjekatKlase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyFirmHumanity {

	public static final String URL = "https://itnesto.humanity.com/app/dashboard/";
	public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	public static final String SHIFTPLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span";
	public static final String TIMECLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	public static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]/span";
	public static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";
	public static final String ADD_EMPLOYEES_XPATH = "//*[@id=\"act_primary\"]";
	public static final String ADD_FIRSTNAME_XPATH = "//*[@id=\"_asf1\"]";
	public static final String ADD_LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	public static final String ADD_EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	public static final String SAVE_NEW_EMPLOYEE_XPATH = "//*[@id=\"_as_save_multiple\"]";
	public static final String ADDED_EMPLOYEE_XPATH = "//*[@id=\"7\"]";
	public static final String ADDED_EMPLOYEE_EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String ADDED_EMPLOYEE_NAME_XPATH = "//*[@id=\"first_name\"]";
	public static final String SAVE_EMPLOYEE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	
	public static void clickDashboard(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(DASHBOARD_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void clickShiftPlaning(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SHIFTPLANNING_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void clickTimeClock(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(TIMECLOCK_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void clickLeave(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void clickTraining(WebDriver driver) {
		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void clickStaff(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void clickAvailibility(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(AVAILABILITY_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void clickPayroll(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void clickReports(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(REPORTS_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void addEmployee(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_FIRSTNAME_XPATH)).sendKeys("jaja");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_LASTNAME_XPATH)).sendKeys("jajic");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADD_EMAIL_XPATH)).sendKeys("jajajajic@gmail.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_NEW_EMPLOYEE_XPATH)).click();
	}

	public static void changeName(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().to(MyFirmHumanity.STAFF_XPATH);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_EDIT_XPATH)).click();
		driver.findElement(By.xpath(ADDED_EMPLOYEE_NAME_XPATH)).sendKeys("Jaja");
		driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_NAME_XPATH)).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath(ADDED_EMPLOYEE_NAME_XPATH)).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath(ADDED_EMPLOYEE_NAME_XPATH)).sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(ADDED_EMPLOYEE_XPATH)).click();
				
		driver.findElement(By.linkText("Jaja jajic")).click();
	}

public static void fiveEmployeesInput(WebDriver driver) {
		
		File f = new File("Employees.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(inp);
			Sheet sheet = wb.getSheetAt(0);
			Row row;
			for (int i = 0; i < 6; i++) {
				row = sheet.getRow(i);
				String name = row.getCell(0).toString();
				String surname = row.getCell(1).toString();
				String email = row.getCell(2).toString();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH)).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_FIRSTNAME_XPATH)).sendKeys(name);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_LASTNAME_XPATH)).sendKeys(surname);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(ADD_EMAIL_XPATH)).sendKeys(email);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(SAVE_NEW_EMPLOYEE_XPATH)).click();
				wb.close();
			}
		} catch (IOException e) {
			System.out.println("Nije pronadjen fajl!");
			e.printStackTrace();
		}

	
}
}
