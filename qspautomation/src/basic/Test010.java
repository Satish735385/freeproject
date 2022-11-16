package basic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test010 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("satishchikhale21@gmail.com ");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Satish@21");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("phoneNumber")).sendKeys("7353852138");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='satish Chikhale']")).click();
	}
}
