package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractise {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("login_page");
		
		WebElement loginpage = driver.findElement(By.xpath("//*[@name='login_page']"));
		//loginpage.sendKeys("1124541");
		WebDriver as = driver.switchTo().frame(loginpage);
		
		
	}

}
