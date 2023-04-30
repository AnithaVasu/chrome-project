package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.className("gLFyf"));
		
		search.sendKeys("FaceBook");
		
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		
		searchbutton.click();
		
		driver.quit();
		
		
	}

}
