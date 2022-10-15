package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Tamilarasi");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10131']")).click();
	    System.out.println(driver.getTitle()); 
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
	    driver.findElement(By.className("smallSubmit")).click();
	    System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
	    driver.close();
	    
	   
	    
		

		
}
}
