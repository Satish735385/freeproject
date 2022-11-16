package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubleClickMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.cssSelector("a[id='course']"));
		Thread.sleep(2000);
         Actions act=new Actions(driver);
         act.moveToElement(ele).perform();
         driver.findElement(By.linkText("Selenium Training")).click();
        WebElement doub = driver.findElement(By.cssSelector("i[class='fa fa-plus']"));
         Actions act1=new Actions(driver);
         act1.doubleClick(doub).perform();
         
         
	}

}
