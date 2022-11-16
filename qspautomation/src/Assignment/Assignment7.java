package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment7 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		WebElement ele = driver.findElement(By.partialLinkText("Blogs"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[class='combobox']")).click();
		Robot robot=new Robot();
		for(int i=0;i<=4;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		driver.findElement(By.cssSelector("textarea[id='ta1']")).sendKeys("MY NAME IS SATISH SHIVAJI CHIKHALE ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("satish");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("satish");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='radio1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='checkbox2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button'][5]")).click();
		Thread.sleep(2000);
		
		
	}

}
