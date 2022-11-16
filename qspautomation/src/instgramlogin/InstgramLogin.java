package instgramlogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstgramLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("SATISH");
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
		{
			System.out.println("pass:home pages should be displyed ");
			
		}
		else
		{
			System.out.println("fail:home page should be not a displyed ");
			
		}
		String e1 = driver.getCurrentUrl();
		System.out.println(e1);
		driver.close();
	}
	
		
	}
