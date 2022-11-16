package twitter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("text")).sendKeys("SATISH");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Log in to Twitter / Twitter"))
		{
			System.out.println("Pass:home page should be displyed");
		}
		else
		{
			System.out.println("FAil:home page not be displyed");
		}
		String e1 = driver.getCurrentUrl();
		System.out.println(e1);
		driver.close();
	
		
	}

}
