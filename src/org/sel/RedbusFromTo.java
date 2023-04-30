package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusFromTo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/ ");
		
		WebElement from = driver.findElement(By.xpath("//input[@id ='src']"));
		from.sendKeys("Chennai");
		
		WebElement to = driver.findElement(By.xpath("//*[@tabindex='2']"));
		to.sendKeys("Madurai");
		
		//WebElement search = driver.findElement(By.linkText("Search Buses"));
		//search.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
