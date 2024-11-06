package Pagepkg;

import org.openqa.selenium.WebDriver;

public class TexttitleVerification {
	
	WebDriver driver;
	
	public TexttitleVerification(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void textverification()
	{
		String source=driver.getPageSource();
		
		if(source.contains("Selenium"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String exptitle="DEMOQA";
		if(actualtitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
