package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.linkText("Electronics"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Smart watches")).click();
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Samsung")).click();
		
		
	}

}
