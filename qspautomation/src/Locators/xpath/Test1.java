package Locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=866d1d8520a020d085250a704814540d");
	Thread.sleep(1000);
	driver.findElement(By.xpath("button[class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("hp laptop");
	
}
}
