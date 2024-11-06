package Pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mousekey {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"HTML3\"]/div[1]/div/button")
	WebElement move;
	@FindBy(xpath="//*[@id=\"HTML10\"]/div[1]/button")
	WebElement doclick;
	
	@FindBy(xpath="//*[@id=\"field1\"]")
	WebElement copy;
	
	@FindBy(xpath="//*[@id=\"field2\"]")
	WebElement paste;
	
	public Mousekey(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Mouse()
	{
		Actions act =new Actions(driver);
		act.moveToElement(move);
		act.doubleClick(doclick);
		
		act.keyDown(copy,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(copy,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(paste,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}
	

}
