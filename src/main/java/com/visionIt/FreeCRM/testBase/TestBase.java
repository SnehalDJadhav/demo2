package com.visionIt.FreeCRM.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	static String PropPath="E:\\java\\CompanyMavanProjectDemo\\src\\main"
			+ "\\java\\com\\Vision\\FreeCrm\\TestData\\freeCrm.properties";
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	
	{
		File fs=new File(PropPath);
		try {
			FileInputStream fis=new FileInputStream(fs);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void BrrSetUp(){
		
		String brname=prop.getProperty("BrowserName");
		String url=prop.getProperty("FreeCrmurl");
		
		if(brname.equals("ff")){
			driver=new FirefoxDriver();
			//driver.get("http://google.com");
			
		}
		else if(brname.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", 
					"E:\\Selenium_jar\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.get("http://gmail.com");
		}
		else if(brname.equals("ie")){
			System.setProperty("webdriver.ie.driver","E:\\java\\selenium jar\\driver path\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			//driver.get("http://facebook.com");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
}
	/*public static void main(String[] args) {
		System.out.println("main started");
		new TestBase().BrrSetUp();
		
	}*/
}
