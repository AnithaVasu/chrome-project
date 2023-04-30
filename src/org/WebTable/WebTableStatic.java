package org.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableStatic {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\driver2\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		//ops.addArguments("--remote-allow-origins=*"); 
		driver.get("https://omayo.blogspot.com/");
		
		WebElement table =driver.findElement(By.xpath("//*[@id=\"table1\"]"));
		
		List <WebElement> header = table.findElements(By.tagName("th"));
		int head = header.size();
		for(WebElement headtext:header) {
			System.out.println(headtext.getText());
		}
		
		WebElement data = driver.findElement(By.xpath("//*[@id='table1']//tr[4]//td[2]"));
		System.out.println(data.getText());
	}
}
