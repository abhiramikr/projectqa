package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerthandling {
	
	WebDriver driver;
	
	@FindBy(id="alertBtn")
	WebElement simple;
	@FindBy(id="confirmBtn")
	WebElement confirm;
	@FindBy(id="promptBtn")
	WebElement prompt;
	
	public Alerthandling(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void demo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		simple.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		confirm.click();
		a.accept();
		prompt.click();
		a.accept();
		
	}
	

}
