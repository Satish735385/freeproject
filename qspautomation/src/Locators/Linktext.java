package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext 
{

    public static void main(String[] args) throws InterruptedException 
    {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("")).sendKeys("satish");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("f3bb4f875101e48")).click();
		
		
		
		
    }
}
