package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumOpera {
public static void main(String[] args) {
	WebDriverManager.operadriver().setup();
	OperaDriver driver = new OperaDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	//driver.close();
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
	WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	CompanyName.sendKeys("CDC");
	WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
	FirstName.sendKeys("Tony");
	WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
	LastName.sendKeys("Williams");
	WebElement FirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	FirstNameLocal.sendKeys("Smith");
	WebElement DepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
	DepartmentName.sendKeys("QEABPM");
	WebElement Description = driver.findElement(By.id("createLeadForm_description"));
	Description.sendKeys("Lead created for selenium automation");
	WebElement EmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
	EmailAddress.sendKeys("sugantamil1994@gmail.com");
	WebElement SubmitButton = driver.findElement(By.className("smallSubmit"));
	SubmitButton.click();
	WebElement EditLead = driver.findElement(By.linkText("Edit"));
	EditLead.click();
	WebElement ClrDescript = driver.findElement(By.id("updateLeadForm_description"));
	ClrDescript.clear();
	WebElement ImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
	ImportantNote.sendKeys("Field to update important notes");
	WebElement UpdateLead = driver.findElement(By.className("smallSubmit"));
	UpdateLead.click();
	System.out.println("Title:"+driver.getTitle());
}
}
	
	