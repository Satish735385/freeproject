package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(2000);
		driver.findElement(By.id("my-text-id")).sendKeys("SATISH SHIVAJI CHIKHALE");
		Thread.sleep(2000);
		driver.findElement(By.name("my-password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.name("my-textarea")).sendKeys("my name satish shivaji chikhale ");
		Thread.sleep(2000);
		driver.findElement(By.name("my-select")).click();
		Thread.sleep(2000);
		Robot robot=new Robot();
		for(int i=0;i<4;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("my-datalist")).click();
		Robot robot1=new Robot();
		for(int i=0;i<5;i++)
		{
			robot1.keyPress(KeyEvent.VK_DOWN);
			robot1.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);

		}
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("my-check-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("my-check-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("my-radio-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("my-radio-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("my-date")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("datepicker-switch")).click();
	}

}
