package Pagepkg;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Screenshotelement {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"HTML5\"]/div[1]/button")
	WebElement element;
	
	public Screenshotelement(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void shot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot/buttonpage.png"));
	
	}
	
	public void elementshot() throws IOException
	{
		File ele=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ele, new File("./Screenshot/buttonpage2.png"));
	}

	
	}


