package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test05 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=bceq7o2ob8hmm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("satish");
		Thread.sleep(2000);
		driver.findElement(By.name("passwordText")).sendKeys("satish@21");
		Thread.sleep(2000);

		driver.findElement(By.name("passwordTextRetype")).sendKeys("satish@21");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name='active']")).click();
		Thread.sleep(2000);
		Robot robot=new Robot();
		for(int i=0;i<=1;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("satish");

		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("02320105672");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("chikhale");
		Thread.sleep(2000);
		driver.findElement(By.name("fax")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("middleName")).sendKeys("shivaji");
		Thread.sleep(2000);
		driver.findElement(By.name("mobile")).sendKeys("9075396497");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("satishchikhale21@gmail.com");

		Thread.sleep(2000);
		driver.findElement(By.name("otherContact")).sendKeys("+917022020085");
		Thread.sleep(2000);
		driver.findElement(By.id("timeZoneName")).click();

		Robot robot1=new Robot();
		for(int i=0;i<=20;i++)

		{
			robot1.keyPress(KeyEvent.VK_DOWN);
			robot1.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);

		}
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("workdayDurationStr"));
		ele.sendKeys("12");
		Thread.sleep(2000);
		ele.clear();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.name("workdayDurationStr"));
		ele2.sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.id("overtimeTracking_Enable")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen7")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='15'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("rightGranted[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("rightGranted[5]")).click();
		Thread.sleep(2000);
		WebElement a1 = driver.findElement(By.name("rightGranted[7]"));
		a1.click();
		Thread.sleep(2000);
		WebElement a2 = driver.findElement(By.name("rightGranted[10]"));
		a2.click();
		Thread.sleep(2000);
		WebElement a3 = driver.findElement(By.name("rightGranted[11]"));
		a3.click();
		Thread.sleep(2000);
		driver.findElement(By.name("rightGranted[13]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("rightGranted[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("rightGranted[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("rightGranted[10]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("rightGranted[11]")).click();
		Thread.sleep(2000);


	}

}
