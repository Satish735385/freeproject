package actitimelogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-hhcmmkh1/login.do"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		String title = driver.getTitle();
         System.out.println(title);
     if(title.equals("actiTIME - Login"))
     {
    	 System.out.println("pass:home page should be displyed ");
     }
     else
     {
    	 System.out.println("fail: home page should be not a displyed ");
    	 
     }
         String e =driver.getCurrentUrl();
        System.out.println(e);
        driver.close();
        

	}
}
