package javascritexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	JavascriptExecutor jce=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	jce.executeScript("window.scrollBy(0,500)");
	

	}

}
