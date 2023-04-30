package org.radio.checkboxevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonOperation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement rafio= driver.findElement(By.cssSelector("input[id='radio1']"));
		System.out.println("Dispalyed:" + rafio.isDisplayed());
		
		System.out.println("Enabled" + rafio.isEnabled());
		
		rafio.click();
		
		System.out.println("Selected"+ rafio.isSelected());
		
	}

}
