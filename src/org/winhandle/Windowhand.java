package org.winhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhand {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/windows");
		
		//String single = driver.getWindowHandle();
		//System.out.println(single);
		
		WebElement mulwe =driver.findElement(By.id("multi"));
		mulwe.click();
		Set<String> mul = driver.getWindowHandles();
		List<Object> li =new ArrayList();
		
		 li.addAll(mul);
		 
		 for(int i =0;i< li.size(); i++) {
			 if (i==1) {
				 driver.switchTo().window((String) li.get(i));
				 driver.findElement(By.id("accept")).click();
				 
			 }
		
				
		
			
			
		}
		
		
	}
	

}
