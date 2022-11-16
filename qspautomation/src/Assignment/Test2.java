package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	 driver.findElement(By.id("gh-cat")).click();
	 Thread.sleep(2000);
	 Robot robot=new Robot();
	 for(int i=0;i<10;i++)
	 {
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
	 }
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(1000);
	 driver.findElement(By.cssSelector("input[type='submit']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='Advertising']")).click();
	 Thread.sleep(2000);
	 driver.close();
	}

}
