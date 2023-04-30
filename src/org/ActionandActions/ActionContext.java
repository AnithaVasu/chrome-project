package org.ActionandActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionContext {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/?utm_source=mediaxpedia_846&utm_campaign=1&utm_content=mediaxpedia_846&gclid=Cj0KCQiArsefBhCbARIsAP98hXQ06wqLHG0HKDk2hvWyg5Q1EVmjCecO8hi8jdDQYxxVReEBIC743wgaAjuJEALw_wcB");
		//WebElement rightclick = driver.findElement(By.xpath("//*[@class='catText']"));
		Actions a = new Actions(driver);
		//a.contextClick(rightclick).perform();
		
		//a.doubleClick(rightclick).perform();
		
		//a.moveToElement(rightclick).perform();
		
		WebElement mouse1 = driver.findElement(By.xpath("//*[@class='catText']"));
		WebElement mouse2 = driver.findElement(By.xpath("//*[text()='Casual Shoes'])[1]"));
		
		a.moveToElement(mouse1).perform();
		a.moveToElement(mouse2).perform();
		
	}

}
