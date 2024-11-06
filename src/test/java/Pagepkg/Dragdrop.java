package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dragdrop {
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"draggable\"]/p")
	WebElement drag;
	@FindBy(xpath="//*[@id=\"droppable\"]")
	WebElement drop;
	
	public Dragdrop(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void verify()
	{
		Actions act=new Actions (driver);
		act.dragAndDrop(drag, drop);
		act.perform();
	}

}
