package Pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Countlinks {
	WebDriver driver;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	public Countlinks(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void count()
	{
		System.out.println("total number of links "+links.size());
		
		for(WebElement ele : links)
		{
			String li=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(li+"----"+linktext);
		}
	}

}
