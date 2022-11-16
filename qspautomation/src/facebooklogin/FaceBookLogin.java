package facebooklogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("email")).sendKeys("Satish");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.name("login")).click();
                String title = driver.getTitle();
                 System.out.println(title);
             if(title.equals("Facebook – log in or sign up"))
             {
            	 System.out.println("pass:home page should be displyed");
            	 
             }
             else
             {
            	 System.out.println("fail:home page should be not displyed ");
            	 
             }
            String e1 = driver.getCurrentUrl();
            System.out.println(e1);
            driver.close();
              
	}               

}
