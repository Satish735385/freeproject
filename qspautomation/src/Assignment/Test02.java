package Assignment;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("SATISH");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("CHIKHALE");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='exp-5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("10/05/2022");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("continents")).click();
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
		driver.findElement(By.id("selenium_commands")).click();
		Robot robot1=new Robot();
		for(int i=0;i<6;i++)
		{
			robot1.keyPress(KeyEvent.VK_DOWN);
			robot1.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='file']")).click();
		Thread.sleep(2000);

	}

}
