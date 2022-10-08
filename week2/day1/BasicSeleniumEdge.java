package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumEdge {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	//driver.close();
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword = driver.findElement(	By.id("password"));
	elementPassword.sendKeys("crmsfa");
	System.out.println("Title:"+driver.getTitle());
	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	WebElement elementLead = driver.findElement(By.linkText("Leads"));
	elementLead.click();
	WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
	CreateLead.click();
	WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	CompanyName.sendKeys("ABC");
	WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
	FirstName.sendKeys("Tom");
	WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
	LastName.sendKeys("Cruise");
	WebElement FirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	FirstNameLocal.sendKeys("William");
	WebElement DepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
	DepartmentName.sendKeys("QEA");
	WebElement Description = driver.findElement(By.id("createLeadForm_description"));
	Description.sendKeys("Lead created for selenium automation");
	WebElement EmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
	EmailAddress.sendKeys("sugantamil1994@gmail.com");
	WebElement SubmitButton = driver.findElement(By.className("smallSubmit"));
	SubmitButton.click();
	System.out.println("Title:"+driver.getTitle());
	
	
}
}
