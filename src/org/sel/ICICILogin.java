package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICILogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement username = driver.findElement(By.xpath("//*[@type='text']"));
		
		username.sendKeys("Anitha");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("dsdsads");
		
		driver.close();
		
		
	}

}
