package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementtools {
	WebDriver driver;
	
	
	@FindBy(id="name")
	WebElement fullname;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(id="textarea")
	WebElement address;
	
	public Elementtools(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void write(String name, String mailid, String num, String add)
	{
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		
		
		fullname.sendKeys(name);
		email.sendKeys(mailid);
		phone.sendKeys(num);
		address.sendKeys(add);
		
	}
	
}
