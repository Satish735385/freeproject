package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Satish");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("12134567");
		Thread.sleep(1000);
		driver.findElement(By.xpath("div[class='K-1uj Z7p_S']")).click();
		
		

	}

}
