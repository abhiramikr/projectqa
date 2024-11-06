package Pagepkg;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datepickerprgm {
	
	WebDriver driver;
	
	@FindBy(id="datepicker")
	WebElement fieldbox;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div")
	WebElement monthdetails;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")
	WebElement arrow;
	
	@FindBy(xpath="/html/body/div[5]/table/tbody/tr/td/a")
	List<WebElement> datelist;
	
	public Datepickerprgm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void month() 
	{
		fieldbox.click();
		month("November 2025", "15");
	}
	private void month(String expmonth, String expdate)
	{
		while(true)
		{
			String mon=monthdetails.getText();
			
			if(expmonth.equals(mon))
			{
				System.out.println(mon);
				break;
			}
			else
			{
				arrow.click();
			}
		}
		
	
	for(WebElement ele:datelist)
	{
		
		String datetext=ele.getText();
		if(datetext.equals(expdate));
		{
			ele.click();
			break;
		}
	}
		
	}
	public void datepass()
	{
		
	}
		
	
		
	}
	
	

		


