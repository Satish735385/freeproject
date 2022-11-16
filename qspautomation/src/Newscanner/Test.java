package Newscanner;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of browser");
		String browservalue=sc.nextLine();
		if(browservalue.equalsIgnoreCase("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("https://www.google.com/");
		}
			else if(browservalue.equalsIgnoreCase("firefox"))
			{
		       System.setProperty("Webdriver.gecko.driver","./drivers/geckodriver.exe");
		        driver=new FirefoxDriver();
		       Thread.sleep(5000);
		       driver.manage().window().maximize();
		       driver.get("https://www.google.com/");
			}
			else
			{
				System.out.println("Enter the valied browser");
			
			}
	}
}
