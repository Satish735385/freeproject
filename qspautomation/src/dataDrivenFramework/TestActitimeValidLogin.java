package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=h8g0r7ihqle95");
		Flib flib = new Flib();
		//read valid username 
		String validusername = flib.readExcelData("./data/testdata.xlsx", "validdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(validusername);
		//read valid password
		String validpassword = flib.readExcelData("./data/testdata.xlsx", "validdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(validpassword );
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
	}
	

}
