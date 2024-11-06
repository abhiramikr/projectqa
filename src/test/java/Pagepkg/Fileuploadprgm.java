package Pagepkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileuploadprgm {
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"singleFileInput\"]")
	WebElement load;
	
	
public Fileuploadprgm(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void fileclick() throws AWTException
{
	load.click();
	
	
}

public void fileupload(String filepath) throws AWTException 
{
	fileupload(filepath);
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(filepath)));
	
	StringSelection str=new StringSelection(filepath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
	Robot rob=new Robot();
	
	rob.delay(3000);
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);

	rob.keyRelease(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);

	
}


	
}


