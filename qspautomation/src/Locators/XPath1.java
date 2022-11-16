package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/demo-request");
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Satish");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Chikhale");
		Thread.sleep(1000);
		driver.findElement(By.name("emailAddress")).sendKeys("satishchikhale21@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("company-name")).sendKeys("Q spider pune");
		driver.findElement(By.id("submit-demo-request")).click();

	}

}
