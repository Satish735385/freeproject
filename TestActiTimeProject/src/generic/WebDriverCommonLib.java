package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest{

	public void getPageTitle(String pageName)
	{
		String title = driver.getTitle();
		Reporter.log(title,true);

	}
	public void verifypageTitle(String pageName,String expectedTitle)
	{
		String actualPageTitle=driver.getTitle();
		if(actualPageTitle.equals(expectedTitle))
		{
			Reporter.log("actualPageTitle matched",true);

		}
		else 
		{
			Reporter.log("actualPageTitle not matched",true);
		}
	}
	public void selectTheOtionDropdown(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void selectTheOtionDropdown(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);

	}
	public void selectTheOtionDropdown(String visibleText,WebElement element)
	{

		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);

	}

	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(String nameOrId )
	{
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebElement frameElement )
	{
		driver.switchTo().frame(frameElement);

	}
	public void rightClick(WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.contextClick(targetElement).perform();
	}
	public void mouseHover(WebElement src)
	{
		Actions act = new Actions(driver);
		act.moveToElement(src);
	}
	public void doubbleClick(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele);
	}

	public void dragAndDrop(WebElement src,WebElement dest)
	{

		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest);
	}
	public void scrollDowan(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixels+")");
	}
	public void scrollUp(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+(-pixels)+")");
	}
	public void scrollLeft(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+(-pixels)+"),0)");
	}
	public void scrollRight(int pixels)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+(pixels)+",0)");
	}
	public void scrollPerticulerWebElement(WebElement element)
	{
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	public void hitEnterButton() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	public void generatePrintPopup() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);

	}
	public void coppy() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

	}
	public void acpectAlertPopup()
	{
		Alert a1 = driver.switchTo().alert();
		a1.accept();
	}
	public void dismissJavaScriptPopup()
	{
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
	}
	public void printAllOptionDropdown(WebElement element)

	{
		Select sel = new Select(element);
		List<WebElement> alloption = sel.getOptions();
		for(WebElement we:alloption)
		{
			String text = we.getText();
			System.out.println(text);
		}
	}

}




