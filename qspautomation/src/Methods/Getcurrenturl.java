package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	driver.close();
	

}
}
