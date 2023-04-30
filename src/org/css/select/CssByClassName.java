package org.css.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssByClassName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY4MTYwMjM2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
//		password.sendKeys("45678");
//		
//		WebElement login = driver.findElement(By.cssSelector("button[name*='log']"));
//		login.click();

	//	WebElement startswith = driver.findElement(By.cssSelector("input[name^='em']"));
	//	startswith.sendKeys("reka");

		WebElement endswith = driver.findElement(By.cssSelector("input[type$='word']"));
		endswith.sendKeys("234567");
	}

}
