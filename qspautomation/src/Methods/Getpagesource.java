package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesource 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   Thread.sleep(4000);
   driver.get("https://www.facebook.com/");
   String pageSourceCode=driver.getPageSource();
   System.out.println(pageSourceCode);
   driver.close();
}
}
