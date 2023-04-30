package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/ ");
		
		WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
		userid.sendKeys("125646");
		
		driver.close();
	}

}
