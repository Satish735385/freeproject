package stale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=h8g0r7ihqle95");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		WebElement username1 = driver.findElement(By.name("username"));
		username1.sendKeys("satish");
		
		

	}

}
