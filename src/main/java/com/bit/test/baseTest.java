package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class baseTest {
	RemoteWebDriver RD;
	@Test
	public void testOne() throws InterruptedException, MalformedURLException {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/nazmulsheikh/Downloads/chromedriver");
		
		DesiredCapabilities DC=new DesiredCapabilities();
		DC.setBrowserName("chrome");
		String url="http://192.168.1.35:4444/wd/hub";
		RD=new RemoteWebDriver(new URL (url), DC);
		RD.get("https://www.facebook.com");
		RD.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("This is my Test1");
		
	}
	
	@Test
	
	public void testTwo() throws InterruptedException, MalformedURLException {
		
		//System.setProperty("webdriver.gecko.driver", "/Users/nazmulsheikh/Downloads/geckodriver");
		
		DesiredCapabilities DC=new DesiredCapabilities();
		DC.setBrowserName("firefox");
		String url="http://192.168.1.35:4444/wd/hub";
		 RD=new RemoteWebDriver(new URL(url), DC);
		RD.get("https://www.twitter.com");
		RD.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("This is my Test2");
		
	}
	
}
	
	


