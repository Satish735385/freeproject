package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitalyWait {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("satish");
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("1234567");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		

	}

}
