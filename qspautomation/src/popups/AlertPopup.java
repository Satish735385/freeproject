package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("a[id='course']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Selenium Training")).click();
		driver.findElement(By.xpath("//span[text()='OPEN']")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.dismiss();
		
		

	}

}
