package org.radio.checkboxevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxOperation {
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://omayo.blogspot.com/");
		 WebElement cb = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		 
		 System.out.println("disp" + cb.isDisplayed());
		 System.out.println("enab"+ cb.isEnabled());
		 
		 cb.click();
		 
		 System.out.println("selec" + cb.isSelected());
		 
	}

}
