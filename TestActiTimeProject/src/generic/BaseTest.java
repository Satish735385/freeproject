package generic;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant
{
	private static final String SCRRENSHOTS_PATH = null;
	static WebDriver driver;
	@BeforeMethod
	public void setup() throws IOException
	{
		Flib flib = new Flib();
		String browserValue=flib.readReportData(PROP_PATH,"browser");

		String url=flib.readReportData(PROP_PATH,"URL");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} 
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else
		{
			Reporter.log("invalid browser",true);
		}
	}
	public void failed(String methodName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(SCRRENSHOTS_PATH+methodName+".png");
		Files.copy(scr, dest);


	}




	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}
