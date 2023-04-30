package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocators {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailadd = driver.findElement(By.xpath("//input[@type='text']"));
		
		emailadd.sendKeys("anithavasudevan1238@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@name='pass']"));
		
		password.sendKeys("1521541");
		
		WebElement login = driver.findElement(By.xpath("//*[@name='login']"));
		
		login.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
