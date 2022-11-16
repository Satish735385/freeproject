package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByNameAndId {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/satish/usrpass.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name = driver.findElement(By.cssSelector("input[text='text']"));
		name.sendKeys("SATISH");
		Thread.sleep(2000);
		driver.switchTo().frame("frnm");
		WebElement pass = driver.findElement(By.cssSelector("input[type='text']"));
		pass.sendKeys("12345");
	}

}
