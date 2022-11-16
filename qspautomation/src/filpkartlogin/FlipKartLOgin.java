package filpkartlogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLOgin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=14e3bc5302f5fc6990e98c8f27567a97");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
		driver.findElement(By.name("_2IX_2- VJZDxU")).sendKeys("SATISH");

	}
}
