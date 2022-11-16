package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle 
{
  public static void main(String[] args) throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:/www.google.com");
	Thread.sleep(4000);
	String titleOfTheFirstPage=driver.getTitle();
	System.out.println(titleOfTheFirstPage);
	driver.close();
	}
}
