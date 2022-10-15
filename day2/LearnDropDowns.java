package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDowns {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			WebElement elementUsername = driver.findElement(By.id("username"));
			elementUsername.sendKeys("Demosalesmanager");
			WebElement elementPassword = driver.findElement(	By.id("password"));
			elementPassword.sendKeys("crmsfa");
			WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
			elementLogin.click();
			WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFA.click();
			WebElement elementLead = driver.findElement(By.linkText("Leads"));
			elementLead.click();
			WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
			CreateLead.click();
			WebElement elementSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select value= new Select(elementSource);
			value.selectByVisibleText("Employee");
			WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select industry = new Select(eleIndustry);
			industry.selectByValue("IND_FINANCE");
			WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select own = new Select(owner);
			own.selectByIndex(5);
			
	}

}
