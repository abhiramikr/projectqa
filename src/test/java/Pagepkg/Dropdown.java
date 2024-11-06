package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	WebDriver driver;
	
	@FindBy(id="female")
	WebElement radio;
	@FindBy(id="friday")
	WebElement day;
	@FindBy(id="country")
	WebElement scroll;
	
	public Dropdown(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void button()
	{
		radio.click();
		day.click();
	}
	public void drop()
	{
		Select se=new Select(scroll);
		se.selectByValue("india");
		se.selectByIndex(4);
		se.selectByVisibleText("Germany");
	}
	
	
	
}