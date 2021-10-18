package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		String text = driver.findElement(By.tagName("h2")).getText(); // example for tagname locator
		System.out.println(text); // this will print in console

		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivaranjani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BE");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SoftwareEngineer");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("25000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Spark");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987654321");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Hamida");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Hi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600010");

		driver.findElement(By.name("submitButton")).click();

	}

}
