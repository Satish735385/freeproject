package Methods;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https:/www.google.com");
		driver.switchTo().activeElement().sendkeys("happy dhashara",Key.Enter);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);




	}

}
