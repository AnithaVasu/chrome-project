package org.scrshot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandScrollUp {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy('0','6000')");
		
		js.executeScript("window.scrollBy('0','-6000')");
		
	}

}
