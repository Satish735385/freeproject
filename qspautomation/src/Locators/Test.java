package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	driver.findElement(By.cssSelector("div[id='app']")).sendKeys("12345");
	
	
}
}
