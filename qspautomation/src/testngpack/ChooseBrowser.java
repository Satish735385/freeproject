package testngpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ChooseBrowser {
	WebDriver driver;
	@Test 
	@Parameters("browser")
	public void opeanBrowser(String browservalue) 
	{
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",",/drivers/chromedriver.exe");

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("you are seeing chrome browser");

		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",",/drivers/geckodriver.exe");

			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("you are seeing firefox browser");
		}
		else
		{
			Reporter.log("invalid browser",true);
		}
	}
}
