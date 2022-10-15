package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("999");
	    driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
	    Thread.sleep(2000);
	    String leadValue = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	    System.out.println(leadValue);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	    driver.findElement(By.className("subMenuButtonDangerous")).click();
	    driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
        driver.findElement(By.xpath(" //input[@name='id']")).sendKeys(leadValue);
        driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
        String text = driver.findElement(By.xpath("//div[text()= 'No records to display']")).getText();
        System.out.println(text);
        
	    
	    
}
}
