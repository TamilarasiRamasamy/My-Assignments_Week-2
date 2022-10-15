package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://en-gb.facebook.com/");
    driver.findElement(By.linkText("Create New Account")).click();
    driver.findElement(By.name("firstname")).sendKeys("Tom");
    driver.findElement(By.name("lastname")).sendKeys("Cruise");
    driver.findElement(By.name("reg_email__")).sendKeys("4546456676");
    driver.findElement(By.name("reg_passwd__")).sendKeys("TomCruise@123");
    WebElement date = driver.findElement(By.id("day"));
    Select day1 = new Select(date);
    day1.selectByIndex(16);
    WebElement month = driver.findElement(By.id("month"));
    Select month1 = new Select(month);
    month1.selectByVisibleText("Aug");
    WebElement year = driver.findElement(By.id("year"));
    Select year1 =new Select(year);
    year1.selectByValue("1994");
    driver.findElement(By.xpath("//label[text()='Female']")).click();
    		
    
    
    
    
    
	
	
	
	
	
}
}
