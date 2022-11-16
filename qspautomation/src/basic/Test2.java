package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("firefox.driver.chrome.driver","./drivers/chromedriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.get("https://www.actitime.com/");
		

	}

}