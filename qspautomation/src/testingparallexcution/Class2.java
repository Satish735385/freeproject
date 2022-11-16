import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	WebDriver driver;
	@Test

	public void chainaisuperking() 
	{

		System.setProperty("webdriver.chrome.driver",",/drivers/chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("chainai superking",Keys.ENTER);
	}
}
