package Pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Fetchcountry {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement path;
	
	
	public Fetchcountry(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fetch()
	{
		Select se=new Select(path);
		
		List<WebElement> p=se.getOptions();
		
		int len=p.size();
		
		for (int i=1;i<len;i++)
		{
			String options=p.get(i).getText();
			System.out.println(options);
		}
	}

}
