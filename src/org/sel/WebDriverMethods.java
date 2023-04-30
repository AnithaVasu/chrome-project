package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		//String currenturl = driver.getCurrentUrl();
		
		//System.out.println(currenturl);
		
		
		
	}

}