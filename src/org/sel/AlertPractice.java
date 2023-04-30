package org.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlertPractice {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		//WebElement simple = driver.findElement(By.id("accept"));
		//simple.click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		//WebElement confirm = driver.findElement(By.id("confirm"));
		//confirm.click();
		//driver.switchTo().alert().accept();
		
		WebElement prompt = driver.findElement(By.id("prompt"));
		prompt.click();
		driver.switchTo().alert().sendKeys("a");
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File pic = t.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\Selenium workspace\\Selenium\\Scrrenshot.output.jpeg");
		FileHandler.copy(pic, f);
		
	}

}
