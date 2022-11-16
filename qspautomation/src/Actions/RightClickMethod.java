package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      WebElement ele = driver.findElement(By.name("q"));
      Thread.sleep(2000);
      Actions act=new Actions(driver);
      act.contextClick(ele).perform();
      
	}

}
