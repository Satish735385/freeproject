import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelegramLogin 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.telegram.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   String title = driver.getTitle();
	    System.out.println(title);
	  
	  
	    

	}

}
