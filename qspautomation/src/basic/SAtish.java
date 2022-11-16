package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SAtish {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("SATISH");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Pass:home page is displyed");
		}
		else
		{
			System.out.println("Fail:home page is not a displyed ");
		}
		driver.close();
		
		
	}

}

