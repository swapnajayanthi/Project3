package com.driverutility.selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class DriverUtility {
	
	private WebDriver webDriver;
	
	public void OpenBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty();
			WebDriver d = new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(key, value);
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("internet explorer"))
		{
			System.setProperty(key, value);
			WebDriver d = new InternetExplorerDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("headless"))
		{
			System.out.println("headless browser testing");
		}
		else
		{
			System.out.println("not finding headless browser");
		}
	}
	
	public void closeBrowser()
	{
		if(WebDriver!=null)
			System.out.println("closing the browser");
	}
	else
	{
		System.out.println("webdriver is null");
	}
	public WebDriver getDriver()
	{
		return WebDriver();
}
public static void main(String[] args) {
	DriverUtility d = new DriverUtility();
	d.OpenBrowser("chrome");
	d.closeBrowser();
}
}

}
