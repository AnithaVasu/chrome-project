package org.scrshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SearchPhoneScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	
		WebElement mob = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		mob.click();
		
		WebElement clickmob=driver.findElement(By.xpath("//*[@class='s-image'])"));
		clickmob.click();
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File in = t.getScreenshotAs(OutputType.FILE);
		
		File To_Eclipse = new File("D:\\Selenium workspace\\Selenium\\selenium");
		
		FileHandler.copy(in, To_Eclipse);
		
		
		
		
	}

}
