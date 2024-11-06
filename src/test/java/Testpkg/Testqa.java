package Testpkg;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Alerthandling;
import Pagepkg.Countlinks;
import Pagepkg.Datepickerprgm;
import Pagepkg.Dragdrop;
import Pagepkg.Dropdown;
import Pagepkg.Elementtools;
import Pagepkg.Fetchcountry;
import Pagepkg.Fileuploadprgm;
import Pagepkg.Mousekey;
import Pagepkg.Screenshotelement;
import Pagepkg.TexttitleVerification;

public class Testqa {
	
	private static final boolean flase = false;
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	@Test
	public void test1()
	{
		TexttitleVerification tt= new TexttitleVerification (driver);
		tt.textverification();
		tt.titleverification();
	}
	@Test
	public void test2()
	{
		Countlinks cl=new Countlinks(driver);
		cl.count();
	}
	@Test
	public void test3()
	{
		Elementtools et= new Elementtools(driver);
		et.write("REMYA", "remaya@gmail.com", "9625123458", "Goopura(h),Kochi");
		
	}
	@Test
	public void test4()
	{
		Alerthandling ah=new Alerthandling(driver);
		ah.demo();
	}
	@Test
	public void test5() throws IOException
	{
		Screenshotelement ss=new Screenshotelement(driver);
		ss.shot();
		ss.elementshot();
	}
	@Test
	public void test6()
	{
		Dropdown dd=new Dropdown(driver);
		dd.button();
		dd.drop();
	}
	@Test
	public void test7()
	{
		Mousekey mk=new Mousekey(driver);
		mk.Mouse();
	}
	@Test
	public void test8()
	{
		Dragdrop dp=new Dragdrop(driver);
		dp.verify();
	}
	@Test
	public void test9()
	{
		Datepickerprgm da=new Datepickerprgm(driver);
		da.month();
		
	}
	@Test
	public void test10()
	{
		Fetchcountry fc=new Fetchcountry(driver);
		fc.fetch();
	}
		

}
